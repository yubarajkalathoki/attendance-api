package com.yubaraj.attendance.dto;

import java.io.Serializable;

/**
 * 
 * @author Yuba Raj Kalathoki
 * @version 0.1.0
 * @since 0.1.0
 */
public class ResponseDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -924579232761985519L;

	public String message;

	public ResponseDto(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
