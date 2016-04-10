package com.yubaraj.attendance.dto;

import java.io.Serializable;

/**
 * DTO representation for response.
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

	private String status;
	private String message;

	public ResponseDto() {
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
