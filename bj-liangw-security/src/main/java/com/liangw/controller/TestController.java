package com.liangw.controller;

import cn.hutool.core.lang.Console;
import cn.hutool.core.map.MapUtil;
import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import com.liangw.mq.MQSender;
import com.liangw.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author liangw
 * @Date 2020/5/17 21:16
 * @Version 1.0
 **/
@RestController
public class TestController {

    @Autowired
    MQSender mqSender;
    
    @GetMapping("/bath/{cert_num}")
    public String bathTest(@PathVariable int cert_num) {
        CertListReq reqs = new CertListReq();
        reqs.setOrgId("1008");
        reqs.setTempId("2802");
        reqs.setBizId(UUID.randomUUID().toString());
        reqs.setAccountId("222222");
        List<CertificatePojo> list  = new ArrayList();
        for (int i = 0; i < cert_num ; i++) {
            CertificatePojo pojo  = new CertificatePojo();
            pojo.setCertId(""+i);
//            pojo.setExtention("[{\"type\":\"B\",\"key\":\"phone\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"手机号\",\"cnValue\":\"166****3878\",\"size\":\"20\",\"display\":\"2\",\"format\":\"text\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"1\",\"left\":31.992416381835938,\"top\":197.99241638183594,\"styleStr\":\"font-family:Source Han Sans CN;left:31.992416381835938px;top:197.99241638183594px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:29\"},{\"type\":\"B\",\"key\":\"name\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"姓名\",\"cnValue\":\"张X\",\"size\":\"20\",\"display\":\"2\",\"format\":\"text\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"1\",\"left\":41,\"top\":156.99806213378906,\"styleStr\":\"font-family:Source Han Sans CN;left:41px;top:156.99806213378906px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:42\"},{\"type\":\"B\",\"key\":\"idcard\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"身份证号码\",\"cnValue\":\"110101********2818\",\"size\":\"20\",\"display\":\"2\",\"format\":\"text\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"1\",\"left\":0,\"top\":238.9981050491333,\"styleStr\":\"font-family:Source Han Sans CN;left:0px;top:238.9981050491333px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:46\"},{\"type\":\"B\",\"key\":\"num\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"编号\",\"cnValue\":\"001\",\"size\":\"20\",\"display\":\"2\",\"format\":\"text\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"1\",\"left\":5,\"top\":117,\"styleStr\":\"font-family:Source Han Sans CN;left:5px;top:117px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:50\"},{\"type\":\"B\",\"key\":\"family_checkdate\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"颁发日期\",\"cnValue\":\"2020-02-02\",\"size\":\"20\",\"display\":\"2\",\"format\":\"date\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"1\",\"left\":84,\"top\":92,\"styleStr\":\"font-family:Source Han Sans CN;left:84px;top:92px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:54\"},{\"type\":\"C\",\"key\":\"qrcode\",\"left\":543.9924163818359,\"top\":11,\"width\":\"100\",\"height\":\"100\",\"colorDark\":\"rgb(0,0,0)\",\"colorLight\":\"rgb(255,255,255)\",\"cnValue\":\"http://v2.eidop.cn:8890/txt/5fd724e23eb83b9ea58464d3c879ed74858c9ce29a0fadb5a235065fc4b72eab0176c0b130fd8c27\"}]");
//            pojo.setExtention("[{\"type\":\"B\",\"key\":\"phone\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"手机号\",\"cnValue\":\"166****3878\",\"size\":\"20\",\"display\":\"2\",\"format\":\"text\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"1\",\"left\":140,\"top\":150,\"styleStr\":\"font-family:Source Han Sans CN;left:140px;top:150px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:138\"},{\"type\":\"B\",\"key\":\"name\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"姓名\",\"cnValue\":\"张X\",\"size\":\"20\",\"display\":\"2\",\"format\":\"text\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"1\",\"left\":140,\"top\":196,\"styleStr\":\"font-family:Source Han Sans CN;left:140px;top:196px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:142\"},{\"type\":\"B\",\"key\":\"num\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"编号\",\"cnValue\":\"001\",\"size\":\"20\",\"display\":\"2\",\"format\":\"text\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"1\",\"left\":111,\"top\":263,\"styleStr\":\"font-family:Source Han Sans CN;left:111px;top:263px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:146\"},{\"type\":\"B\",\"key\":\"family_checkdate\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"颁发日期\",\"cnValue\":\"2020-02-02\",\"size\":\"20\",\"display\":\"2\",\"format\":\"date\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"1\",\"left\":129,\"top\":377,\"styleStr\":\"font-family:Source Han Sans CN;left:129px;top:377px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:150\"},{\"type\":\"B\",\"key\":\"hygiene_firm\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"单位名称\",\"cnValue\":\"中国人民解放军总医院\",\"size\":\"20\",\"display\":\"2\",\"format\":\"text\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"0\",\"left\":215,\"top\":328,\"styleStr\":\"font-family:Source Han Sans CN;left:215px;top:328px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:158\"},{\"type\":\"B\",\"key\":\"family_profe\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"职业\",\"cnValue\":\"医生\",\"size\":\"20\",\"display\":\"2\",\"format\":\"text\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"0\",\"left\":128,\"top\":308,\"styleStr\":\"font-family:Source Han Sans CN;left:128px;top:308px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:162\"},{\"type\":\"B\",\"key\":\"department\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"部门\",\"cnValue\":\"技术部\",\"size\":\"20\",\"display\":\"2\",\"format\":\"text\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"0\",\"left\":319,\"top\":139,\"styleStr\":\"font-family:Source Han Sans CN;left:319px;top:139px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:166\"},{\"type\":\"B\",\"key\":\"email\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"邮箱\",\"cnValue\":\"zhangsan@163.com\",\"size\":\"20\",\"display\":\"2\",\"format\":\"text\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"0\",\"left\":418,\"top\":282,\"styleStr\":\"font-family:Source Han Sans CN;left:418px;top:282px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:170\"},{\"type\":\"B\",\"key\":\"website\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"网址\",\"cnValue\":\"www.eidledger.com\",\"size\":\"20\",\"display\":\"2\",\"format\":\"text\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"0\",\"left\":192,\"top\":257,\"styleStr\":\"font-family:Source Han Sans CN;left:192px;top:257px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:174\"},{\"type\":\"B\",\"key\":\"wechat_no \",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"微信号\",\"cnValue\":\"zhangsan123\",\"size\":\"20\",\"display\":\"2\",\"format\":\"text\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"0\",\"left\":302,\"top\":194,\"styleStr\":\"font-family:Source Han Sans CN;left:302px;top:194px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:178\"},{\"type\":\"C\",\"key\":\"qrcode\",\"left\":\"298\",\"top\":\"10\",\"width\":\"100\",\"height\":\"100\",\"colorDark\":\"rgb(0,0,0)\",\"colorLight\":\"rgb(255,255,255)\",\"cnValue\":\"http://v2.eidop.cn:8890/txt/5fd724e23eb83b9ea58464d3c879ed74858c9ce29a0fadb5a235065fc4b72eab0176c0b130fd8c27\"}]");
          //  pojo.setExtention("[{\"type\":\"B\",\"key\":\"phone\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"手机号\",\"cnValue\":\"166****3878\",\"size\":\"20\",\"display\":\"2\",\"format\":\"text\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"1\",\"left\":0,\"top\":450,\"styleStr\":\"font-family:Source Han Sans CN;left:0px;top:450px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:116\"},{\"type\":\"B\",\"key\":\"name\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"姓名\",\"cnValue\":\"张X\",\"size\":\"20\",\"display\":\"2\",\"format\":\"text\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"1\",\"left\":0,\"top\":0,\"styleStr\":\"font-family:Source Han Sans CN;left:0px;top:0px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:120\"},{\"type\":\"B\",\"key\":\"family_checkdate\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"颁发日期\",\"cnValue\":\"2020-02-02\",\"size\":\"20\",\"display\":\"2\",\"format\":\"date\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"1\",\"left\":577,\"top\":450,\"styleStr\":\"font-family:Source Han Sans CN;left:577px;top:450px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:124\"},{\"type\":\"B\",\"key\":\"num\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"编号\",\"cnValue\":\"001\",\"size\":\"20\",\"display\":\"2\",\"format\":\"text\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"1\",\"left\":334.00001525878906,\"top\":274,\"styleStr\":\"font-family:Source Han Sans CN;left:334.00001525878906px;top:274px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:128\"},{\"type\":\"B\",\"key\":\"idcard\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"身份证号码\",\"cnValue\":\"110101********2818\",\"size\":\"20\",\"display\":\"2\",\"format\":\"text\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"1\",\"left\":494,\"top\":0,\"styleStr\":\"font-family:Source Han Sans CN;left:494px;top:0px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:132\"},{\"type\":\"C\",\"key\":\"txt\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"文本框\",\"cnValue\":\"获得慈善先锋荣誉\",\"size\":\"20\",\"display\":\"2\",\"format\":\"text\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":true,\"required\":\"0\",\"left\":278.00001525878906,\"top\":170,\"styleStr\":\"font-family:Source Han Sans CN;left:278.00001525878906px;top:170px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:140\"},{\"type\":\"B\",\"key\":\"sex\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"性别\",\"cnValue\":\"男\",\"size\":\"20\",\"display\":\"2\",\"format\":\"sex\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"0\",\"left\":343.00001525878906,\"top\":137,\"styleStr\":\"font-family:Source Han Sans CN;left:343.00001525878906px;top:137px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:144\"},{\"type\":\"B\",\"key\":\"hearth_work\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"工种\",\"cnValue\":\"经理\",\"size\":\"20\",\"display\":\"2\",\"format\":\"text\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"0\",\"left\":334.00001525878906,\"top\":237,\"styleStr\":\"font-family:Source Han Sans CN;left:334.00001525878906px;top:237px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:148\"},{\"type\":\"B\",\"key\":\"age\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"年龄\",\"cnValue\":\"23\",\"size\":\"20\",\"display\":\"2\",\"format\":\"text\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"0\",\"left\":340.00001525878906,\"top\":200,\"styleStr\":\"font-family:Source Han Sans CN;left:340.00001525878906px;top:200px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:152\"},{\"type\":\"B\",\"key\":\"family_rela\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"主或与户主关系\",\"cnValue\":\"户主\",\"size\":\"20\",\"display\":\"2\",\"format\":\"text\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"0\",\"left\":337.00001525878906,\"top\":103,\"styleStr\":\"font-family:Source Han Sans CN;left:337.00001525878906px;top:103px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:156\"},{\"type\":\"B\",\"key\":\"family_brithaddr\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"出生地\",\"cnValue\":\"北京市\",\"size\":\"20\",\"display\":\"2\",\"format\":\"text\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"0\",\"left\":176.00001525878906,\"top\":362,\"styleStr\":\"font-family:Source Han Sans CN;left:176.00001525878906px;top:362px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:160\"},{\"type\":\"B\",\"key\":\"family_oldname\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"曾用名\",\"cnValue\":\"三儿\",\"size\":\"20\",\"display\":\"2\",\"format\":\"text\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"0\",\"left\":326.00001525878906,\"top\":357,\"styleStr\":\"font-family:Source Han Sans CN;left:326.00001525878906px;top:357px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:164\"},{\"type\":\"B\",\"key\":\"family_nation\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"民族\",\"cnValue\":\"汉\",\"size\":\"20\",\"display\":\"2\",\"format\":\"text\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"0\",\"left\":333.00001525878906,\"top\":319,\"styleStr\":\"font-family:Source Han Sans CN;left:333.00001525878906px;top:319px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:168\"},{\"type\":\"C\",\"key\":\"qrcode\",\"left\":\"298\",\"top\":\"10\",\"width\":\"100\",\"height\":\"100\",\"colorDark\":\"rgb(0,0,0)\",\"colorLight\":\"rgb(255,255,255)\",\"cnValue\":\"http://t2.eidop.cn:18890/txt/5fd724e23eb83b9ea58464d3c879ed74858c9ce29a0fadb5a235065fc4b72eab0176c0b130fd8c27\"}]");
            pojo.setExtention("[{\"type\":\"B\",\"key\":\"phone\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"手机号\",\"cnValue\":\"166****3878\",\"size\":\"20\",\"display\":\"2\",\"format\":\"text\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"1\",\"left\":272.975357055664,\"top\":110.979152679443,\"styleStr\":\"font-family:Source Han Sans CN;left:272.97535705566406px;top:110.97915267944336px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:12\"},{\"type\":\"B\",\"key\":\"name\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"姓名\",\"cnValue\":\"张X\",\"size\":\"20\",\"display\":\"2\",\"format\":\"text\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"1\",\"left\":298.97346496582,\"top\":72.9867362976074,\"styleStr\":\"font-family:Source Han Sans CN;left:298.9734649658203px;top:72.98673629760742px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:16\"},{\"type\":\"B\",\"key\":\"idcard\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"身份证号码\",\"cnValue\":\"110101********2818\",\"size\":\"20\",\"display\":\"2\",\"format\":\"text\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"1\",\"left\":264.988632202148,\"top\":149.988613128662,\"styleStr\":\"font-family:Source Han Sans CN;left:264.98863220214844px;top:149.9886131286621px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:20\"},{\"type\":\"B\",\"key\":\"num\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"编号\",\"cnValue\":\"001\",\"size\":\"20\",\"display\":\"3\",\"format\":\"text\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"1\",\"left\":464.982925415039,\"top\":351.9772605896,\"styleStr\":\"font-family:Source Han Sans CN;left:464.98292541503906px;top:351.9772605895996px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:24\"},{\"type\":\"B\",\"key\":\"family_checkdate\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"颁发日期\",\"cnValue\":\"2020-02-02\",\"size\":\"20\",\"display\":\"3\",\"format\":\"date\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"1\",\"left\":412.984817504883,\"top\":391.977230072021,\"styleStr\":\"font-family:Source Han Sans CN;left:412.9848175048828px;top:391.9772300720215px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:28\"},{\"type\":\"C\",\"key\":\"photo\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"照片\",\"cnValue\":\"https://eidc88.obs.cn-north-4.myhuaweicloud.com/20110101/photo.jpg\",\"size\":\"20\",\"display\":\"2\",\"format\":\"img\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"0\",\"width\":71,\"height\":71,\"left\":184.984848022461,\"top\":73.9829483032227,\"styleStr\":\"font-family:Source Han Sans CN;left:184.98484802246094px;top:73.98294830322266px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:32\"},{\"type\":\"C\",\"key\":\"qrcode\",\"left\":126.969696044922,\"top\":242.975357055664,\"width\":\"100\",\"height\":\"100\",\"colorDark\":\"rgb(200, 27, 27)\",\"colorLight\":\"rgb(31, 177, 59)\",\"cnValue\":\"http://t2.eidop.cn:18890/txt/5fd724e23eb83b9ea58464d3c879ed74858c9ce29a0fadb5a235065fc4b72eab0176c0b130fd8c27\"}]");
            list.add(pojo);
        }
        reqs.setList(list);
        mqSender.send(JSONUtil.toJsonStr(reqs));
        Console.log("发送前时间:"+(new Date()).getTime());
        return "success";
    }


