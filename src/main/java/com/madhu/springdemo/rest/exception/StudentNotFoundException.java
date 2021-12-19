/**
 * 
 */
package com.madhu.springdemo.rest.exception;

/**
 * @author 15197
 *
 */
public class StudentNotFoundException extends RuntimeException {
	public StudentNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public StudentNotFoundException(String message) {
		super(message);
	}

	public StudentNotFoundException(Throwable cause) {
		super(cause);
	}
}
