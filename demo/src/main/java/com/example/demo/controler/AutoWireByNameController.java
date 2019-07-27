package com.example.demo.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ByNameService;

@RestController
public class AutoWireByNameController {

	@Autowired
	ByNameService byNameService;
	@Autowired
	ByNameService byNameService2;
	
	@RequestMapping(value = "/byname")
	public String getEmploy() {
		String name = byNameService.getName("from Service1");
		String name2 = byNameService2.getName("from Service2");
		return name +"  "+name2;
	}

}
