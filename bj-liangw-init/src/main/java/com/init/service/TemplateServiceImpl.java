package com.init.service;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.lang.Console;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.json.JSONUtil;
import com.init.dao.CertificateTemplateMapper;
import com.init.dao.CertificateTemplateSysMapper;
import com.init.pojo.CertificateTemplate;
import com.init.pojo.CertificateTemplateSys;
import com.init.pojo.TemplateExtPojo;
import com.init.util.ObsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static cn.hutool.core.convert.Convert.*;

/**
 * @ClassName Organization
 * @Description TODO
 * @Author liangw
 * @Date 2020/6/8 15:22
 * @Version 1.0
 **/
@Service
public class TemplateServiceImpl implements  TemplateService {

    @Autowired
    CertificateTemplateMapper templateMapper;

    @Autowired
    CertificateTemplateSysMapper sysTemplateSysMapper;


    @Autowired
    ObsUtil obsUtil;

    @Override
    public void initTemplate() throws IOException {
//        List<CertificateTemplate> templates = templateMapper.selectByExampleWithBLOBs(null);
//        for (CertificateTemplate record: templates ) {
//            Console.log("记录：==============》"+record.getTempId());
//            if(record.getTempId()==2528){
//                continue;
//            }
//            String imageUrl = record.getImage().replaceAll("https://eidc2020.obs.cn-north-4.myhuaweicloud.com/","");
//            System.out.println(imageUrl);
//            InputStream inputStream = obsUtil.downloadData(imageUrl, "");
//            BufferedImage read = ImageIO.read(inputStream);
//            int height = read.getHeight(null);
//            int width = read.getWidth(null);
//            int count  = 0;
//            int zcount = 0;
//            List<TemplateExtPojo> pojos = JSONUtil.toList(JSONUtil.parseArray(record.getExtention()), TemplateExtPojo.class);
//            List<TemplateExtPojo> pojoin = new ArrayList<>();
//            if(width >= height){  //横向
//                for (TemplateExtPojo pojo: pojos) {
//                    Double jc_heng = toDouble(width);
//                   // Double jc_zong = toDouble(height);
//                    Double left = toDouble(pojo.getLeft());
//                    Double top = toDouble(pojo.getTop());
//                    Console.log("调整前:"+left+"   "+top);
//                    left = ((680.0 * left)/ jc_heng);
//                    top = ((680.0 * top)/ jc_heng);
//
//                    Console.log("后:"+swatch(left)+"   "+swatch(top));
//                    pojo.setLeft(Convert.toStr(swatch(left)));
//                    pojo.setTop(Convert.toStr(swatch(top)));
//                    Console.log("count"+ count++);
//                    pojoin.add(pojo);
//                }
//                record.setExtention(JSONUtil.toJsonStr(pojoin));
//                int i = templateMapper.updateByPrimaryKeyWithBLOBs(record);
//                System.out.println("更新记录为:"+i);
//            }else{  //纵向
//                for (TemplateExtPojo pojo: pojos) {
////                    Double jc_heng = toDouble(width);
//                     Double jc_zong = toDouble(height);
//                    Double left = toDouble(pojo.getLeft());
//                    Double top = toDouble(pojo.getTop());
//                    Console.log("调整前:"+left+"   "+top);
//                    left = ((500.0 * left)/ jc_zong);
//                    top = ((500.0 * top)/ jc_zong);
//                    Console.log("后:"+swatch(left)+"   "+swatch(top));
//                    pojo.setLeft(Convert.toStr(swatch(left)));
//                    pojo.setTop(Convert.toStr(swatch(top)));
//                    Console.log("count"+ count++);
//                    record.setExtention(JSONUtil.toJsonStr(pojo));
//                    Console.log("zcount"+ zcount++);
//                }
//                record.setExtention(JSONUtil.toJsonStr(pojos));
//                int i = templateMapper.updateByPrimaryKeyWithBLOBs(record);
//                System.out.println(i);
//            }
//
//        }


    }

    @Override
    public void initTemplateSys() throws IOException {
        List<CertificateTemplateSys> templates = sysTemplateSysMapper.selectByExampleWithBLOBs(null);
        for (CertificateTemplateSys record: templates ) {
            Console.log("记录：==============》"+record.getTempId());
            String imageUrl = record.getImage().replaceAll("https://eidc2020.obs.cn-north-4.myhuaweicloud.com/","");
            System.out.println(imageUrl);
            InputStream inputStream = obsUtil.downloadData(imageUrl, "");
            BufferedImage read = ImageIO.read(inputStream);
            int height = read.getHeight(null);
            int width = read.getWidth(null);
            int count  = 0;
            int zcount = 0;
            List<TemplateExtPojo> pojos = JSONUtil.toList(JSONUtil.parseArray(record.getExtention()), TemplateExtPojo.class);
            List<TemplateExtPojo> pojoin = new ArrayList<>();
            if(width >= height){  //横向
                for (TemplateExtPojo pojo: pojos) {
                    Double jc_heng = toDouble(width);
                    // Double jc_zong = toDouble(height);
                    Double left = toDouble(pojo.getLeft());
                    Double top = toDouble(pojo.getTop());
                    Console.log("调整前:"+left+"   "+top);
                    left = ((680.0 * left)/ jc_heng);
                    top = ((680.0 * top)/ jc_heng);

//                    Console.log("后:"+swatch(left)+"   "+swatch(top));
                    pojo.setLeft(Convert.toStr(Convert.toFloat(swatch(left))-20));
                    pojo.setTop(Convert.toStr(Convert.toFloat(swatch(top))-23));
                    Console.log("count"+ count++);
                    pojoin.add(pojo);
                }
                record.setExtention(JSONUtil.toJsonStr(pojoin));
                int i = sysTemplateSysMapper.updateByPrimaryKeyWithBLOBs(record);
                System.out.println("更新记录为:"+i);
            }else{  //纵向
                for (TemplateExtPojo pojo: pojos) {
//                    Double jc_heng = toDouble(width);
                    Double jc_zong = toDouble(height);
                    Double left = toDouble(pojo.getLeft());
                    Double top = toDouble(pojo.getTop());
                    Console.log("调整前:"+left+"   "+top);
                    left = ((500.0 * left)/ jc_zong);
                    top = ((500.0 * top)/ jc_zong);
//                    Console.log("后:"+swatch(left)+"   "+swatch(top));
                    pojo.setLeft(Convert.toStr(Convert.toFloat(swatch(left))-20));
                    pojo.setTop(Convert.toStr(Convert.toFloat(swatch(top))-23));
                    Console.log("count"+ count++);
                    record.setExtention(JSONUtil.toJsonStr(pojo));
                    Console.log("zcount"+ zcount++);
                }
                record.setExtention(JSONUtil.toJsonStr(pojos));
                int i = sysTemplateSysMapper.updateByPrimaryKeyWithBLOBs(record);
                System.out.println(i);
            }
        }
    }



    public BigDecimal swatch(Double param){
        BigDecimal data = toBigDecimal(param);
        return data.setScale(4,BigDecimal.ROUND_HALF_UP);
    }

}
