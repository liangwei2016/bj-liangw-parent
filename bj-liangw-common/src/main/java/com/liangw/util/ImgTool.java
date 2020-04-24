package com.liangw.util;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.map.MapUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.google.zxing.BarcodeFormat;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Map;

/**
 * @ClassName ImgTool
 * @Description 图片工具类
 * @Author liangw
 * @Date 2020/4/17 10:51
 * @Version 1.0
 **/
public class ImgTool {


    /**
     * 添加图片水印
     * @param srcImag   源背景图片
     * @param pressImg  水印图片
     * @param location  水印位置
     * @param x         x坐标
     * @param y         y坐标
     * @return
     */
    public static BufferedImage pressImage(Image srcImag, Image pressImg, String location, int x, int y) {
            // 目标文件
            int width = srcImag.getWidth(null);
            int height = srcImag.getHeight(null);
            BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            Graphics2D g = image.createGraphics();
            g.drawImage(srcImag, 0, 0, width, height, null);
            int width_biao = pressImg.getWidth(null);
            int height_biao = pressImg.getHeight(null);
            // 水印坐标
            if (StrUtil.equals(location, "left-top")) {
                x += 30;
                y += 30;
            } else if (StrUtil.equals(location, "right-top")) {
                x = width - width_biao - 30;
                y += 30;
            } else if (StrUtil.equals(location, "left-bottom")) {
                y = height - height_biao - 30;
                x += 30;
            } else if (StrUtil.equals(location, "right-bottom")) {
                x = width - width_biao - 30;
                y = height - height_biao - 30;
            } else if(StrUtil.equals(location, "center")) {
                x = (width - width_biao) / 2;
                y = (height - height_biao) / 2;
            }else{
                x = x - 60;
            }
            g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            g.drawImage(pressImg, x, y, width_biao, height_biao, null);
            g.dispose();
            return image;
    }


    /**
     * 添加文字水印
     * @param srcImag    源背景图片
     * @param pressText   图片上录入的文字
     * @param font        字体
     * @param location    位置
     * @param color       颜色
     * @param x           x坐标
     * @param y           y坐标
     * @return
     */
    public static BufferedImage pressText(Image srcImag, String pressText, Font font, String location, Color color, int x, int y) {
        Map<String, Integer> fontWH = getFontWH(font, pressText);
        Integer textWidth = fontWH.get("W");
//      Integer textHight = fontWH.get("H");
        int width = srcImag.getWidth(null);
        int height = srcImag.getHeight(null);
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = image.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g.drawImage(srcImag.getScaledInstance(width, height, Image.SCALE_SMOOTH), 0, 0, null);
        g.setColor(color);
        g.setFont(font);
        if (StrUtil.equals(location, "left-top")) {
            x = 30;
            y = 30;
        } else if (StrUtil.equals(location, "right-top")) {
            x = width - textWidth - 30;
            y = 30;
        } else if (StrUtil.equals(location, "left-bottom")) {
            x += 30;
            y = height - 30;
        } else if (StrUtil.equals(location, "right-bottom")) {
            x = width - textWidth - 30;
            y = height - 30;
        } else if (StrUtil.equals(location, "center")) {
            x = (width - textWidth) / 2;
            y = (height) / 2;
        }else{
            x = x - 60;
        }
        g.drawString(pressText, x, y);
        g.dispose();
        return image;
    }

    /**
     * 文本宽度和高度获取
     * @param font
     * @param pressText
     * @return
     */
    public static Map<String, Integer> getFontWH(Font font, String pressText) {
        FontMetrics fm = sun.font.FontDesignMetrics.getMetrics(font);
        return MapUtil.builder("W", fm.stringWidth(pressText)).put("H", fm.getHeight()).map();
    }


    /**
     *  图片处理
     * @param srcImg  背景源图片
     * @param data   需要写入的数据
     * @return
     */
    public static BufferedImage loadImage(BufferedImage srcImg, String data) {
        JSONArray objects = JSONUtil.parseArray(data);
        for (int i = 0; i < objects.size(); i++) {
            JSONObject obj = (JSONObject) objects.get(i);
            if(Convert.toStr(obj.get("key")).equals("qrcode")){  //二维码
                BufferedImage pressImg = QrCodeUtil.generate("http://eidledger.com", BarcodeFormat.QR_CODE, 100, 100);
                int x_postion = Convert.toInt(Convert.toStr(obj.get("postion")).split("\\*")[0]);
                int y_postion = Convert.toInt(Convert.toStr(obj.get("postion")).split("\\*")[1]);
                BufferedImage image =  pressImage(srcImg,pressImg,"", x_postion, y_postion);
                srcImg = image;
            }else{   //文本
                String fontType = Convert.toStr(obj.get("fontType"));
                int size = Convert.toInt(obj.get("size"));
                String text = Convert.toStr(obj.get("cnName"));
                int x_postion = Convert.toInt(Convert.toStr(obj.get("postion")).split("\\*")[0]);
                int y_postion = Convert.toInt(Convert.toStr(obj.get("postion")).split("\\*")[1]);
                Color color = Color.black;
                Font font = new Font(fontType, Font.BOLD, size);
                BufferedImage image = pressText(srcImg, text, font, "", color, x_postion, y_postion);
                srcImg = image;
            }
        }
        return srcImg;
    }


//    public static void main(String[] args) throws IOException {
//          String data = "[{\"key\":\"qrcode\",\"fontType\":\"黑体\",\"postion\":\"361*321\",\"cnName\":\"二维码\",\"size\":\"14\"},{\"key\":\"num\",\"fontType\":\"黑体\",\"postion\":\"225*340\",\"cnName\":\"编码\",\"size\":\"12\"},{\"key\":\"name\",\"fontType\":\"黑体\",\"postion\":\"385*234\",\"cnName\":\"姓名\",\"size\":\"24\"},{\"key\":\"date\",\"fontType\":\"黑体\",\"postion\":\"225*364\",\"cnName\":\"日期\",\"size\":\"12\"},{\"key\":\"txt\",\"fontType\":\"微软雅黑\",\"postion\":\"240*278\",\"cnName\":\"参加了全国电子信息专业技术的培训，通过了FPGA有关技术课程的认证考试，\",\"size\":\"12\"},{\"key\":\"txt\",\"fontType\":\"黑体\",\"postion\":\"178*298\",\"cnName\":\"掌握了相应的专业知识，能够胜任相关工作，特发此证。\",\"size\":\"12\"}]";
//          ObsClient obsClient = new ObsClient("GRY4RPYSHBOIRWTKNRAQ", "0FLMK3q0uSuZpceTI5NWadc7zzVhzNcalswXc4hU", "obs.cn-north-4.myhuaweicloud.com");
//          ObsObject obsObject = obsClient.getObject("eidc", "5bc2f2d35e8c5.png");
//          InputStream inputStream = obsObject.getObjectContent();
//          BufferedImage bi = ImageIO.read(inputStream);
//          BufferedImage bi_new = ImgTool.loadImage(bi, data);
//          File targetFile = new File("D:/test/111.png");
//          ImageOutputStream out = getImageOutputStream(targetFile);
//          ImageIO.write(bi_new, FileUtil.extName(targetFile), out);
//          BufferedImage generate = QrCodeUtil.generate("http://eidledger.com", BarcodeFormat.QR_CODE, 10, 10);
//    }
}
