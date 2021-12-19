/**
 * 
 */
package com.madhu.springdemo.rest.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.madhu.springdemo.rest.entity.Student;
//import com.madhu.springdemo.rest.exception.StudentErrorResponse;
import com.madhu.springdemo.rest.exception.StudentNotFoundException;

/**
 * @author 15197
 *
 */
@RestController
@RequestMapping("/api")
public class StudentRestController {
	private List<Student> theStudents;
	
	// define @PostConstruct to load the student Data....
	// called only once when its bean is construct
	
	@PostConstruct
	public void loadData()	{
		theStudents = new ArrayList<>();
		theStudents.add(new Student("Madhukar", "Mani"));
		theStudents.add(new Student("Priyanka", "Bhadran"));
		theStudents.add(new Student("Atharvi", "Madhukar"));
		theStudents.add(new Student("Satvika", "Madhukar"));
	}
	
	// define endpoints for /students - return list of students
	@GetMapping("/student/{studentId}")
	public Student getStudent(@PathVariable int studentId)	{
		if(studentId>=theStudents.size() || studentId<=0)	{
			throw new StudentNotFoundException("Student id not found - " + studentId);
		}
		return theStudents.get(studentId-1);
	}
	
	/**
	 * 
	 * @return
	 */
	@GetMapping("/students")
	public List<Student> getStudents()	{
		return theStudents;
	}
	
	/*// Add an exception handler using ExceptionHandler
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException e)	{
		// catch a student error response
		StudentErrorResponse error = new StudentErrorResponse();
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(e.getMessage());
		error.setTimeStamp(System.currentTimeMillis());
		
		// return response entity
		return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
	}
	
	// Add an exception handler using ExceptionHandler
		@ExceptionHandler
		public ResponseEntity<StudentErrorResponse> handleException(Exception e)	{
			// catch a student error response
			StudentErrorResponse error = new StudentErrorResponse();
			error.setStatus(HttpStatus.BAD_REQUEST.value());
			error.setMessage(e.getMessage());
			error.setTimeStamp(System.currentTimeMillis());
			
			// return response entity
			return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
		}*/
	
}
