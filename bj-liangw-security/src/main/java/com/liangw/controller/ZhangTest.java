package com.liangw.controller;

import com.cunnar.domain.*;
import com.cunnar.module.Cunnar;
import com.liangw.config.Base64Img;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.logging.log4j.util.Base64Util;

import java.io.*;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

/**
 * @ClassName ZhangTest
 * @Description TODO
 * @Author liangw
 * @Date 2020/9/1 10:26
 * @Version 1.0
 **/
public class ZhangTest {

    private   final Cunnar cunnar = new Cunnar("https://t.cunnar.com", "202007292461", "b715decf5d19407ab08f68f6d40e94bc");

    /**
     * 创建用户（使用 out_id，也可以使用 phone，email，具体查看接口文档）
     *
     * @param outId
     * @return
     */
    public String createUser(String outId) {
        return cunnar.createAccountById(outId);
    }

    public String createUserByPhone(String phone) {
        return cunnar.createAccountByPhone(phone);
    }

    /**
     * 通过 userId 获取授权
     *
     * @param userId
     * @return
     */
    public AccessToken getAccessToken(String userId) {
        return cunnar.getAccessToken(userId);
    }

    /**
     * 进行实名认证（可选服务,此处使用简项身份证实名认证）
     *
     * @param accessToken
     * @param userInfo
     * @return
     */
    public UserAuthResult userVerify(AccessToken accessToken, UserInfo userInfo) {
//用户根据实际需求调用接口进行实名，具体参考接口文档
        return cunnar.userCardAuth(accessToken, userInfo);
    }


    /**
     * 用户完善数据
     * @param accessToken
     * @param userName
     * @param card
     * @return
     */
    public Boolean savePersonInfo(AccessToken accessToken, String  userName,String card) {
       //用户根据实际需求调用接口进行实名，具体参考接口文档
        return cunnar.savePersonInfo(accessToken,userName,card);
    }


    /**
     * 申请签章(使用服务端生成签章)
     *
     * @param accessToken
     * @param userInfo
     * @param type（用户类型）
     */
    public Boolean createStamp(AccessToken accessToken, UserInfo userInfo, int type) {
        //签章：服务端生成
        return cunnar.create(accessToken, userInfo, type);
//也可以自定义签章图片（具体查看接口文档） cunnar.create(accessToken1, userInfo, stamp);
    }


    public Boolean createStamp2(AccessToken accessToken, UserInfo userInfo, String stamp) {
        //签章：服务端生成
        return cunnar.create(accessToken, userInfo, stamp);
//也可以自定义签章图片（具体查看接口文档） cunnar.create(accessToken1, userInfo, stamp);
    }


    /**
     * 申请证书
     *
     * @param accessToken
     * @return
     */
    public Boolean incrementItursCert(AccessToken accessToken) {
//生成证书
        return cunnar.incrementItursCert(accessToken);
    }

    /**
     * 创建合同文件信息（PDF）
     *
     * @param fileName(要上传的文件) )
     * @param id（文件的唯一标识）
     * @return
     * @throws IOException
     */
    public String createContract(String fileName, String id) throws IOException {
        //创建合同文件信息
        java.io.File file = new java.io.File(fileName);
        FileInfo info = new FileInfo(id, file.getName(), file.length(),
                DigestUtils.shaHex(new FileInputStream(file)));
        //当前合同唯一编号
        return cunnar.createContract(info);
    }

    /**
     * 上传合同文件
     *
     * @param contractId
     * @param fileName
     * @throws IOException
     */
    public void uploadContract(String contractId, String fileName) throws IOException {
        long uploadLength = cunnar.getContractUploadLength(contractId);
        java.io.File file = new java.io.File(fileName);
        if (uploadLength < file.length()) {
            FileInputStream inputStream = new FileInputStream(file);
            inputStream.skip(uploadLength);
            cunnar.uploadContractStream(contractId, uploadLength, inputStream);
        }
    }


    /**
     * 合同签章
     *
     * @param contractId
     * @param status
     * @param stampInfos
     */
    public List<StampInfo> createContractFile(String contractId, int status, ArrayList<StampInfo> stampInfos) {
        return cunnar.createContractFile(contractId, status, stampInfos);
    }


