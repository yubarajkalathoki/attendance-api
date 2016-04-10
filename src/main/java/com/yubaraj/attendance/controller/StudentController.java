package com.yubaraj.attendance.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller class for student.
 * 
 * @author Yuba Raj Kalathoki
 * @version 0.1.0
 * @since 0.1.0
 */
@RestController
@RequestMapping(value="/student")
public class StudentController {
	private static final Logger LOGGER = LoggerFactory
			.getLogger(StudentController.class);

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ResponseEntity<Object> register(@RequestBody ){
		
	}
}
