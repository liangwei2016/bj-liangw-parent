package com.liangw.service;

import com.liangw.mapper.CertificateMapper;
import com.liangw.pojo.Certificate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName CertificateServiceImpl
 * @Description TODO
 * @Author liangw
 * @Date 2020/4/26 14:06
 * @Version 1.0
 **/
@Service
public class CertificateServiceImpl implements CertificateService {

    @Autowired
    CertificateMapper certificateMapper;

    @Override
    public List<Certificate> queryList() {
        return certificateMapper.selectByExample(null);
    }

    @Override
    public int addCert(Certificate record) {
        return certificateMapper.insertSelective(record);
    }
}
