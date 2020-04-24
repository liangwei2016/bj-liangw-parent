package com.liangw.util;

import cn.hutool.core.util.URLUtil;
import com.obs.services.ObsClient;
import com.obs.services.model.HeaderResponse;
import com.obs.services.model.ObsBucket;
import com.obs.services.model.ObsObject;
import com.obs.services.model.PutObjectResult;

import javax.imageio.stream.FileImageOutputStream;
import java.io.*;

/**
 * @ClassName OBS_DEMO
 * @Description 华为OBS实例
 * @Author liangw
 * @Date 2020/4/15 11:28
 * @Version 1.0
 **/
public class OBS_DEMO {
    /**
     * 上传
     * @throws IOException
     */
    public void upload() throws IOException {
        ObsClient obsClient = new ObsClient("GRY4RPYSHBOIRWTKNRAQ", "0FLMK3q0uSuZpceTI5NWadc7zzVhzNcalswXc4hU", "obs.cn-north-4.myhuaweicloud.com");
        HeaderResponse response = obsClient.createBucket("eidc","aaa");
        ObsBucket obsBucket = new ObsBucket();
        obsBucket.setBucketName("eidc");
        String objectKey = "2020/04/16/1.jpg";
        InputStream inputStream = new FileInputStream("D:\\1.jpg");
        PutObjectResult putObjectResult = obsClient.putObject("eidc", objectKey, inputStream);
        String url = putObjectResult.getObjectUrl();
        System.out.println(URLUtil.decode(url));
        inputStream.close();
        obsClient.close();
    }

    /**
     * 下载
     * @throws IOException
     */
    public void dowdnload() throws IOException {
        final ObsClient obsClient = new ObsClient("GRY4RPYSHBOIRWTKNRAQ", "0FLMK3q0uSuZpceTI5NWadc7zzVhzNcalswXc4hU", "obs.cn-north-4.myhuaweicloud.com");
        ObsObject obsObject = obsClient.getObject("eidc", "2020/04/16/1.jpg");
        System.out.println("Object content:");
        InputStream input = obsObject.getObjectContent();
        byte[] b = new byte[1024];
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        int len;
        while ((len=input.read(b)) != -1){
            bos.write(b, 0, len);
        }
        System.out.println(new String(bos.toByteArray()));

        FileImageOutputStream imageOutput = new FileImageOutputStream(new File("D:\\AAA\\3.jpg"));//打开输入流
        imageOutput.write(bos.toByteArray(), 0, bos.toByteArray().length);
        imageOutput.close();
        bos.close();
        input.close();
    }

}
