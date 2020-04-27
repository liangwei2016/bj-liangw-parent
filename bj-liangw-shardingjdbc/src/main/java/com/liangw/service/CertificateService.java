package com.liangw.service;

import com.liangw.pojo.Certificate;

import java.util.List;

/**
 * @ClassName ICertificateService
 * @Description TODO
 * @Author liangw
 * @Date 2020/4/26 14:05
 * @Version 1.0
 **/
public interface CertificateService {

    List<Certificate>  queryList();

    int  addCert(Certificate record);
}
