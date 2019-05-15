package de.smartheating.testservice.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
public class TestServiceRestController {

	/**
	 * This method returns a greeting.
	 * 
	 * @return greeting
	 */
	@GetMapping(value = "/test", produces = "application/json")
	@ApiOperation(value = "Get all Git-Configurations")
	public ResponseEntity<?> getAllConfigs() {
		return new ResponseEntity<>("Hello World!", HttpStatus.OK);
	}

}
