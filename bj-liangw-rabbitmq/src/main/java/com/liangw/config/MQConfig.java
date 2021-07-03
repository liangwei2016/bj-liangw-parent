package com.liangw.config;

import lombok.Data;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class MQConfig {

    @Value("${MQ.QUEUE_ONE}")
    private String QUEUE_ONE;
    @Value("${MQ.DIRECT_EXCHANGE_ONE}")
    private String DIRECT_EXCHANGE_ONE;
    @Value("${MQ.ROUTING_KEY_ONE}")
    private String ROUTING_KEY_ONE;


    @Bean
    public Queue oneQueue() {
        return new Queue(QUEUE_ONE, false);
    }

    @Bean
    public DirectExchange oneExchange() {
        return new DirectExchange(DIRECT_EXCHANGE_ONE);
    }

    @Bean
    public Binding bindingOneExchangeMessage() {
        return BindingBuilder.bind(oneQueue()).to(oneExchange()).with(ROUTING_KEY_ONE);
    }



}