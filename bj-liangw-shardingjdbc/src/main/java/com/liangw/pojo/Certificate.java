package com.liangw.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * certificate
 * @author 
 */
public class Certificate implements Serializable {
    /**
     * 证书ID
     */
    private Long certId;

    /**
     * 模板ID
     */
    private Long tempId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 机构ID
     */
    private Long orgId;

    /**
     * 证书主题
     */
    private String subject;

    /**
     * 模板类型：1资格证书  2荣誉证书 3会员证书 4培训证书 5其他
     */
    private Integer type;

    /**
     * 链上HASH
     */
    private String hash;

    /**
     * 持证人姓名
     */
    private String userName;

    /**
     * 持证人证件类型，1为身份证
     */
    private Integer userIdType;

    /**
     * 持证人证件号码
     */
    private String userNumber;

    /**
     * 持证人手机号
     */
    private String phoneNumber;

    /**
     * 证书状态：1使用中 2已注销
     */
    private Integer status;

    /**
     * 所属域：1机构  2个人
     */
    private Integer scope;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 扩展属性值，模块定义的扩展属性所对应的值
     */
    private String extention;

    private static final long serialVersionUID = 1L;

    public Long getCertId() {
        return certId;
    }

    public void setCertId(Long certId) {
        this.certId = certId;
    }

    public Long getTempId() {
        return tempId;
    }

    public void setTempId(Long tempId) {
        this.tempId = tempId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserIdType() {
        return userIdType;
    }

    public void setUserIdType(Integer userIdType) {
        this.userIdType = userIdType;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getScope() {
        return scope;
    }

    public void setScope(Integer scope) {
        this.scope = scope;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getExtention() {
        return extention;
    }

    public void setExtention(String extention) {
        this.extention = extention;
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
        Certificate other = (Certificate) that;
        return (this.getCertId() == null ? other.getCertId() == null : this.getCertId().equals(other.getCertId()))
            && (this.getTempId() == null ? other.getTempId() == null : this.getTempId().equals(other.getTempId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getOrgId() == null ? other.getOrgId() == null : this.getOrgId().equals(other.getOrgId()))
            && (this.getSubject() == null ? other.getSubject() == null : this.getSubject().equals(other.getSubject()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getHash() == null ? other.getHash() == null : this.getHash().equals(other.getHash()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserIdType() == null ? other.getUserIdType() == null : this.getUserIdType().equals(other.getUserIdType()))
            && (this.getUserNumber() == null ? other.getUserNumber() == null : this.getUserNumber().equals(other.getUserNumber()))
            && (this.getPhoneNumber() == null ? other.getPhoneNumber() == null : this.getPhoneNumber().equals(other.getPhoneNumber()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getScope() == null ? other.getScope() == null : this.getScope().equals(other.getScope()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getExtention() == null ? other.getExtention() == null : this.getExtention().equals(other.getExtention()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCertId() == null) ? 0 : getCertId().hashCode());
        result = prime * result + ((getTempId() == null) ? 0 : getTempId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getOrgId() == null) ? 0 : getOrgId().hashCode());
        result = prime * result + ((getSubject() == null) ? 0 : getSubject().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getHash() == null) ? 0 : getHash().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserIdType() == null) ? 0 : getUserIdType().hashCode());
        result = prime * result + ((getUserNumber() == null) ? 0 : getUserNumber().hashCode());
        result = prime * result + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getScope() == null) ? 0 : getScope().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getExtention() == null) ? 0 : getExtention().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", certId=").append(certId);
        sb.append(", tempId=").append(tempId);
        sb.append(", userId=").append(userId);
        sb.append(", orgId=").append(orgId);
        sb.append(", subject=").append(subject);
        sb.append(", type=").append(type);
        sb.append(", hash=").append(hash);
        sb.append(", userName=").append(userName);
        sb.append(", userIdType=").append(userIdType);
        sb.append(", userNumber=").append(userNumber);
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append(", status=").append(status);
        sb.append(", scope=").append(scope);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", extention=").append(extention);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}