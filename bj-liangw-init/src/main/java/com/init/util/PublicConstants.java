package com.init.util;


public class PublicConstants {
    //MS4密钥
    public static final String appKey = "774810150f46489e9e742558d0b11a70";
    public static final String encryptFactory = "74ed05d68beb4140";


    public static final String IDREG = "^\\d{15}$|^\\d{17}[0-9Xx]$";//
//    严格手机号^[1](([3][0-9])|([4][5-9])|([5][0-3,5-9])|([6][5,6])|([7][0-8])|([8][0-9])|([9][1,8,9]))[0-9]{8}$

    /**
     * 校验手机号
     */
    public static final String PHONE_REG = "^[1]([3-9])[0-9]{9}$";
    /**
     * 校验电话号码
     */
    public static final String TELEPHONE_REG = "^(\\d{3,4}[-|\\s]?)?\\d{7,8}$";
    /**
     * 校验URL
     */
    public static final String URL_REG = "(https?)://[-A-Za-z0-9+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]";
    /**
     * 校验URL
     */
    public static final String EMAIL_REG = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";

    public static final String XING = "*";
    public static final String ACCOUNTID = "accountId";
    public static final String BIZID = "bizId";
    public static final String OPERATELOG = "operate_log_";
    public static final String TYPE = "type";
    public static final String BILIANG = "B";
    public static final String ERROR = "-error";
    //    public static final String ERROR = "-" + DateUtil.getDateTime("yyyyMMddHH");
    public static final String ZHX = "-";
    public static final String XLSX = ".xlsx";
    public static final String ROWNUMBER = "ROW_NUMBER";
    public static final String CELLNAME = "CELL_NAME";
    public static final String ERRORMESSAGE = "ERROR_MESSAGE";
    public static final String EXCELLIST = "excelList";
    public static final String IMPORTTOTAL = "importTotal";
    public static final String IMPORTERRTOTAL = "importErrTotal";
    public static final String IMPORTERRLIST = "importErrList";
    public static final String FILENAME = "fileName";
    public static final String INFO = "info";
    public static final String SUCCESS = "SUCCESS";
    public static final String MY = "my";
    public static final String CNNAME = "cnName";
    public static final String CNVALUE = "cnValue";


    public static final String STATIC = "static";


    public static final String CLASSPATH = "classpath:";

    public static final String STARTSIZE = "startSize";
    public static final String TOTAL = "total";
    public static final String TOTALTEMP = "totalTemp";
    public static final String TOTALPAGES = "totalPages";
    public static final String PAGE = "page";
    public static final String PAGESIZE = "pageSize";
    public static final String LIST = "list";
    public static final String SIZE = "size";

    public static final String IDCARD = "idCard";
    public static final String PHONE = "phone";


    public static final String CERTTOTAL = "certTotal";
    public static final String CERTREAM = "certReam";
    public static final String STATIS = "status";
    //    public static final String STATIS = "status";
    public static final String ORDERBY = "orderBy";
    public static final String ORGID = "orgId";
    public static final String TEMPID = "tempId";
    public static final String COUNT = "count";
    public static final String LASTCOUNT = "lastCount";
    public static final String CERTID = "certId";
    public static final String USERID = "userId";
    public static final String CERTIMGURL = "certImgUrl";
    public static final String THUMBIMGURL = "thumbImgUrl";
    public static final String URL = "url";
    public static final String THUMB = "thumb";
    public static final String EXTENTION = "extention";
    public static final String ATTCH = "attch";
    public static final String DETAIL = "detail";
    public static final String RESULT = "result";
    public static final String CREATETIME = "createTime";
    public static final String OPERATE = "operate";
    public static final String DANGEFAZHENG = "单个发证";
    public static final String PILIANGFAZHENG = "批量发证";
    public static final String SUCCESSSIZE = "successSize";
    public static final String TABLENAME = "tableName";
    public static final String CLEARINTERVAL = "clearInterval";
    public static final String SCOPE = "scope";

    /**
     * es索引名
     */
    public static final String INDEX_NAME = "certificate_index";

    /**
     * es类型名，高版本es已经逐渐废弃类型概念，默认为_doc
     */
    public static final String TYPE_NAME = "certificate";



}
