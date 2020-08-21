package com.liangw.mq;

/**
 * @ClassName MqConst
 * @Description 配置项
 * @Author liangw
 * @Date 2020/5/17 15:12
 * @Version 1.0
 **/
public class MQConst {
    //队列设置
    public final static String QUEUE_RESP = "swatch.ez.response";
    //交换机设置
    public final static String DIRECT_EXCHANGE = "swatch.ez";
    //路由键设置
    public final static String ROUTING_KEY = "ez";
    //单个证书队列设置
    public final static String QUEUE_ONE = "swatch.one.request";
    //单个证书交换机设置
    public final static String DIRECT_EXCHANGE_ONE = "swatch.one";
    //单个证书路由键设置
    public final static String ROUTING_KEY_ONE= "one";
    //单个证书队列设置
    public final static String QUEUE_BATH = "swatch.bath.request";
    //单个证书交换机设置
    public final static String DIRECT_EXCHANGE_BATH  = "swatch.bath";
    //单个证书路由键设置
    public final static String ROUTING_KEY_BATH  = "bath";
//#-------------------------------test-----------------------------

//    //队列设置
//    public final static String QUEUE_RESP = "swatch.ez88.response";
//    public final static String DIRECT_EXCHANGE = "swatch.ez88";
//    public final static String ROUTING_KEY = "ez88";
//    public final static String QUEUE_ONE = "swatch.one88.request";
//    public final static String DIRECT_EXCHANGE_ONE = "swatch.one88";
//    public final static String ROUTING_KEY_ONE = "one88";
//    public final static String QUEUE_BATH = "swatch.bath88.request";
//    public final static String DIRECT_EXCHANGE_BATH = "swatch.bath88";
//    public final static String ROUTING_KEY_BATH = "bath88";
    public final static String  QUERY_MSG = "swatch.message.req"   ;
    public final static String DIRECT_EXCHANGE_MSG= "swatch.message";
    public final static String RUTING_KEY_MSG= "message";

}
