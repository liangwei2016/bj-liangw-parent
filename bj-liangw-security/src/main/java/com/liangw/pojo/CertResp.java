package com.liangw.pojo;

import lombok.Data;

/**
 * @ClassName CertResp
 * @Description TODO
 * @Author liangw
 * @Date 2020/5/14 13:09
 * @Version 1.0
 **/
@Data
public class CertResp {
    private String certId;
    private boolean status;
    private String url;


//    public static void main(String[] args) {
//        List<CertResp> list = new ArrayList<>();
//        CertResp resp = new CertResp();
//        resp.setCertId("111");
//        resp.setStatus(true);
//        list.add(resp);
//        CertResp resp2 = new CertResp();
//        resp2.setCertId("111");
//        resp2.setStatus(true);
//        list.add(resp2);
//        System.out.println(JSONUtil.toJsonStr(ResponseApi.success(list)));
//    }
}
