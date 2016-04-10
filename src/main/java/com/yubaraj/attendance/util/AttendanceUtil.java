/**
 * 
 */
package com.yubaraj.attendance.util;

import java.util.Arrays;

/**
 * @author Yuba Raj Kalathoki
 * @version 0.1.0
 * @since 0.1.0
 *
 */
public class AttendanceUtil {

	public static void parseFullName(String fullName) {
		String firstName = "";
		String middleName = "";
		String lastName = "";

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

		System.out.println("Names: " + firstName + " " + middleName + " " + lastName);

	}

	public static void main(String[] args) {
		AttendanceUtil.parseFullName("Yuba Raj Kalathoki");
	}
}
