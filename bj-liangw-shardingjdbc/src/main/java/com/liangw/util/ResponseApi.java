package com.liangw.util;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUtil;
import lombok.Data;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName ResponseApis
 * @Description 接口返回公共实体
 * @Author liangw
 * @Date 2020/3/3 15:40
 * @Version 1.0
 **/
@Data
public class ResponseApi {

    private String result;
    private String errorCode;
    private String resultDetail;
    private String resultTime;
    private Map<String, Object> data = new HashMap();

    public ResponseApi add(String key, Object value) {
        this.getData().put(key, value);
        return this;
    }

    public ResponseApi(String result, String errorCode, String resultDetail) {
        this.result = result;
        this.errorCode = errorCode;
        this.resultDetail = resultDetail;
        this.resultTime = DateUtil.format(new Date(), DatePattern.PURE_DATETIME_PATTERN);
    }

    public static ResponseApi success() {
        return new ResponseApi("SUCCESS","0000","成功！");
    }

    public static ResponseApi fail() {
        return new ResponseApi("ERROR","9999","异常！");
    }

}
