//package com.liangw;
//
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.ofdrw.font.Font;
//import org.ofdrw.font.FontName;
//import org.ofdrw.font.FontSet;
//import org.ofdrw.layout.OFDDoc;
//import org.ofdrw.layout.element.Paragraph;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.io.IOException;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//class DemoApplicationTests {
//
//    @Test
//    public  void testFont() throws IOException {
//
//        Path outP = Paths.get("d:/test/SystemFont.ofd");
//        try (OFDDoc doc = new OFDDoc(outP)) {
//
//            Font font = FontSet.get(FontName.NotoSerif);
//            Paragraph p = new Paragraph()
//                    .setDefaultFont(font)
//                    .setFontSize(10d)
//                    .add("字体名称：思源宋体");
//
//            doc.add(p);
//
//            font = FontSet.get(FontName.NotoSans);
//            p = new Paragraph()
//                    .setDefaultFont(font)
//                    .setFontSize(10d)
//                    .add("字体名称：思源黑体");
//            doc.add(p);
//
////            font = FontSet.get(FontName.ZhanKuQingKeiHuangYou);
//            font =  new Font("站酷庆科黄油体","站酷庆科黄油体");
//            p = new Paragraph()
//                    .setDefaultFont(font)
//                    .setFontSize(10d)
//                    .add("字体名称：站酷庆科黄油体");
//            doc.add(p);
//
//
//        }
//        System.out.println("生成文档位置：" + outP.toAbsolutePath().toString());
//    }
//
//}
