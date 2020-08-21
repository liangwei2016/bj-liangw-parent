package com.init.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CertificateTemplateSysExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public CertificateTemplateSysExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTempIdIsNull() {
            addCriterion("temp_id is null");
            return (Criteria) this;
        }

        public Criteria andTempIdIsNotNull() {
            addCriterion("temp_id is not null");
            return (Criteria) this;
        }

        public Criteria andTempIdEqualTo(Long value) {
            addCriterion("temp_id =", value, "tempId");
            return (Criteria) this;
        }

        public Criteria andTempIdNotEqualTo(Long value) {
            addCriterion("temp_id <>", value, "tempId");
            return (Criteria) this;
        }

        public Criteria andTempIdGreaterThan(Long value) {
            addCriterion("temp_id >", value, "tempId");
            return (Criteria) this;
        }

        public Criteria andTempIdGreaterThanOrEqualTo(Long value) {
            addCriterion("temp_id >=", value, "tempId");
            return (Criteria) this;
        }

        public Criteria andTempIdLessThan(Long value) {
            addCriterion("temp_id <", value, "tempId");
            return (Criteria) this;
        }

        public Criteria andTempIdLessThanOrEqualTo(Long value) {
            addCriterion("temp_id <=", value, "tempId");
            return (Criteria) this;
        }

        public Criteria andTempIdIn(List<Long> values) {
            addCriterion("temp_id in", values, "tempId");
            return (Criteria) this;
        }

        public Criteria andTempIdNotIn(List<Long> values) {
            addCriterion("temp_id not in", values, "tempId");
            return (Criteria) this;
        }

        public Criteria andTempIdBetween(Long value1, Long value2) {
            addCriterion("temp_id between", value1, value2, "tempId");
            return (Criteria) this;
        }

        public Criteria andTempIdNotBetween(Long value1, Long value2) {
            addCriterion("temp_id not between", value1, value2, "tempId");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNull() {
            addCriterion("subject is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNotNull() {
            addCriterion("subject is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectEqualTo(String value) {
            addCriterion("subject =", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotEqualTo(String value) {
            addCriterion("subject <>", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThan(String value) {
            addCriterion("subject >", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("subject >=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThan(String value) {
            addCriterion("subject <", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThanOrEqualTo(String value) {
            addCriterion("subject <=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLike(String value) {
            addCriterion("subject like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotLike(String value) {
            addCriterion("subject not like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectIn(List<String> values) {
            addCriterion("subject in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotIn(List<String> values) {
            addCriterion("subject not in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectBetween(String value1, String value2) {
            addCriterion("subject between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotBetween(String value1, String value2) {
            addCriterion("subject not between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("`type` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`type` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("`type` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("`type` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("`type` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("`type` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("`type` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("`type` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("`type` like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("`type` not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("`type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("`type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("`type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("`type` not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andSubjectFontIsNull() {
            addCriterion("subject_font is null");
            return (Criteria) this;
        }

        public Criteria andSubjectFontIsNotNull() {
            addCriterion("subject_font is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectFontEqualTo(Integer value) {
            addCriterion("subject_font =", value, "subjectFont");
            return (Criteria) this;
        }

        public Criteria andSubjectFontNotEqualTo(Integer value) {
            addCriterion("subject_font <>", value, "subjectFont");
            return (Criteria) this;
        }

        public Criteria andSubjectFontGreaterThan(Integer value) {
            addCriterion("subject_font >", value, "subjectFont");
            return (Criteria) this;
        }

        public Criteria andSubjectFontGreaterThanOrEqualTo(Integer value) {
            addCriterion("subject_font >=", value, "subjectFont");
            return (Criteria) this;
        }

        public Criteria andSubjectFontLessThan(Integer value) {
            addCriterion("subject_font <", value, "subjectFont");
            return (Criteria) this;
        }

        public Criteria andSubjectFontLessThanOrEqualTo(Integer value) {
            addCriterion("subject_font <=", value, "subjectFont");
            return (Criteria) this;
        }

        public Criteria andSubjectFontIn(List<Integer> values) {
            addCriterion("subject_font in", values, "subjectFont");
            return (Criteria) this;
        }

        public Criteria andSubjectFontNotIn(List<Integer> values) {
            addCriterion("subject_font not in", values, "subjectFont");
            return (Criteria) this;
        }

        public Criteria andSubjectFontBetween(Integer value1, Integer value2) {
            addCriterion("subject_font between", value1, value2, "subjectFont");
            return (Criteria) this;
        }

        public Criteria andSubjectFontNotBetween(Integer value1, Integer value2) {
            addCriterion("subject_font not between", value1, value2, "subjectFont");
            return (Criteria) this;
        }

        public Criteria andSubjectSizeIsNull() {
            addCriterion("subject_size is null");
            return (Criteria) this;
        }

        public Criteria andSubjectSizeIsNotNull() {
            addCriterion("subject_size is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectSizeEqualTo(Integer value) {
            addCriterion("subject_size =", value, "subjectSize");
            return (Criteria) this;
        }

        public Criteria andSubjectSizeNotEqualTo(Integer value) {
            addCriterion("subject_size <>", value, "subjectSize");
            return (Criteria) this;
        }

        public Criteria andSubjectSizeGreaterThan(Integer value) {
            addCriterion("subject_size >", value, "subjectSize");
            return (Criteria) this;
        }

        public Criteria andSubjectSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("subject_size >=", value, "subjectSize");
            return (Criteria) this;
        }

        public Criteria andSubjectSizeLessThan(Integer value) {
            addCriterion("subject_size <", value, "subjectSize");
            return (Criteria) this;
        }

        public Criteria andSubjectSizeLessThanOrEqualTo(Integer value) {
            addCriterion("subject_size <=", value, "subjectSize");
            return (Criteria) this;
        }

        public Criteria andSubjectSizeIn(List<Integer> values) {
            addCriterion("subject_size in", values, "subjectSize");
            return (Criteria) this;
        }

        public Criteria andSubjectSizeNotIn(List<Integer> values) {
            addCriterion("subject_size not in", values, "subjectSize");
            return (Criteria) this;
        }

        public Criteria andSubjectSizeBetween(Integer value1, Integer value2) {
            addCriterion("subject_size between", value1, value2, "subjectSize");
            return (Criteria) this;
        }

        public Criteria andSubjectSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("subject_size not between", value1, value2, "subjectSize");
            return (Criteria) this;
        }

        public Criteria andSubjectPostionIsNull() {
            addCriterion("subject_postion is null");
            return (Criteria) this;
        }

        public Criteria andSubjectPostionIsNotNull() {
            addCriterion("subject_postion is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectPostionEqualTo(Integer value) {
            addCriterion("subject_postion =", value, "subjectPostion");
            return (Criteria) this;
        }

        public Criteria andSubjectPostionNotEqualTo(Integer value) {
            addCriterion("subject_postion <>", value, "subjectPostion");
            return (Criteria) this;
        }

        public Criteria andSubjectPostionGreaterThan(Integer value) {
            addCriterion("subject_postion >", value, "subjectPostion");
            return (Criteria) this;
        }

        public Criteria andSubjectPostionGreaterThanOrEqualTo(Integer value) {
            addCriterion("subject_postion >=", value, "subjectPostion");
            return (Criteria) this;
        }

        public Criteria andSubjectPostionLessThan(Integer value) {
            addCriterion("subject_postion <", value, "subjectPostion");
            return (Criteria) this;
        }

        public Criteria andSubjectPostionLessThanOrEqualTo(Integer value) {
            addCriterion("subject_postion <=", value, "subjectPostion");
            return (Criteria) this;
        }

        public Criteria andSubjectPostionIn(List<Integer> values) {
            addCriterion("subject_postion in", values, "subjectPostion");
            return (Criteria) this;
        }

        public Criteria andSubjectPostionNotIn(List<Integer> values) {
            addCriterion("subject_postion not in", values, "subjectPostion");
            return (Criteria) this;
        }

        public Criteria andSubjectPostionBetween(Integer value1, Integer value2) {
            addCriterion("subject_postion between", value1, value2, "subjectPostion");
            return (Criteria) this;
        }

        public Criteria andSubjectPostionNotBetween(Integer value1, Integer value2) {
            addCriterion("subject_postion not between", value1, value2, "subjectPostion");
            return (Criteria) this;
        }

        public Criteria andImageIsNull() {
            addCriterion("image is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("image is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(String value) {
            addCriterion("image =", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(String value) {
            addCriterion("image <>", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(String value) {
            addCriterion("image >", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("image >=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThan(String value) {
            addCriterion("image <", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("image <=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLike(String value) {
            addCriterion("image like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotLike(String value) {
            addCriterion("image not like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<String> values) {
            addCriterion("image in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<String> values) {
            addCriterion("image not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(String value1, String value2) {
            addCriterion("image between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("image not between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andThumbnailIsNull() {
            addCriterion("thumbnail is null");
            return (Criteria) this;
        }

        public Criteria andThumbnailIsNotNull() {
            addCriterion("thumbnail is not null");
            return (Criteria) this;
        }

        public Criteria andThumbnailEqualTo(String value) {
            addCriterion("thumbnail =", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailNotEqualTo(String value) {
            addCriterion("thumbnail <>", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailGreaterThan(String value) {
            addCriterion("thumbnail >", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailGreaterThanOrEqualTo(String value) {
            addCriterion("thumbnail >=", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailLessThan(String value) {
            addCriterion("thumbnail <", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailLessThanOrEqualTo(String value) {
            addCriterion("thumbnail <=", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailLike(String value) {
            addCriterion("thumbnail like", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailNotLike(String value) {
            addCriterion("thumbnail not like", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailIn(List<String> values) {
            addCriterion("thumbnail in", values, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailNotIn(List<String> values) {
            addCriterion("thumbnail not in", values, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailBetween(String value1, String value2) {
            addCriterion("thumbnail between", value1, value2, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailNotBetween(String value1, String value2) {
            addCriterion("thumbnail not between", value1, value2, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andModeimgIsNull() {
            addCriterion("modeimg is null");
            return (Criteria) this;
        }

        public Criteria andModeimgIsNotNull() {
            addCriterion("modeimg is not null");
            return (Criteria) this;
        }

        public Criteria andModeimgEqualTo(String value) {
            addCriterion("modeimg =", value, "modeimg");
            return (Criteria) this;
        }

        public Criteria andModeimgNotEqualTo(String value) {
            addCriterion("modeimg <>", value, "modeimg");
            return (Criteria) this;
        }

        public Criteria andModeimgGreaterThan(String value) {
            addCriterion("modeimg >", value, "modeimg");
            return (Criteria) this;
        }

        public Criteria andModeimgGreaterThanOrEqualTo(String value) {
            addCriterion("modeimg >=", value, "modeimg");
            return (Criteria) this;
        }

        public Criteria andModeimgLessThan(String value) {
            addCriterion("modeimg <", value, "modeimg");
            return (Criteria) this;
        }

        public Criteria andModeimgLessThanOrEqualTo(String value) {
            addCriterion("modeimg <=", value, "modeimg");
            return (Criteria) this;
        }

        public Criteria andModeimgLike(String value) {
            addCriterion("modeimg like", value, "modeimg");
            return (Criteria) this;
        }

        public Criteria andModeimgNotLike(String value) {
            addCriterion("modeimg not like", value, "modeimg");
            return (Criteria) this;
        }

        public Criteria andModeimgIn(List<String> values) {
            addCriterion("modeimg in", values, "modeimg");
            return (Criteria) this;
        }

        public Criteria andModeimgNotIn(List<String> values) {
            addCriterion("modeimg not in", values, "modeimg");
            return (Criteria) this;
        }

        public Criteria andModeimgBetween(String value1, String value2) {
            addCriterion("modeimg between", value1, value2, "modeimg");
            return (Criteria) this;
        }

        public Criteria andModeimgNotBetween(String value1, String value2) {
            addCriterion("modeimg not between", value1, value2, "modeimg");
            return (Criteria) this;
        }

        public Criteria andExcelTemplateIsNull() {
            addCriterion("excel_template is null");
            return (Criteria) this;
        }

        public Criteria andExcelTemplateIsNotNull() {
            addCriterion("excel_template is not null");
            return (Criteria) this;
        }

        public Criteria andExcelTemplateEqualTo(String value) {
            addCriterion("excel_template =", value, "excelTemplate");
            return (Criteria) this;
        }

        public Criteria andExcelTemplateNotEqualTo(String value) {
            addCriterion("excel_template <>", value, "excelTemplate");
            return (Criteria) this;
        }

        public Criteria andExcelTemplateGreaterThan(String value) {
            addCriterion("excel_template >", value, "excelTemplate");
            return (Criteria) this;
        }

        public Criteria andExcelTemplateGreaterThanOrEqualTo(String value) {
            addCriterion("excel_template >=", value, "excelTemplate");
            return (Criteria) this;
        }

        public Criteria andExcelTemplateLessThan(String value) {
            addCriterion("excel_template <", value, "excelTemplate");
            return (Criteria) this;
        }

        public Criteria andExcelTemplateLessThanOrEqualTo(String value) {
            addCriterion("excel_template <=", value, "excelTemplate");
            return (Criteria) this;
        }

        public Criteria andExcelTemplateLike(String value) {
            addCriterion("excel_template like", value, "excelTemplate");
            return (Criteria) this;
        }

        public Criteria andExcelTemplateNotLike(String value) {
            addCriterion("excel_template not like", value, "excelTemplate");
            return (Criteria) this;
        }

        public Criteria andExcelTemplateIn(List<String> values) {
            addCriterion("excel_template in", values, "excelTemplate");
            return (Criteria) this;
        }

        public Criteria andExcelTemplateNotIn(List<String> values) {
            addCriterion("excel_template not in", values, "excelTemplate");
            return (Criteria) this;
        }

        public Criteria andExcelTemplateBetween(String value1, String value2) {
            addCriterion("excel_template between", value1, value2, "excelTemplate");
            return (Criteria) this;
        }

        public Criteria andExcelTemplateNotBetween(String value1, String value2) {
            addCriterion("excel_template not between", value1, value2, "excelTemplate");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andScopeIsNull() {
            addCriterion("`scope` is null");
            return (Criteria) this;
        }

        public Criteria andScopeIsNotNull() {
            addCriterion("`scope` is not null");
            return (Criteria) this;
        }

        public Criteria andScopeEqualTo(Integer value) {
            addCriterion("`scope` =", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotEqualTo(Integer value) {
            addCriterion("`scope` <>", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeGreaterThan(Integer value) {
            addCriterion("`scope` >", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeGreaterThanOrEqualTo(Integer value) {
            addCriterion("`scope` >=", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeLessThan(Integer value) {
            addCriterion("`scope` <", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeLessThanOrEqualTo(Integer value) {
            addCriterion("`scope` <=", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeIn(List<Integer> values) {
            addCriterion("`scope` in", values, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotIn(List<Integer> values) {
            addCriterion("`scope` not in", values, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeBetween(Integer value1, Integer value2) {
            addCriterion("`scope` between", value1, value2, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotBetween(Integer value1, Integer value2) {
            addCriterion("`scope` not between", value1, value2, "scope");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}