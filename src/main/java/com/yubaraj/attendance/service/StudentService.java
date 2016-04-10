package com.yubaraj.attendance.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yubaraj.attendance.dto.StudentDto;
import com.yubaraj.attendance.dto.StudentRegisterDto;
import com.yubaraj.attendance.entity.Student;
import com.yubaraj.attendance.repository.StudentRepository;
import com.yubaraj.attendance.util.Constant;

/**
 * Service class for student register.
 * 
 * @author Yuba Raj Kalathoki
 * @version 0.1.0
 * @since 0.1.0
 */
@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;

	public void register(StudentRegisterDto studentRegisterDto) {

		String firstName = "";
		String middleName = "";
		String lastName = "";
		String fullName = studentRegisterDto.getFullName();

		if (fullName != null) {
			String[] names = fullName.split("\\s+");
			System.out.println(Arrays.toString(names));
			System.out.println("length " + names.length);
			if (names.length > 0) {
				if (names[0] != null) {
					firstName = names[0];
				}
				if (names[1] != null) {
					middleName = names[1];
				}
				if (names[2] != null) {
					lastName = names[2];
				}
			}
		}

		Student student = new Student();
		student.setAddress(studentRegisterDto.getAddress());
		student.setCourse(studentRegisterDto.getCourse().toUpperCase());
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setMiddleName(middleName);
		student.setMobileNumber(studentRegisterDto.getMobileNumber());
		student.setPassword(studentRegisterDto.getPassword());
		student.setRollNumber(studentRegisterDto.getRollNumber());
		student.setSemester(studentRegisterDto.getSemester());
		student.setUsername(studentRegisterDto.getUsername());
		student.setStatus(Constant.ACTIVE);

		studentRepository.saveAndFlush(student);

	}

	public List<StudentDto> getAllStudents() {
		List<StudentDto> studentDtoList = new ArrayList<StudentDto>();

		List<Student> studentList = studentRepository.findAll();

		if (studentList != null && studentList.size() > 0) {
			for (Student s : studentList) {
				String fullName = s.getFirstName() + " " + s.getMiddleName() + " " + s.getLastName();
				StudentDto dto = new StudentDto();
				dto.setAddress(s.getAddress());
				dto.setCourse(s.getCourse());
				dto.setFullName(fullName);
				dto.setId(s.getId());
				dto.setMobileNumber(s.getMobileNumber());
				dto.setRollNumber(s.getRollNumber());
				dto.setSemester(s.getSemester());
				dto.setUsername(s.getUsername());
				studentDtoList.add(dto);
			}
		}

		return studentDtoList;
	}

}
