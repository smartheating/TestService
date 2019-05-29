package de.smartheating.testservice.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import de.smartheating.testservice.rabbitmq.MessageProducer;
import io.swagger.annotations.ApiOperation;

@RestController
public class TestServiceRestController {
	
	@Autowired
	MessageProducer rabbitMQProducer;

	/**
	 * This method returns a greeting.
	 * 
	 * @return greeting
	 */
	@GetMapping(value = "/test", produces = "application/json")
	@ApiOperation(value = "Get all Git-Configurations")
	public ResponseEntity<?> getAllConfigs() {
		rabbitMQProducer.sendMessages("Test RabbitMQ");
		return new ResponseEntity<>("Test", HttpStatus.OK);
	}

}
