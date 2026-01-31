package com.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.Student.Student;

@Configuration
public class SpringConfigFile
{
	@Bean
	public Student StdId()
	{
		Student std = new Student();
		return std;
	}
}
