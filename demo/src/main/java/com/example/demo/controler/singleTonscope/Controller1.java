package com.example.demo.controler.singleTonscope;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Driver;
import com.example.demo.model.License;

@RestController
public class Controller1 implements ApplicationContextAware{
	@Autowired
	Driver driver;

	@Autowired
	License license;
	
	private ApplicationContext applicationContext;
	 

	@RequestMapping("/controller1")
	public String sayHello() {
		/*
		 * driver.test(); license.test(); driver.test(); license.test();
		 */
		Driver driver1 = (Driver) applicationContext.getBean("driver");
		driver1.test();
		License  License1 = driver1.getLisence();
		Driver driver11 = (Driver) applicationContext.getBean("driver");
		License  License11 = driver11.getLisence();
		if(driver1== driver11)
		System.out.println("Driver objects are equals");
		else
		System.out.println("Driver objects are not equals");
		if(License1== License11)
			System.out.println("License11 objects are equals");
		else
			System.out.println("License11 objects are not equals");
		return "Hello Venkat ...controller1";

	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext ;
		
	}
}
