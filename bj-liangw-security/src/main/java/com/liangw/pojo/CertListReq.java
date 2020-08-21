package com.liangw.pojo;

import cn.hutool.json.JSONUtil;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CertReq
 * @Description TODO
 * @Author liangw
 * @Date 2020/5/14 11:34
 * @Version 1.0
 **/
@Data
public class CertListReq {
    private String orgId;
    private String accountId;
    private String tempId;
    private String bizId;
    private List<CertificatePojo> list;


    public static void main(String[] args) {
        List<CertificatePojo> list = new ArrayList<>();
        CertificatePojo pojo = new CertificatePojo();
        pojo.setCertId("11");
        pojo.setExtention("[{\"type\":\"B\",\"key\":\"hygiene_firm\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"单位名称\",\"cnValue\":\"中国人民解放军总医院\",\"size\":\"20\",\"display\":\"2\",\"format\":\"\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(186, 106, 106)\",\"fontStyle\":\"normal\",\"centerX\":false,\"left\":46,\"top\":157,\"styleStr\":\"font-family:Source Han Sans CN;left:46px;top:157px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(186, 106, 106);font-style:normal\",\"$$hashKey\":\"object:153\"},{\"type\":\"B\",\"key\":\"cert_code\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"统一身份信用代码\",\"cnValue\":\"11100000000013063F\",\"size\":\"20\",\"display\":\"2\",\"format\":\"\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(21, 6, 6)\",\"fontStyle\":\"normal\",\"centerX\":false,\"left\":204,\"top\":248,\"styleStr\":\"font-family:Source Han Sans CN;left:204px;top:248px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(21, 6, 6);font-style:normal\",\"$$hashKey\":\"object:156\"},{\"type\":\"B\",\"key\":\"num\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"编号\",\"cnValue\":\"001\",\"size\":\"20\",\"display\":\"2\",\"format\":\"\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(225, 81, 81)\",\"fontStyle\":\"normal\",\"centerX\":false,\"left\":408,\"top\":180,\"styleStr\":\"font-family:Source Han Sans CN;left:408px;top:180px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(225, 81, 81);font-style:normal\",\"$$hashKey\":\"object:159\"},{\"type\":\"B\",\"key\":\"family_checkdate\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"颁发日期\",\"cnValue\":\"2020-02-02\",\"size\":\"20\",\"display\":\"2\",\"format\":\"\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(210, 23, 23)\",\"fontStyle\":\"normal\",\"centerX\":false,\"left\":253,\"top\":187,\"styleStr\":\"font-family:Source Han Sans CN;left:253px;top:187px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(210, 23, 23);font-style:normal\",\"$$hashKey\":\"object:162\"},{\"type\":\"C\",\"key\":\"qrcode\",\"left\":288,\"top\":29,\"width\":\"250\",\"height\":\"250\",\"colorDark\":\"#000000\",\"colorLight\":\"#ffffff\",\"cnValue\":\"http://eidledger.com\"}]");
        list.add(pojo);

        CertificatePojo pojo2 = new CertificatePojo();
        pojo2.setCertId("22");
        pojo2.setExtention("[{\"type\":\"B\",\"key\":\"hygiene_firm\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"单位名称\",\"cnValue\":\"中国人民解放军总医院\",\"size\":\"20\",\"display\":\"2\",\"format\":\"\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(186, 106, 106)\",\"fontStyle\":\"normal\",\"centerX\":false,\"left\":46,\"top\":157,\"styleStr\":\"font-family:Source Han Sans CN;left:46px;top:157px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(186, 106, 106);font-style:normal\",\"$$hashKey\":\"object:153\"},{\"type\":\"B\",\"key\":\"cert_code\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"统一身份信用代码\",\"cnValue\":\"11100000000013063F\",\"size\":\"20\",\"display\":\"2\",\"format\":\"\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(21, 6, 6)\",\"fontStyle\":\"normal\",\"centerX\":false,\"left\":204,\"top\":248,\"styleStr\":\"font-family:Source Han Sans CN;left:204px;top:248px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(21, 6, 6);font-style:normal\",\"$$hashKey\":\"object:156\"},{\"type\":\"B\",\"key\":\"num\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"编号\",\"cnValue\":\"001\",\"size\":\"20\",\"display\":\"2\",\"format\":\"\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(225, 81, 81)\",\"fontStyle\":\"normal\",\"centerX\":false,\"left\":408,\"top\":180,\"styleStr\":\"font-family:Source Han Sans CN;left:408px;top:180px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(225, 81, 81);font-style:normal\",\"$$hashKey\":\"object:159\"},{\"type\":\"B\",\"key\":\"family_checkdate\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"颁发日期\",\"cnValue\":\"2020-02-02\",\"size\":\"20\",\"display\":\"2\",\"format\":\"\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(210, 23, 23)\",\"fontStyle\":\"normal\",\"centerX\":false,\"left\":253,\"top\":187,\"styleStr\":\"font-family:Source Han Sans CN;left:253px;top:187px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(210, 23, 23);font-style:normal\",\"$$hashKey\":\"object:162\"},{\"type\":\"C\",\"key\":\"qrcode\",\"left\":288,\"top\":29,\"width\":\"250\",\"height\":\"250\",\"colorDark\":\"#000000\",\"colorLight\":\"#ffffff\",\"cnValue\":\"http://eidledger.com\"}]");
        list.add(pojo2);

        CertListReq req = new CertListReq();
        req.setTempId("41");
        req.setList(list);

        System.out.println(JSONUtil.toJsonStr(req));





    }

}
