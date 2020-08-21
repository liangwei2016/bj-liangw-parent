package com.init.util;

import cn.hutool.core.util.StrUtil;
import org.aiav.aptoassdk.constants.EEncryptType;
import org.aiav.aptoassdk.util.CryptoUtil;


public class SM4Util {


    public static String encryptSoft(String str) {
        if (StrUtil.isBlank(str)) {
            return str;
        }
        return CryptoUtil.encryptSoft(PublicConstants.appKey, str, EEncryptType.SM4_ECB_PKCS5PADDING.getIndex(), PublicConstants.encryptFactory);
    }

    public static String decryptSoft(String str) {
        if (StrUtil.isBlank(str)) {
            return str;
        }
        return CryptoUtil.decryptSoft(PublicConstants.appKey, str, EEncryptType.SM4_ECB_PKCS5PADDING.getIndex(), PublicConstants.encryptFactory);
    }

    public static void main(String[] args) {
        System.out.println(encryptSoft("142201199105072715"));
        System.out.println(decryptSoft(encryptSoft("15718889400")));
    }
}
