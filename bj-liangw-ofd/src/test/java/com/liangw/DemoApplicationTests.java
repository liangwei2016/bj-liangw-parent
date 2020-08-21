package com.liangw;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.ofdrw.layout.OFDDoc;
import org.ofdrw.layout.PageLayout;
import org.ofdrw.layout.VirtualPage;
import org.ofdrw.layout.element.Img;
import org.ofdrw.layout.element.Position;
import org.springframework.test.context.junit4.SpringRunner;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

@RunWith(SpringRunner.class)
//@SpringBootTest
class DemoApplicationTests {

    @Test
    public  void testFont() throws IOException {
        Path path = Paths.get("target/bbb.ofd").toAbsolutePath();
        try (OFDDoc ofdDoc = new OFDDoc(path)) {
            PageLayout pageLayout = ofdDoc.getPageLayout();
            VirtualPage vPage = new VirtualPage(pageLayout);
            Path imgPath = Paths.get("d://test", "2.png");
            Img img = new Img(imgPath);

            double x = (pageLayout.getWidth() - img.getWidth()) / 2;
            double y = (pageLayout.getHeight() - img.getHeight()) / 2;
            img.setPosition(Position.Absolute)
                    .setX(x).setY(y);
            img.setBorder(3d);
            img.setPadding(3d);
            vPage.add(img);
            ofdDoc.addVPage(vPage);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
