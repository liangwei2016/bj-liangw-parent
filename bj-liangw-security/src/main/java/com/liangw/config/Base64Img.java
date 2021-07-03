package com.liangw.config;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Base64Img {

    private static Logger logger = LoggerFactory.getLogger(Base64Img.class);

    private static String JPG = "jpg";
    private static String DJPG = ".jpg";

    //图片转化成base64字符串
    public static String GetImageStr(File imgFile) {//将图片文件转化为字节数组字符串，并对其进行Base64编码处理
        InputStream in = null;
        byte[] data = null;
        //读取图片字节数组
        try {
            in = new FileInputStream(imgFile);
            data = new byte[in.available()];
            in.read(data);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //对字节数组Base64编码
        BASE64Encoder encoder = new BASE64Encoder();
        return encoder.encode(data);//返回Base64编码过的字节数组字符串
    }


    //base64字符串转化成图片
    public static File base64ToFile(String base64, String filePath, String fileName) throws Exception {
        if (base64.contains("data:image")) {
            base64 = base64.substring(base64.indexOf(",") + 1);
        }
        base64 = base64.replace("\r\n", "");
        File file = null;
        //创建文件目录
        File dir = new File(filePath);
        if (!dir.exists() && !dir.isDirectory()) {
            dir.mkdirs();
        }
        BufferedOutputStream bos = null;
        FileOutputStream fos = null;
        try {
            BASE64Decoder decoder = new BASE64Decoder();
            byte[] bytes = decoder.decodeBuffer(base64);
            file = new File(filePath + File.separator + fileName);
            OutputStream out = new FileOutputStream(filePath + File.separator + fileName);
            fos = new FileOutputStream(file);
            bos = new BufferedOutputStream(fos);
            bos.write(bytes);
        } finally {
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return file;
    }




    public static InputStream baseToInputStream(String base64) {
        ByteArrayInputStream stream = null;
        try {
            BASE64Decoder decoder = new BASE64Decoder();
            byte[] bytes1 = decoder.decodeBuffer(base64);
            stream = new ByteArrayInputStream(bytes1);
        } catch (Exception e) {
            logger.info("---------------------base64转换为流异常:{}", e.getMessage());
        }
        return stream;
    }

    /**
     * @param base64Content
     * @param filePath      base64字符串转pdf
     */
    public static void base64StringToPdf(String base64Content, String filePath) {
        BASE64Decoder decoder = new BASE64Decoder();
        BufferedInputStream bis = null;
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        try {
            base64Content = base64Content.replace("\r\n", "");
            byte[] bytes = decoder.decodeBuffer(base64Content);// base64编码内容转换为字节数组
            ByteArrayInputStream byteInputStream = new ByteArrayInputStream(bytes);
            bis = new BufferedInputStream(byteInputStream);
            File file = new File(filePath);
            File path = file.getParentFile();
            if (!path.exists()) {
                path.mkdirs();
            }
            fos = new FileOutputStream(file);
            bos = new BufferedOutputStream(fos);
            byte[] buffer = new byte[1024];
            int length = bis.read(buffer);
            while (length != -1) {
                bos.write(buffer, 0, length);
                length = bis.read(buffer);
            }
            bos.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bos.close();
                fos.close();
                bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) throws Exception {
//        pdfToJpg("D:\\test\\2.pdf", null, "D:\\test\\2.jpg");
//        int pdfPage = getPDFPage("D:\\test\\2222.pdf", null);
//        System.out.println(getPDFPage("D:\\test\\2222.pdf", null));
//        pdfToPageJpg("D:\\test\\2222.pdf", null,"D:\\test\\3", pdfPage);
        List<String> listA = new ArrayList<>();
        String str = "a";
        String str2 = "b";
        List<String> list = Arrays.asList(str.split(","));
        List<String> list2 = Arrays.asList(str2.split(","));
        listA.addAll(list);
        listA.addAll(list2);
        System.out.println(listA);
        System.out.println("over");
    }

}
