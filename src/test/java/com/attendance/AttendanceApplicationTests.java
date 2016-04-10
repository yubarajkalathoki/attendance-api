package com.attendance;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.yubaraj.attendance.AttendanceApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AttendanceApplication.class)
@WebAppConfiguration
public class AttendanceApplicationTests {

	@Test
	public void contextLoads() {
	}

}
