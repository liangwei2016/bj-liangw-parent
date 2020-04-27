package com.liangw.mapper;

import com.liangw.pojo.Certificate;
import com.liangw.pojo.CertificateExample;
import org.springframework.stereotype.Repository;

/**
 * CertificateMapper继承基类
 */
@Repository
public interface CertificateMapper extends MyBatisBaseDao<Certificate, Long, CertificateExample> {
}