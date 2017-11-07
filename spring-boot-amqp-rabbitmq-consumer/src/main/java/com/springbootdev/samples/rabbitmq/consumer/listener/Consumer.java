package com.springbootdev.samples.rabbitmq.consumer.listener;

import com.springbootdev.samples.rabbitmq.consumer.model.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = {"orders_queue"})
public class Consumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(Consumer.class);

    @RabbitHandler
    public void receiveMessage(Order order)
    {
        LOGGER.info(" receive message [" + order.toString() + "] ");
    }
}