    /**
     * 下载合同文件
     *
     * @param contractId
     * @param filePath（下载的位置）
     */
    public void downloadContract(String contractId, final String filePath) {
        cunnar.downloadContract(contractId, new InputStreamCallBack() {
            @Override
            public void doInputStream(FileStream fileStream) throws IOException {
                InputStream inputStream = fileStream.getInputStream();
                FileOutputStream stream = new FileOutputStream(filePath);
                int i;
                byte bytes[] = new byte[4096];
                while ((i = inputStream.read(bytes)) > 0) {
                    stream.write(bytes, 0, i);
                }
                stream.flush();
                stream.close();
            }
        });
    }


    public static void main(String[] args) throws IOException {
       Cunnar cunnar = new Cunnar("https://t.cunnar.com", "202007292461", "b715decf5d19407ab08f68f6d40e94bc");
        ZhangTest contractTest = new ZhangTest();
        //创建合同
        String fileName = "C:\\Users\\86166\\Desktop\\电子签章\\11.pdf";
        String id = String.valueOf(System.currentTimeMillis());
        String contractId = contractTest.createContract(fileName, id);
        System.out.println("contractId:" + contractId);
        contractTest.uploadContract(contractId, fileName);

        //创建用户（使用 out_id，也可以使用 phone，email，具体查看接口文档）
//        String user1 = contractTest.createUserByPhone("16602063860");
        String user1 = cunnar.getUserIdByPhone("16602063860");
        System.out.println("user1:" + user1);
//        String user2 = contractTest.createUser("2");
//        System.out.println("user2:" + user2);

        //获取授权
        AccessToken accessToken1 = contractTest.getAccessToken(user1);
        System.out.println("accessToken1:" + accessToken1);
//        AccessToken accessToken2 = contractTest.getAccessToken(user2);
//        System.out.println("accessToken2:" + accessToken2);

        //实名认证（根据用户需求选择是否需要）
        Boolean verifyRusult = cunnar.isVerifyPass(accessToken1);
        if (!verifyRusult) {
            //用户根据实际需求调用接口进行实名，具体参考接口文档
            Boolean userAuthResult = contractTest.savePersonInfo(accessToken1, "梁威", "140311199105240615");
            System.out.println("userAuthResult:" + userAuthResult);
        }

        //申请签章和证书
        Boolean stampResult = cunnar.existCert(accessToken1);
        stampResult  = false;
        if (!stampResult) {
            UserInfo userInfo = new UserInfo();
            userInfo.setCard("140311199105240615");
            userInfo.setRealName("梁威");
//            stampResult = contractTest.createStamp(accessToken1, userInfo, 1);
            stampResult = contractTest.createStamp2(accessToken1, userInfo, Base64Img.GetImageStr(new File("C://Users//86166//Desktop//电子签章//1.jpg")) );
            System.out.println("stampResult1:" + stampResult);
        }
        boolean cert_install = contractTest.incrementItursCert(accessToken1);
        System.out.println("cert_install1:" + cert_install);

//        stampResult = cunnar.existCert(accessToken2);
//        if (!stampResult) {
//            UserInfo userInfo = new UserInfo();
//            userInfo.setCard("140303199901011872");
//            userInfo.setRealName("用户 2");
//                    contractTest.createStamp(accessToken2, userInfo, 1);
//            System.out.println("stampResult2:" + stampResult);
//        }
//        cert_install = contractTest.incrementItursCert(accessToken2);
//        System.out.println("cert_install 2:" + cert_install);

        //合同盖章
        ArrayList<StampInfo> stampInfo = new ArrayList<StampInfo>();
        stampInfo.add(new StampInfo(user1, 100, 100, 1));
        List<StampInfo> stampInfos = contractTest.createContractFile(contractId, 0,
                stampInfo);
        System.out.println("stampInfos1:" + stampInfos);

//        stampInfo.clear();
//        stampInfo.add(new StampInfo(user2, 200, 50, 1));
//        stampInfos = contractTest.createContractFile(contractId, 1, stampInfo);
//        System.out.println("st ampInfos2:" + stampInfos);

        //下载合同
        fileName = "d://下载合同文件 .pdf";
        contractTest.downloadContract(contractId, fileName);

        //在线查看（pdf）
        String result = cunnar.getContractPdfView(accessToken1, contractId);
        System.out.println("result:" + result);

        //将 result 用浏览器打开可访问合同文件（pdf）
    }

}
