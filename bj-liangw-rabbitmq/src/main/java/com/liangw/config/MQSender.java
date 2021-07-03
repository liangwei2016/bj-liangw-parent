package com.liangw.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    @Autowired
    private MQConfig mqConfig;

    private Logger logger = LoggerFactory.getLogger(getClass());

//    public void send(String exchange, String routingKey, String message) {
//        try {
//            this.rabbitTemplate.convertAndSend(exchange, routingKey, message);
//        } catch (Exception e) {
//            logger.error("--------------mq Mq error : {}", e);
//        }
//    }

    public void sendStr(String message) {
        try {
//            this.rabbitTemplate.convertSendAndReceive(mqConfig.getDIRECT_EXCHANGE_ONE(), mqConfig.getROUTING_KEY_ONE(), message);
            this.rabbitTemplate.convertAndSend(mqConfig.getDIRECT_EXCHANGE_ONE(), mqConfig.getROUTING_KEY_ONE(), message);
        }catch (Exception e){
            logger.error("--------------mq Mq error : {}", e);
        }
    }
}
