package com.liangw.controller;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.TimeInterval;
import com.liangw.config.MQSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName Test
 * @Description TODO
 * @Author liangw
 * @Date 2021/3/31 18:18
 * @Version 1.0
 **/
@RestController
public class Test {

    @Autowired
    private MQSender sender;

    @GetMapping(path = "/test")
    public void queryTest4()  {
        TimeInterval timer = DateUtil.timer();
        System.out.println("---------------------发送start----------------------");
        sender.sendStr("123456");
        System.out.println("----------------------发送end--------------------"+timer.interval());

    }


    @GetMapping(path = "/index")
    public String queryTest()  {
        TimeInterval timer = DateUtil.timer();

        return "时间:"+timer.interval();

    }

    public static void main(String[] args) {

    }


}
