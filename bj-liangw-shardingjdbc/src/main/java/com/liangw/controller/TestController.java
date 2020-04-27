package com.liangw.controller;

import com.liangw.pojo.Certificate;
import com.liangw.service.CertificateService;
import com.liangw.util.ResponseApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author liangw
 * @Date 2020/4/26 14:49
 * @Version 1.0
 **/
@RestController
public class TestController {

    @Autowired
    private CertificateService certificateService;

    @GetMapping(path = "/saveCert")
    public ResponseApi saveCert(){
        Certificate record = new Certificate();
        record.setOrgId((long)1);
        record.setTempId((long)1);
        record.setCreateTime(new Date());
        record.setUpdateTime(new Date());
        int result  =  certificateService.addCert(record);
        return ResponseApi.success().add("result",result);
    }
}
