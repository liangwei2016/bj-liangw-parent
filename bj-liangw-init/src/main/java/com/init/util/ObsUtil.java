package com.init.util;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.util.StrUtil;
import cn.hutool.core.util.URLUtil;
import com.obs.services.ObsClient;
import com.obs.services.model.ObsObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName ObsTool
 * @Description TODO
 * @Author liangw
 * @Date 2020/4/22 18:00
 * @Version 1.0
 **/
@Component
public class ObsUtil {
    private Logger _log = LoggerFactory.getLogger(ObsUtil.class);
    @Value("${SYS.OBS.AK}")
    private String accessKey;

    @Value("${SYS.OBS.SK}")
    private String secretKey;

    @Value("${SYS.OBS.END_POINT}")
    private String endPoint;

    @Value("${SYS.OBS.BUCKET_NAME}")
    private String bucketName;

    @Value("${SYS.OBS.BUCKET_FILE_NAME}")
    private String bucketFileName;

    /**
     *  格式化源文件名
     * @param oldFileName
     * @return
     */
    public String  randomFileName(String oldFileName){
        String suffix =  StringUtils.getFilenameExtension(oldFileName);
        return  StrUtil.format("{}{}.{}",
                Convert.toStr(System.currentTimeMillis()).substring(4,13),
                Convert.toInt(((Math.random()*9+1)*1000)),
                suffix);
    }

    public String  randomImageName( String suffix){
        return  StrUtil.format("{}{}.{}",
                Convert.toStr(System.currentTimeMillis()).substring(4,13),
                Convert.toInt(((Math.random()*9+1)*1000)),
                suffix);
    }



    /**
     * 下载文件
     * @param fileName
     * @return
     */
    public Map<String, Object> download(String  fileName) {
        ObsClient obsClient = null;
        try{
            obsClient = new ObsClient(accessKey, secretKey, endPoint);
            ObsObject obsObject = obsClient.getObject(bucketName,  URLUtil.decode(fileName));
            String outFileName = fileName.substring(fileName.lastIndexOf('/')+1,fileName.length());
            Map<String,Object> map = new HashMap<>();
            map.put("outFileName",outFileName);
            map.put("objectContent",obsObject.getObjectContent());
            return map;
        }catch (Exception e){
            _log.error("文件下载异常：{}",e.getMessage());
//            throw new BizWarningException(StrUtil.format("文件下载异常：{}",e.getLocalizedMessage()));

        }finally {
            try {
                if(obsClient != null){
                    obsClient.close();
                }
            } catch (IOException e) {
                _log.error("文件下载关闭obsClient异常：{}",e.getMessage());
//                throw new BizWarningException(StrUtil.format("文件下载关闭obsClient异常：{}",e.getLocalizedMessage()));
            }
        }
        return null;
    }



    public InputStream downloadData(String  fileName,String db) {
        if(StrUtil.isBlank(db)){
            db = bucketName;
        }else{
            db = bucketFileName;
        }
        ObsClient obsClient = null;
        try{
            obsClient = new ObsClient(accessKey, secretKey, endPoint);
            ObsObject obsObject = obsClient.getObject(db,  fileName);
            return obsObject.getObjectContent();
        }catch (Exception e){
            _log.error("文件下载异常：{}",e.getMessage());
//            throw new BizWarningException(StrUtil.format("文件下载异常：{}",e.getLocalizedMessage()));

        }finally {
            try {
                if(obsClient != null){
                    obsClient.close();
                }
            } catch (IOException e) {
                _log.error("文件下载关闭obsClient异常：{}",e.getMessage());
//                throw new BizWarningException(StrUtil.format("文件下载关闭obsClient异常：{}",e.getLocalizedMessage()));
            }
        }
        return null;
    }
}
