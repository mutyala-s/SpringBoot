package com.example.demo.service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("byNameService")
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class ByNameServiceImpl implements ByNameService {
	/*
	 * @Autowired Driver driver;
	 * 
	 * @Autowired License license;
	 */

	public ByNameServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName(String name) {
		// TODO Auto-generated method stub
		return "By Name Example   "+name;
	}

}
