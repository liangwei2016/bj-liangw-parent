package com.liangw.controller;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import org.apache.commons.codec.digest.DigestUtils;

import java.io.*;

import static sun.plugin.javascript.navig.JSType.URL;

/**
 * @ClassName HashData
 * @Description TODO
 * @Author liangw
 * @Date 2020/9/1 9:15
 * @Version 1.0
 **/
public class HashData {


    //根据产品图片的url返回产品图片的字节流数组
    public static final byte[] input2byte(String Url) throws IOException {
        InputStream in = null;
        ByteArrayOutputStream byteOut = null;
        byte[] in2b = null;
        try {
            in = new FileInputStream(new File(Url));      //创建字节输入流，路径可以是绝对路径，也可以是相对路径（相对于项目工程为根目录）
            if(ObjectUtil.isNotNull(in)){
                byteOut = new ByteArrayOutputStream();
                byte[] buff = new byte[1024 * 4];   //buff用于存放循环读取的临时数据
                int len = 0;
                while ((len = in.read(buff)) != -1) {  // read如果读完了所有数据会返回-1。// 读入缓冲区（输入流中的）的字节总数，如果因为已经到达文件末尾而没有更多的数据，则返回 -1
                    byteOut.write(buff, 0, len);   // 把读到的数据以追加的方式添加到内存流中  ，此方法写入len个字节到输出流
                    in2b = byteOut.toByteArray();
                }
            }
        } catch (IOException e) {

        } finally {
            try {
                if (byteOut != null)
                    byteOut.close();
                if (in != null)
                    in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return in2b;
    }

    /**
     * SHA-1消息摘要算法,返回十六进制字符串
     */
    @SuppressWarnings("deprecation")
    public static String encodeSHAHex(byte[] data) throws Exception {
        return DigestUtils.shaHex(data);
    }
}
