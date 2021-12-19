/**
 * 
 */
package com.madhu.springdemo.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.madhu.springdemo.rest.entity.Student;

/**
 * @author 15197
 *
 */
@RestController
@RequestMapping("/api")
public class StudentRestController {
	// define endpoints for /students - return list of students
	@GetMapping("/students")
	public List<Student> getStudents()	{
		List<Student> theStudents = new ArrayList<>();
		theStudents.add(new Student("Madhukar", "Mani"));
		theStudents.add(new Student("Priyanka", "Bhadran"));
		theStudents.add(new Student("Atharvi", "Madhukar"));
		theStudents.add(new Student("Satvika", "Madhukar"));
		return theStudents;
	}
}
