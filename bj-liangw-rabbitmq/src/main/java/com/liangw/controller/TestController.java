//package com.liangw.controller;
//
//import cn.hutool.core.util.CharsetUtil;
//import cn.hutool.core.util.NumberUtil;
//import cn.hutool.core.util.StrUtil;
//import cn.hutool.http.HtmlUtil;
//import cn.hutool.http.HttpRequest;
//import cn.hutool.json.JSONUtil;
//import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
//import com.aliyuncs.exceptions.ClientException;
//import com.liangw.util.Send;
//import net.oschina.j2cache.CacheChannel;
//import net.oschina.j2cache.J2Cache;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * @ClassName TestController
// * @Description TODO
// * @Author liangw
// * @Date 2020/5/15 17:17
// * @Version 1.0
// **/
//@RestController
//public class TestController {
//
////    @Autowired
////    Sender sender;
////
////    @RequestMapping(path = "/test")
////    public void queryTest(){
////        System.out.println("-------------------------------------------");
////        sender.send();
////    }
//
////        @Autowired
////        Send send;
//
////    @RequestMapping(path = "/test")
////    public String  queryTest(String phone) throws ClientException {
////        System.out.println("--------------------------"+phone+"------------");
////        SendSmsResponse resp = send.sendSms(phone, "1234");
////        return JSONUtil.toJsonStr(resp);
////    }
//    @GetMapping(path = "/test1")
//    public void queryTest2()  {
//        System.out.println("-------------------------------------------");
//        CacheChannel cache = J2Cache.getChannel();
//        cache.set("default","key_1","123",60);
//        System.out.println(cache.get("default","key_1").getValue());
//    }
//
//
//    @GetMapping(path = "/test2")
//    public void queryTest3(String key)  {
//        System.out.println("-------------------------------------------");
//        CacheChannel cache = J2Cache.getChannel();
//        System.out.println(cache.get("default",key).getValue());
//    }
//
//
//    @GetMapping(path = "/test3")
//    public void queryTest4(String key,String value)  {
//        System.out.println("-------------------------------------------");
//        CacheChannel cache = J2Cache.getChannel();
//        cache.set("default",key,value);
//        System.out.println(cache.get("default",key).getValue());
//    }
//
//    public static void main(String[] args) throws InterruptedException {
////        CacheChannel cache = J2Cache.getChannel();
//        //缓存操作
////        cache.set("default", "1", "Hello J2Cache");
////        System.out.println(cache.get("default", "1"));
////        cache.evict("default", "1");
////        System.out.println(cache.get("default", "1"));
////        cache.close();
////        System.out.println(60*60*24*7);
////        cache.set("key_1","key_1","123",60*60*24*7*2);
////        System.out.println(cache.get("key_1","key_1").getValue());
//
//        String key = "uam:userInfo:74daed13d6914164938e9d5ae9b861a6";
////        cache.set(key,key,"w17e7ecd628a54d21b162d687e8f1292b",60*10);
//
////      System.out.println( cache.exists(key,key));
//        String value = "{\"appEidCode\":\"dSt9qG73lsswnJg1xI6UjHOwxy/P7E7ZKvL/todrzkcxMDAw\",\"appUserList\":[],\"certList\":[],\"createTime\":1611738327000,\"credenceList\":[{\"credenceAppend\":\"{SSHA}guqFo/THJCnuxb7aY1HzP9emJRFCZUtsdXRCVUJqUHhHSGFQ\",\"credenceClass\":\"Credence_002\",\"credenceFlowno\":\"3c12d31719584bd881859d512b961166\",\"credenceState\":1,\"list\":[],\"loginName\":\"liangwei\",\"pwdModifiedDate\":\"2021-01-27 17:05:26.0\",\"uciDefault2\":\"lw19910524\",\"uniqueid\":\"74daed13d6914164938e9d5ae9b861a6\",\"userType\":-1},{\"credenceClass\":\"Credence_003\",\"credenceFlowno\":\"d04030de6b6a4482a9c138660d7a60bb\",\"credenceState\":1,\"list\":[],\"pwdModifiedDate\":\"2021-01-27 17:05:26.0\",\"uniqueid\":\"74daed13d6914164938e9d5ae9b861a6\",\"userType\":-1}],\"duties\":[],\"groups\":[],\"idhash\":\"CoGaDKIxBwZVQSXjZLfgSmtxazjacpP31tNRgMkupiM=\",\"loginType\":\"Credence_002\",\"maxLen\":0,\"minLen\":0,\"organizations\":[],\"orglist\":[{\"orgCode\":\"10011001\",\"orgFlowno\":\"f3e349fc6c564a7d9006574800af9667\",\"orgName\":\"新人报到处\",\"orgNumber\":\"default\",\"uniqueId\":\"74daed13d6914164938e9d5ae9b861a6\",\"userType\":1,\"utoFlowno\":\"3c67d1c2b2444647aa131aa44e06e3fb\"}],\"pbiList\":[],\"policyBaseInfos\":[],\"recordStatus\":0,\"roles\":[],\"showDetail\":false,\"uniqueId\":\"74daed13d6914164938e9d5ae9b861a6\",\"userAttrList\":[{\"aiEname\":\"hobby22\",\"aiFlowno\":\"f06e41f72c1e4aafbc4c2a0311bdfd52\",\"aiIsComplex\":1,\"aiName\":\"爱好2\",\"aiType\":\"checkbox\",\"importMap\":{},\"isEmpty\":1,\"isPermitUpdate\":0,\"valueErrList\":[],\"valueList\":[{\"aiFlowno\":\"f06e41f72c1e4aafbc4c2a0311bdfd52\",\"avCode\":\"eat\",\"avFlowno\":\"e18c8e180a254ecfad78125f568ea61a\",\"avName\":\"吃饭\",\"isDefault\":0},{\"aiFlowno\":\"f06e41f72c1e4aafbc4c2a0311bdfd52\",\"avCode\":\"play\",\"avFlowno\":\"990205bc33e84261b44b342d8ade155c\",\"avName\":\"打豆豆\",\"checked\":\"checked\",\"isDefault\":1},{\"aiFlowno\":\"f06e41f72c1e4aafbc4c2a0311bdfd52\",\"avCode\":\"sleep\",\"avFlowno\":\"7456be841dfe4f02a4ebcf63947c0c21\",\"avName\":\"睡觉\",\"isDefault\":0}],\"valueSucList\":[],\"valueVOList\":[]},{\"aiEname\":\"hobby\",\"aiFlowno\":\"6899f6c8156b42ddac59b593f7beb5e0\",\"aiIsComplex\":1,\"aiName\":\"爱好\",\"aiType\":\"checkbox\",\"importMap\":{},\"isEmpty\":1,\"isPermitUpdate\":0,\"valueErrList\":[],\"valueList\":[{\"aiFlowno\":\"6899f6c8156b42ddac59b593f7beb5e0\",\"avCode\":\"sing\",\"avFlowno\":\"5ec76d66ebe949b6bcf06564cec6b97c\",\"avName\":\"唱歌\",\"checked\":\"checked\",\"isDefault\":1},{\"aiFlowno\":\"6899f6c8156b42ddac59b593f7beb5e0\",\"avCode\":\"swimming\",\"avFlowno\":\"7eaf2562a4254dc8b7ce58018ff99e18\",\"avName\":\"游泳\",\"isDefault\":0},{\"aiFlowno\":\"6899f6c8156b42ddac59b593f7beb5e0\",\"avCode\":\"walk\",\"avFlowno\":\"371200df1c584710ae8ca291009c00a3\",\"avName\":\"走路\",\"isDefault\":0}],\"valueSucList\":[],\"valueVOList\":[]},{\"aiEname\":\"more\",\"aiFlowno\":\"8dea2d3aaf844f56ad1099982c0268d0\",\"aiIsComplex\":1,\"aiName\":\"多选\",\"aiType\":\"checkbox\",\"importMap\":{},\"isEmpty\":1,\"isPermitUpdate\":0,\"valueErrList\":[],\"valueList\":[{\"aiFlowno\":\"8dea2d3aaf844f56ad1099982c0268d0\",\"avCode\":\"1\",\"avFlowno\":\"468ddd79628a460181a7b6fe2b6cb5e3\",\"avName\":\"one\",\"checked\":\"checked\",\"isDefault\":1},{\"aiFlowno\":\"8dea2d3aaf844f56ad1099982c0268d0\",\"avCode\":\"22\",\"avFlowno\":\"edaa4af7b74342e28077a61b6d036247\",\"avName\":\"two\",\"checked\":\"checked\",\"isDefault\":1},{\"aiFlowno\":\"8dea2d3aaf844f56ad1099982c0268d0\",\"avCode\":\"3\",\"avFlowno\":\"e5c14e6776474495acc8e8f1f36a0183\",\"avName\":\"three\",\"isDefault\":0}],\"valueSucList\":[],\"valueVOList\":[]},{\"aiEname\":\"address\",\"aiFlowno\":\"33b46c4a549a427bb908a5bbae0c5f0f\",\"aiIsComplex\":0,\"aiName\":\"地址\",\"aiType\":\"text\",\"importMap\":{},\"isEmpty\":1,\"isPermitUpdate\":0,\"valueErrList\":[],\"valueList\":[{\"aiFlowno\":\"33b46c4a549a427bb908a5bbae0c5f0f\",\"avCode\":\"addre\",\"avName\":\"address\",\"isDefault\":0}],\"valueSucList\":[],\"valueVOList\":[]}],\"userEmail\":\"1273731348@qq.com\",\"userExtList\":[],\"userIdCode\":\"74daed13d6914164938e9d5ae9b861a6\",\"userIdCodeRule\":\"\",\"userIdType\":\"SF\",\"userIdcardNum\":\"140311199105240615\",\"userLoginType\":\"NONE\",\"userModPwdFlag\":0,\"userName\":\"梁威\",\"userPhone\":\"16602063860\",\"userSortnum\":9999,\"userStatus\":1,\"userType\":1}";
////        System.out.println(cache.get(key,key).getValue());
////        cache.set(key,key,value,50);
////        System.out.println(cache.get(key,key).getValue());
//        String result = HttpRequest.post(StrUtil.format("http://127.0.0.1:8088/uiam/cache/{}","getCache"))
//                .form("key", key)
//                .timeout(20000)//超时，毫秒
//                .execute().body();
//
//
//
//
//
//    }
//
//
//
//}
