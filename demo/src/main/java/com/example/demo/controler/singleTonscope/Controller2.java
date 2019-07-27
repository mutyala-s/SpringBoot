package com.example.demo.controler.singleTonscope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Driver;
import com.example.demo.model.License;

@RestController
public class Controller2 {
	@Autowired
	Driver driver;

	@Autowired
	License license;

	@RequestMapping("/controller2")
	public String sayHello() {
		driver.test();
		license.test();
		driver.test();
		license.test();
		return "Hello Venkat ...controller2";
	}
}
