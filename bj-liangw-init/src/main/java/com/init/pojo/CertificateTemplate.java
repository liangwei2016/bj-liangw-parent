package com.init.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * certificate_template
 * @author 
 */
public class CertificateTemplate extends CertificateTemplateKey implements Serializable {
    /**
     * 证书主题
     */
    private String subject;

    /**
     * 模板类型：1资格证书  2荣誉证书 3会员证书 4培训证书 5其他
     */
    private String type;

    /**
     * 主题字体
     */
    private Integer subjectFont;

    /**
     * 主题字体大小
     */
    private Integer subjectSize;

    /**
     * 主题位置
     */
    private Integer subjectPostion;

    /**
     * 背景图片地址
     */
    private String image;

    /**
     * 背景缩略图
     */
    private String thumbnail;

    /**
     * 模板预览图片地址
     */
    private String modeimg;

    /**
     * 批量导入excel模板地址
     */
    private String excelTemplate;

    /**
     * 备注
     */
    private String remark;

    /**
     * 该模板下的发证量
     */
    private Integer count;

    /**
     * 所属域： 1机构  2个人
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
     * 扩展属性
     */
    private String extention;

    private static final long serialVersionUID = 1L;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getSubjectFont() {
        return subjectFont;
    }

    public void setSubjectFont(Integer subjectFont) {
        this.subjectFont = subjectFont;
    }

    public Integer getSubjectSize() {
        return subjectSize;
    }

    public void setSubjectSize(Integer subjectSize) {
        this.subjectSize = subjectSize;
    }

    public Integer getSubjectPostion() {
        return subjectPostion;
    }

    public void setSubjectPostion(Integer subjectPostion) {
        this.subjectPostion = subjectPostion;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getModeimg() {
        return modeimg;
    }

    public void setModeimg(String modeimg) {
        this.modeimg = modeimg;
    }

    public String getExcelTemplate() {
        return excelTemplate;
    }

    public void setExcelTemplate(String excelTemplate) {
        this.excelTemplate = excelTemplate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
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
        CertificateTemplate other = (CertificateTemplate) that;
        return (this.getTempId() == null ? other.getTempId() == null : this.getTempId().equals(other.getTempId()))
            && (this.getOrgId() == null ? other.getOrgId() == null : this.getOrgId().equals(other.getOrgId()))
            && (this.getSubject() == null ? other.getSubject() == null : this.getSubject().equals(other.getSubject()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getSubjectFont() == null ? other.getSubjectFont() == null : this.getSubjectFont().equals(other.getSubjectFont()))
            && (this.getSubjectSize() == null ? other.getSubjectSize() == null : this.getSubjectSize().equals(other.getSubjectSize()))
            && (this.getSubjectPostion() == null ? other.getSubjectPostion() == null : this.getSubjectPostion().equals(other.getSubjectPostion()))
            && (this.getImage() == null ? other.getImage() == null : this.getImage().equals(other.getImage()))
            && (this.getThumbnail() == null ? other.getThumbnail() == null : this.getThumbnail().equals(other.getThumbnail()))
            && (this.getModeimg() == null ? other.getModeimg() == null : this.getModeimg().equals(other.getModeimg()))
            && (this.getExcelTemplate() == null ? other.getExcelTemplate() == null : this.getExcelTemplate().equals(other.getExcelTemplate()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCount() == null ? other.getCount() == null : this.getCount().equals(other.getCount()))
            && (this.getScope() == null ? other.getScope() == null : this.getScope().equals(other.getScope()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getExtention() == null ? other.getExtention() == null : this.getExtention().equals(other.getExtention()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTempId() == null) ? 0 : getTempId().hashCode());
        result = prime * result + ((getOrgId() == null) ? 0 : getOrgId().hashCode());
        result = prime * result + ((getSubject() == null) ? 0 : getSubject().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getSubjectFont() == null) ? 0 : getSubjectFont().hashCode());
        result = prime * result + ((getSubjectSize() == null) ? 0 : getSubjectSize().hashCode());
        result = prime * result + ((getSubjectPostion() == null) ? 0 : getSubjectPostion().hashCode());
        result = prime * result + ((getImage() == null) ? 0 : getImage().hashCode());
        result = prime * result + ((getThumbnail() == null) ? 0 : getThumbnail().hashCode());
        result = prime * result + ((getModeimg() == null) ? 0 : getModeimg().hashCode());
        result = prime * result + ((getExcelTemplate() == null) ? 0 : getExcelTemplate().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCount() == null) ? 0 : getCount().hashCode());
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
        sb.append(", subject=").append(subject);
        sb.append(", type=").append(type);
        sb.append(", subjectFont=").append(subjectFont);
        sb.append(", subjectSize=").append(subjectSize);
        sb.append(", subjectPostion=").append(subjectPostion);
        sb.append(", image=").append(image);
        sb.append(", thumbnail=").append(thumbnail);
        sb.append(", modeimg=").append(modeimg);
        sb.append(", excelTemplate=").append(excelTemplate);
        sb.append(", remark=").append(remark);
        sb.append(", count=").append(count);
        sb.append(", scope=").append(scope);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", extention=").append(extention);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}