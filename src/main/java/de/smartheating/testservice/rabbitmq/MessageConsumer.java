package de.smartheating.testservice.rabbitmq;

import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

	public void consumeMessagesFromTestQueue(String message) {
		System.out.println("Incoming new message: " + message);
	}
}
