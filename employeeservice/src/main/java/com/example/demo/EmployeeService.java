package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeService {

	@ResponseBody
	@RequestMapping("/hello")
	public String getHi() {
		return "hi";
	}
	
	
}
