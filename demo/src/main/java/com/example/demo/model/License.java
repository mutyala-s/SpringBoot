package com.example.demo.model;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "license")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class License {
 static int count =0;
	public License() {
		count=count+1;		
		System.out.println("License count "+count);
	}
	public void test() {
		System.out.println("In License  class test");
	}
}
