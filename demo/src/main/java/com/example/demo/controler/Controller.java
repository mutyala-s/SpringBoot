package com.example.demo.controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class Controller {
	@RequestMapping("/getEmp")
public String getEmploy() {
	return "Hello Venkat ...";
}
}
