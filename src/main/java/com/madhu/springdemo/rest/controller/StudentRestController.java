/**
 * 
 */
package com.madhu.springdemo.rest.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
		return theStudents.get(studentId);
	}
	@GetMapping("/students")
	public List<Student> getStudents()	{
		return theStudents;
	}
}
