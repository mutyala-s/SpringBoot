package com.example.demo.service;

import org.springframework.stereotype.Component;

@Component("byNameService2")
public class ByNameServiceImpl2 implements ByNameService{

	@Override
	public String getName(String name) {
		// TODO Auto-generated method stub
		return "By Name Example2  "+name;
	}

}
