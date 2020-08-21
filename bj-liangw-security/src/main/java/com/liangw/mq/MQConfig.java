package com.liangw.mq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MQConfig {

    /**
     * 注入队列
     * @return
     */
    @Bean
    public Queue respQueue() {
        return new Queue(MQConst.QUEUE_RESP, false);
    }

    /**
     * 注入交换机
     * @return
     */
    @Bean
    public DirectExchange exchange() {
        return new DirectExchange(MQConst.DIRECT_EXCHANGE);
    }


    /**
     * 为队列绑定交换机和路由键
     * @return
     */
    @Bean
    public Binding bindingRespExchangeMessage() {
        return BindingBuilder
                .bind(respQueue())
                .to(exchange())
                .with(MQConst.ROUTING_KEY);
    }



    @Bean
    public Queue oneQueue() {
        return new Queue(MQConst.QUEUE_ONE, false);
    }
    @Bean
    public DirectExchange oneExchange() {
        return new DirectExchange(MQConst.DIRECT_EXCHANGE_ONE);
    }
    @Bean
    public Binding bindingOneExchangeMessage() {
        return BindingBuilder.bind(oneQueue()).to(oneExchange()).with(MQConst.ROUTING_KEY_ONE);
    }

    @Bean
    public Queue bathQueue() {
        return new Queue(MQConst.QUEUE_BATH, false);
    }
    @Bean
    public DirectExchange bathExchange() {
        return new DirectExchange(MQConst.DIRECT_EXCHANGE_BATH);
    }
    @Bean
    public Binding bindingBathExchangeMessage() {
        return BindingBuilder.bind(bathQueue()).to(bathExchange()).with(MQConst.ROUTING_KEY_BATH);
    }





    // 通知类消息消息队列
    @Bean
    public Queue msgQueue() {
        return new Queue(MQConst.QUERY_MSG, false);
    }

    @Bean
    public DirectExchange msgExchange() {
        return new DirectExchange(MQConst.DIRECT_EXCHANGE_MSG);
    }

    @Bean
    public Binding bindingMsgExchangeMessage() {
        return BindingBuilder.bind(msgQueue()).to(msgExchange()).with(MQConst.RUTING_KEY_MSG);
    }


}