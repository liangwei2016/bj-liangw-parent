package com.liangw.mq;

import cn.hutool.core.lang.Console;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @ClassName MQClient
 * @Description 客户端接收
 * @Author liangw
 * @Date 2020/5/17 16:27
 * @Version 1.0
 **/
@Component
public class MQClient {

    @RabbitListener(queues = MQConst.QUEUE_RESP)
    public void reciveOne(String message) {
        Console.log("----------------------接收时间1:"+(new Date()).getTime());
        Console.log("接收的消息1:");
        Console.log(message);
    }
}
