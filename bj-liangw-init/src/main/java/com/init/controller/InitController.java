package com.init.controller;


import com.init.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @ClassName InitController
 * @Description TODO
 * @Author liangw
 * @Date 2020/6/8 15:49
 * @Version 1.0
 **/
@RestController
public class InitController {

    @Autowired
    TemplateService templateService;
    @GetMapping("/init/my")
    public String myInit() throws IOException {
       templateService.initTemplate();
        return "success";
    }



    @GetMapping("/init/sys")
    public String sysInit() throws IOException {
        templateService.initTemplateSys();
        return "success";
    }


}
