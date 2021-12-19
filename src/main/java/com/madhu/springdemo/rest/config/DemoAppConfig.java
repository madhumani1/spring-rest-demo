/**
 * 
 */
package com.madhu.springdemo.rest.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author 15197
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.madhu.springdemo.rest")
public class DemoAppConfig implements WebMvcConfigurer {
	
}
