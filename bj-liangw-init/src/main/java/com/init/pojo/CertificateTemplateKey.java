package com.init.pojo;

import java.io.Serializable;

/**
 * certificate_template
 * @author 
 */
public class CertificateTemplateKey implements Serializable {
    /**
     * 模板ID
     */
    private Long tempId;

    /**
     * 机构ID
     */
    private Long orgId;

    private static final long serialVersionUID = 1L;

    public Long getTempId() {
        return tempId;
    }

    public void setTempId(Long tempId) {
        this.tempId = tempId;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CertificateTemplateKey other = (CertificateTemplateKey) that;
        return (this.getTempId() == null ? other.getTempId() == null : this.getTempId().equals(other.getTempId()))
            && (this.getOrgId() == null ? other.getOrgId() == null : this.getOrgId().equals(other.getOrgId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTempId() == null) ? 0 : getTempId().hashCode());
        result = prime * result + ((getOrgId() == null) ? 0 : getOrgId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tempId=").append(tempId);
        sb.append(", orgId=").append(orgId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}