package com.init.dao;

import com.init.pojo.CertificateTemplate;
import com.init.pojo.CertificateTemplateExample;
import com.init.pojo.CertificateTemplateKey;
import org.springframework.stereotype.Repository;

/**
 * CertificateTemplateMapper继承基类
 */
@Repository
public interface CertificateTemplateMapper extends MyBatisBaseDao<CertificateTemplate, CertificateTemplateKey, CertificateTemplateExample> {
}