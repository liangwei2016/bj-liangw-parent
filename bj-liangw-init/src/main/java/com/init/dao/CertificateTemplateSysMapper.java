package com.init.dao;

import com.init.pojo.CertificateTemplateSys;
import com.init.pojo.CertificateTemplateSysExample;
import org.springframework.stereotype.Repository;

/**
 * CertificateTemplateSysMapper继承基类
 */
@Repository
public interface CertificateTemplateSysMapper extends MyBatisBaseDao<CertificateTemplateSys, Long, CertificateTemplateSysExample> {
}