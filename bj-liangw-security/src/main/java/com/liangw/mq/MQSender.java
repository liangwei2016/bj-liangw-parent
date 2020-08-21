package com.liangw.mq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName MQSender
 * @Description 服务端发送
 * @Author liangw
 * @Date 2020/5/17 16:21
 * @Version 1.0
 **/
@Component
public class MQSender {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send(String message) {
        this.rabbitTemplate.convertAndSend(MQConst.DIRECT_EXCHANGE_BATH,MQConst.ROUTING_KEY_BATH, message);
    }

    public void sendOne(String message) {
        this.rabbitTemplate.convertAndSend(MQConst.DIRECT_EXCHANGE_ONE,MQConst.ROUTING_KEY_ONE, message);
    }


    public void sendNotice(String message){
        this.rabbitTemplate.convertAndSend(MQConst.DIRECT_EXCHANGE_MSG,MQConst.RUTING_KEY_MSG, message);
    }

}
