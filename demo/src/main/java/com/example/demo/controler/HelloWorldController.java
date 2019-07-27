package com.example.demo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.utils.AppProperties;
import com.example.demo.utils.AppProperties.Menu;
import com.example.demo.utils.EnvironmentPropertires;
import com.example.demo.utils.GlobalProperties;
import com.example.demo.utils.GlobalProperties2;

@RestController
public class HelloWorldController {
	@Value("${env.devEnv}")
	String devEnv;
	@Value("${env.prodEnv}")
	String prodEnv;
	@Autowired
	EnvironmentPropertires envPro;
	
	@Autowired
	GlobalProperties gPro;
	@Autowired
	GlobalProperties2 gPro2;
	@Autowired
	AppProperties appProperties;
	
	@RequestMapping(value = "/demo/hello", method = RequestMethod.GET, consumes = { "text/plain",
			"application/*" }, produces = { "text/plain", "application/*" })
	String hello() {
		System.out.println("devEnv   "+devEnv);
		System.out.println("devEnv from Properties File  "+envPro.getDevEnv());
		
		
		System.out.println("-----------------------------");
		System.out.println("Host   "+gPro.getHost());
		System.out.println("port   "+gPro.getPort());
		System.out.println("-----------------------------");
		System.out.println("Host2   "+gPro2.getHost());
		System.out.println("port2   "+gPro2.getPort());
		System.out.println("-----------------------------");
		System.out.println("Host2   "+gPro2.getHost());
		System.out.println("port2   "+gPro2.getPort());
		System.out.println("-----------------------------");
		List<Menu> teacherList = appProperties.getMenus();
		teacherList.forEach(item->{			
				System.out.println("Name  "+item.getName()+"    Path    "+item.getPath()+"   Title   "+item.getTitle()+"   Salary   "+item.getSalary());			
		});
		return "Hello Venkat! Spring boot is so simple.";
	}
}
