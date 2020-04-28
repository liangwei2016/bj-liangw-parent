package com.liangw.controller;

import cn.hutool.core.img.ImgUtil;
import cn.hutool.core.io.FileUtil;
import com.sun.jndi.toolkit.url.UrlUtil;
import org.ofdrw.font.Font;
import org.ofdrw.layout.OFDDoc;
import org.ofdrw.layout.element.Paragraph;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.*;
import java.net.MalformedURLException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @ClassName FontTestController
 * @Description TODO
 * @Author liangw
 * @Date 2020/4/28 13:55
 * @Version 1.0
 **/
@RestController
public class FontTestController {


    @Value("${sys.file.path}")
    public String filepath;


    @GetMapping(path = "/img")
    public void queryImage(HttpServletResponse resp,
                           @RequestParam(name = "fontName", required = true) String fontName) throws IOException {
        fontName = UrlUtil.decode(fontName);
        String oldFileName = filepath+"1.jpg";
        String fileName = filepath+"Font.jpg";
        ImgUtil.pressText(
                FileUtil.file(oldFileName), //
                FileUtil.file(fileName), //
                "字体测试文字", Color.WHITE, //文字
                new java.awt.Font(fontName, java.awt.Font.BOLD, 35), //字体
                150, //x坐标修正值。 默认在中间，偏移量相对于中间偏移
                150, //y坐标修正值。 默认在中间，偏移量相对于中间偏移
                1f//透明度：alpha 必须是范围 [0.0, 1.0] 之内（包含边界值）的一个浮点数字
        );
        String outFile = String.valueOf(System.currentTimeMillis()).substring(4, 13) + ".jpg";
        this.outFile(fileName,outFile,resp);
    }


    @GetMapping(path = "/ofd")
    public void queryOfd(HttpServletResponse resp,
                         @RequestParam(name = "fontName", required = true) String fontName) throws IOException {
        fontName = UrlUtil.decode(fontName);
        String fileName = filepath+"Font.ofd";
        Path outP = Paths.get(fileName);
        try (OFDDoc doc = new OFDDoc(outP)) {
//          font = FontSet.get(FontName.ZhanKuQingKeiHuangYou);
            Font font = new Font(fontName, fontName);
            Paragraph p = new Paragraph()
                    .setDefaultFont(font)
                    .setFontSize(10d)
                    .add("字体名称："+fontName);
            doc.add(p);
        }catch (Exception e){
            e.getLocalizedMessage();
        }
        String outFile = String.valueOf(System.currentTimeMillis()).substring(4, 13) + ".ofd";
        this.outFile(fileName,outFile,resp);
    }

    public void outFile(String fileName,String outFile ,HttpServletResponse resp) throws IOException {
        InputStream fis = new BufferedInputStream(new FileInputStream(fileName));
        byte[] buffer = new byte[fis.available()];
        fis.read(buffer);
        fis.close();
        String headStr = "attachment; filename=\"" + outFile + "\"";
        resp.setContentType("APPLICATION/OCTET-STREAM");
        resp.setHeader("Content-Disposition", headStr);
        OutputStream out = resp.getOutputStream();
        out.write(buffer);
    }



    public static void main(String[] args) throws MalformedURLException {
        ImgUtil.pressText(
                FileUtil.file("d:/test/1.jpg"), //
                FileUtil.file("d:/test/2.jpg"), //
                "字体测试文字", Color.WHITE, //文字
                new java.awt.Font(UrlUtil.decode("ZCOOL Addict Italic 01"), java.awt.Font.BOLD, 35), //字体
                50, //x坐标修正值。 默认在中间，偏移量相对于中间偏移
                50, //y坐标修正值。 默认在中间，偏移量相对于中间偏移
                1f//透明度：alpha 必须是范围 [0.0, 1.0] 之内（包含边界值）的一个浮点数字
        );
    }
}
