package com.liangw.config;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName MQReceiver
 * @Description TODO
 * @Author liangw
 * @Date 2021/3/31 18:17
 * @Version 1.0
 **/
@Component
public class MQReceiver {

    @RabbitListener(queues = "${MQ.QUEUE_ONE}")
    public void onecert(String message) {
        System.out.println("=============================接收start==========================");
        System.out.println(message);
        System.out.println("=============================接收end==========================");
    }
}