    @GetMapping("/one")
    public String oneTest() {
        CertOneReq reqs = new CertOneReq();
        reqs.setOrgId("1008");
        reqs.setTempId("2884");
//        reqs.setTempId("2801");
//        reqs.setTempId("2885");
        reqs.setBizId(UUID.randomUUID().toString());
        reqs.setAccountId("222222");
        reqs.setCertId("18199b375b3a4818a53ba836ba027f0c3");

        reqs.setExtention("[{\"type\":\"B\",\"key\":\"phone\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"手机号\",\"cnValue\":\"166****3878\",\"size\":\"20\",\"display\":\"2\",\"format\":\"text\",\"fontWeight\":\"bold\",\"textDecoration\":\"none\",\"color\":\"rgb(118, 224, 12)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"1\",\"left\":109,\"top\":341,\"styleStr\":\"font-family:Source Han Sans CN;left:109px;top:341px;font-size:20px;font-weight:bold;text-decoration:none;color:rgb(118, 224, 12);font-style:normal\",\"$$hashKey\":\"object:47\"},{\"type\":\"B\",\"key\":\"num\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"编号\",\"cnValue\":\"001\",\"size\":\"20\",\"display\":\"2\",\"format\":\"text\",\"fontWeight\":\"bold\",\"textDecoration\":\"none\",\"color\":\"rgb(118, 224, 12)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"1\",\"left\":115,\"top\":180,\"styleStr\":\"font-family:Source Han Sans CN;left:115px;top:180px;font-size:20px;font-weight:bold;text-decoration:none;color:rgb(118, 224, 12);font-style:normal\",\"$$hashKey\":\"object:51\"},{\"type\":\"B\",\"key\":\"family_checkdate\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"颁发日期\",\"cnValue\":\"2020-02-02\",\"size\":\"20\",\"display\":\"2\",\"format\":\"date\",\"fontWeight\":\"bold\",\"textDecoration\":\"none\",\"color\":\"rgb(118, 224, 12)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"1\",\"left\":266,\"top\":339,\"styleStr\":\"font-family:Source Han Sans CN;left:266px;top:339px;font-size:20px;font-weight:bold;text-decoration:none;color:rgb(118, 224, 12);font-style:normal\",\"$$hashKey\":\"object:55\"},{\"type\":\"C\",\"key\":\"qrcode\",\"left\":580,\"top\":0,\"width\":\"100\",\"height\":\"100\",\"colorDark\":\"rgb(0,0,0)\",\"colorLight\":\"rgb(255,255,255)\",\"cnValue\":\"http://t2.eidop.cn:18890/txt/5fd724e23eb83b9ea58464d3c879ed74858c9ce29a0fadb5a235065fc4b72eab0176c0b130fd8c27\"}]");
//        reqs.setExtention("[{\"type\":\"B\",\"key\":\"name\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"姓名\",\"cnValue\":\"张X\",\"size\":40,\"display\":\"2\",\"format\":\"text\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"1\",\"left\":81,\"top\":81,\"styleStr\":\"font-family:Source Han Sans CN;left:81px;top:81px;font-size:40px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:23\"},{\"type\":\"B\",\"key\":\"family_profe\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"职业\",\"cnValue\":\"医生\",\"size\":20,\"display\":\"2\",\"format\":\"text\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"0\",\"left\":263,\"top\":104,\"styleStr\":\"font-family:Source Han Sans CN;left:263px;top:104px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:27\"},{\"type\":\"B\",\"key\":\"hygiene_firm\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"单位名称\",\"cnValue\":\"系统模板\",\"size\":20,\"display\":\"2\",\"format\":\"text\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"0\",\"left\":79,\"top\":147,\"styleStr\":\"font-family:Source Han Sans CN;left:79px;top:147px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:31\"},{\"type\":\"B\",\"key\":\"phone\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"手机号\",\"cnValue\":\"166****3878\",\"size\":20,\"display\":\"2\",\"format\":\"text\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"1\",\"left\":228,\"top\":203,\"styleStr\":\"font-family:Source Han Sans CN;left:228px;top:203px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:35\"},{\"type\":\"B\",\"key\":\"website\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"网址\",\"cnValue\":\"www.eidledger.com\",\"size\":20,\"display\":\"2\",\"format\":\"text\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"0\",\"left\":229,\"top\":275,\"styleStr\":\"font-family:Source Han Sans CN;left:229px;top:275px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:39\"},{\"type\":\"B\",\"key\":\"hygiene_addr\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"地址\",\"cnValue\":\"北京市海淀区xxx街道\",\"size\":20,\"display\":\"2\",\"format\":\"text\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"0\",\"left\":227,\"top\":313,\"styleStr\":\"font-family:Source Han Sans CN;left:227px;top:313px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:43\"},{\"type\":\"B\",\"key\":\"email\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"邮箱\",\"cnValue\":\"zhangsan@163.com\",\"size\":20,\"display\":\"2\",\"format\":\"text\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"0\",\"left\":228,\"top\":239,\"styleStr\":\"font-family:Source Han Sans CN;left:228px;top:239px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:47\"},{\"type\":\"B\",\"key\":\"num\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"编号\",\"cnValue\":\"001\",\"size\":20,\"display\":\"1\",\"format\":\"text\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"1\",\"left\":544,\"top\":49,\"styleStr\":\"font-family:Source Han Sans CN;left:544px;top:49px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:51\"},{\"type\":\"B\",\"key\":\"family_checkdate\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"颁发日期\",\"cnValue\":\"2020-02-02\",\"size\":20,\"display\":\"1\",\"format\":\"date\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"1\",\"left\":468,\"top\":86,\"styleStr\":\"font-family:Source Han Sans CN;left:468px;top:86px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:58\"},{\"type\":\"C\",\"key\":\"qrcode\",\"left\":524,\"top\":237,\"width\":\"100\",\"height\":\"100\",\"colorDark\":\"rgb(102, 102, 102)\",\"colorLight\":\"rgb(240, 240, 232)\",\"cnValue\":\"http://t2.eidop.cn:18890/txt/5fd724e23eb83b9ea58464d3c879ed74858c9ce29a0fadb5a235065fc4b72eab0176c0b130fd8c27\"}]");
//       reqs.setExtention("[{\"type\":\"B\",\"key\":\"phone\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"手机号\",\"cnValue\":\"166****3878\",\"size\":\"20\",\"display\":\"2\",\"format\":\"text\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"1\",\"left\":73,\"top\":482,\"styleStr\":\"font-family:Source Han Sans CN;left:73px;top:482px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:182\"},{\"type\":\"B\",\"key\":\"name\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"姓名\",\"cnValue\":\"张X\",\"size\":\"20\",\"display\":\"2\",\"format\":\"text\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"1\",\"left\":19,\"top\":44,\"styleStr\":\"font-family:Source Han Sans CN;left:19px;top:44px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:186\"},{\"type\":\"B\",\"key\":\"idcard\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"身份证号码\",\"cnValue\":\"110101********2818\",\"size\":\"20\",\"display\":\"2\",\"format\":\"text\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"1\",\"left\":53,\"top\":353,\"styleStr\":\"font-family:Source Han Sans CN;left:53px;top:353px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:190\"},{\"type\":\"B\",\"key\":\"family_checkdate\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"颁发日期\",\"cnValue\":\"2020-02-02\",\"size\":\"20\",\"display\":\"2\",\"format\":\"date\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"1\",\"left\":176,\"top\":393,\"styleStr\":\"font-family:Source Han Sans CN;left:176px;top:393px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:194\"},{\"type\":\"B\",\"key\":\"num\",\"fontType\":\"Source Han Sans CN\",\"cnName\":\"编号\",\"cnValue\":\"001\",\"size\":\"20\",\"display\":\"2\",\"format\":\"text\",\"fontWeight\":\"normal\",\"textDecoration\":\"none\",\"color\":\"rgb(68,66,66)\",\"fontStyle\":\"normal\",\"centerX\":false,\"is_edit\":false,\"required\":\"1\",\"left\":62,\"top\":8,\"styleStr\":\"font-family:Source Han Sans CN;left:62px;top:8px;font-size:20px;font-weight:normal;text-decoration:none;color:rgb(68,66,66);font-style:normal\",\"$$hashKey\":\"object:198\"},{\"type\":\"C\",\"key\":\"qrcode\",\"left\":580,\"top\":0,\"width\":\"100\",\"height\":\"100\",\"colorDark\":\"rgb(0,0,0)\",\"colorLight\":\"rgb(255,255,255)\",\"cnValue\":\"http://t2.eidop.cn:18890/txt/5fd724e23eb83b9ea58464d3c879ed74858c9ce29a0fadb5a235065fc4b72eab0176c0b130fd8c27\"}]");
        mqSender.sendOne(JSONUtil.toJsonStr(reqs));
        Console.log("发送前时间:"+(new Date()).getTime());
        return "success";
    }


    @GetMapping("/notice")
    public String sendNotice() {

        List<MqNotices> list  = new ArrayList<>();
        MqNotices no1 = new MqNotices();
        no1.setCertId("e286be63336d4203b6cb89bf05d256e1");
        no1.setUserId("2820");

        MqNotices no2 = new MqNotices();
        no2.setCertId("557983c99ccf4baf83d1c02030e936cf");
        no2.setUserId("2820");
        list.add(no1);
        list.add(no2);

        MqPojo pojo = new MqPojo();
        pojo.setType(1);
        pojo.setNotices(list);
        mqSender.sendNotice(JSONUtil.toJsonStr(pojo));

        return "success";
    }


    public static void main(String[] args) {
        Map<Object, Object> map = MapUtil.builder().put("appId", UUID.randomUUID().toString().replaceAll("-", ""))
                .put("appKey", UUID.randomUUID().toString().replaceAll("-", ""))
                .put("tempId", 2626)
                .put("accountId", "123123")
                .put("orgId", "4")
                .put("name","张X")
                .put("age","26")
                .map();
        System.out.println(JSONUtil.toJsonStr(map));

    }
}
