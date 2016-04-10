package com.yubaraj.attendance.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yubaraj.attendance.dto.ResponseDto;
import com.yubaraj.attendance.dto.StudentDto;
import com.yubaraj.attendance.dto.StudentRegisterDto;
import com.yubaraj.attendance.service.StudentService;

/**
 * Controller class for student.
 * 
 * @author Yuba Raj Kalathoki
 * @version 0.1.0
 * @since 0.1.0
 */
@RestController
@RequestMapping(value = "/student")
public class StudentController {
	private static final Logger LOGGER = LoggerFactory.getLogger(StudentController.class);
	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ResponseEntity<Object> register(@RequestBody StudentRegisterDto studentRegisterDto) {
		LOGGER.info("Registering student.");
		ResponseDto response=studentService.register(studentRegisterDto);
		return new ResponseEntity<Object>(response, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public ResponseEntity<Object> view() {
		LOGGER.info("Registering student.");
		List<StudentDto> studentList=studentService.getAllStudents();
		return new ResponseEntity<Object>(studentList, HttpStatus.OK);
	}
	
}
