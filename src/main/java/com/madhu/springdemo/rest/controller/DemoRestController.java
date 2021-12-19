/**
 * 
 */
package com.madhu.springdemo.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 15197
 * code for the "/hello" endpoint
 */
@RestController
@RequestMapping("/test")
public class DemoRestController {
	@GetMapping("/hello")
	public String sayHello()	{
		return "Hello World";
	}

}
