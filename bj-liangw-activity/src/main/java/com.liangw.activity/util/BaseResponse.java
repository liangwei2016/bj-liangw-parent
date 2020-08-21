package com.liangw.activity.util;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName BaseResponse
 * @Description TODO
 * @Author liangw
 * @Date 2020/7/27 17:10
 * @Version 1.0
 **/
@Data
public class BaseResponse {

    private static final long serialVersionUID = 4580737268014842568L;

    private String code;
    private String msg;
    private Map<String, Object> data = new HashMap();

    public BaseResponse() {
        super();
    }

    public BaseResponse add(String key, Object value) {
        this.getData().put(key, value);
        return this;
    }

    public BaseResponse(String code,String msg) {
        this.code = code;
        this.msg = msg;
    }



    public static BaseResponse ok(String msg) {
        return new BaseResponse("00",msg);
    }

    public static BaseResponse ok() {
        return new BaseResponse("00","success");
    }

}
