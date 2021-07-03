package com.liangw.controller;

import cn.hutool.core.lang.Console;
import cn.hutool.json.JSONUtil;
import com.cunnar.domain.*;
import com.cunnar.exception.ErrorResultException;
import com.cunnar.module.Cunnar;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @ClassName ZhangController
 * @Description TODO
 * @Author liangw
 * @Date 2020/8/31 16:02
 * @Version 1.0
 **/
public class ZhangController {

    public static  Cunnar cunnar = new Cunnar("https://t.cunnar.com","202007292461","b715decf5d19407ab08f68f6d40e94bc");

    public static String createdAccount(String phone){
        String user_id = cunnar.createAccountByPhone(phone);
        return user_id;
    }


    //创建合同
    public  static String  createdHt() throws Exception {
        String out_id = UUID.randomUUID().toString().replaceAll("-","");  //7c0ef4b4f2c64eb88bc07539a4e27ab4
        System.out.println(out_id);
//        String out_id = "7c0ef4b4f2c64eb88bc07539a4e27ab4";
//        创建合同文件信息（ PDF）
        String shaHex = HashData.encodeSHAHex(HashData.input2byte("C:\\Users\\86166\\Desktop\\电子签章\\11.pdf"));
        File file = new File("C:\\Users\\86166\\Desktop\\电子签章\\11.pdf");
        FileInfo info = new FileInfo(out_id,"11.pdf", file.length(), shaHex);
        info.setFileCreateTime(new Date().getTime());
        String contractId = cunnar.createContract(info);
        Console.log(">>>>>>>>>>>>>>>>>>>>>>创建文档id:"+contractId);
        return contractId;
    }


    public static Long    uploadHt(String contract_id) throws IOException {
        try {
             //若一次没有上传完成,文件断点续传
            File file = new File("C:\\Users\\86166\\Desktop\\电子签章\\11.pdf");
            FileInputStream inputStream = new FileInputStream(file);
            long upload_length = cunnar.getContractUploadLength(contract_id);
            inputStream.skip(upload_length);
             upload_length=  cunnar.uploadContractStream(contract_id,upload_length, inputStream);
             return upload_length;
        } catch (ErrorResultException e) {
              //处理对应的异常信息
            e.getErrorResult();
        }
        return null;
    }



    public static  List<StampInfo> signzhangHt(String contract_id,  String user_id ){
        ArrayList<StampInfo> info = new ArrayList<StampInfo>();
//        info.add(new StampInfo(user_id, x, y, page));
        info.add(new StampInfo(user_id, 50, 50, 1));
        List<StampInfo> infos = cunnar.createContractFile(contract_id, 1, info);
        return infos;
    }
    public static void main(String[] args) throws Exception {

//        String userId = createdAccount("16602063860");
//        Console.log(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>userId:" + userId);
//        String  userId = "369777";
        //获取用户
        String userId = cunnar.getUserIdByPhone("16602063860");
        Console.log(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>userId:" + userId);
       //获取token
        AccessToken accessToken = cunnar.getAccessToken(userId);
        Console.log(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>accessToken:" + accessToken);
        //获取实名认证状态
        Boolean verifyResult= cunnar.isVerifyPass(accessToken);
        Console.log(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>verifyResult:" + verifyResult);
        if(!verifyResult){  //如果没有实名认证则实名认证
            UserInfo info = new UserInfo();
            info.setRealName("梁威");
            info.setCard("140311199105240615");
            info.setBank("6217921074895916");
            info.setPhone("16602063860");
            Boolean result= cunnar.userVerify(accessToken, info);
//            UserAuthResult authResult= cunnar.userCardAuth(accessToken, info);
            Console.log(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>authResult:" + JSONUtil.toJsonStr(result));
        }


//        String contractId = createdHt();
//        Console.log(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>contractId:"+contractId);
//        Long upload_length =  uploadHt(contractId);
//        Console.log(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>upload_length:"+upload_length);
//        List<StampInfo>  infos =  signzhangHt(contractId,userId);
//        Console.log(">>>>>>>>>>>>>>>>>>>>>>>>>>list:"+ JSONUtil.toJsonStr(infos));

    }



}
