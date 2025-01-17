package com.ersandev.emailservice.consumer;

import com.ersandev.emailservice.dto.OrderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {
    private final Logger LOGGER = LoggerFactory.getLogger(OrderConsumer.class);

    @RabbitListener(queues = "${rabbitmq.queue.email.name}")
    public void consume(OrderEvent event){

        LOGGER.info(String.format("Order event received in email service => %s",event.toString()));

        // email service sent email when orderEvent come to email queue
    }

}
