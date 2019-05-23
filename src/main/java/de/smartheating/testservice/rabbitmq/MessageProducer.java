package de.smartheating.testservice.rabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.smartheating.testservice.configuration.RabbitMQConfig;

@Component
public class MessageProducer {
	
	@Autowired
	private RabbitTemplate rabbitTemplate;

	public void sendMessages(String message) {
		rabbitTemplate.convertAndSend(RabbitMQConfig.RABBITMQ_EXCHANGE, RabbitMQConfig.RABBITMQ_ROUTINGKEY, message);
		System.out.println("Published message to rabbitmq: " + message);
	}
}
