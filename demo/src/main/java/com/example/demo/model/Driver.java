package com.example.demo.model;


import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("driver")
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Driver {
	@Autowired
	License lisence;
	@Autowired
    private ObjectFactory<License> prototypeBeanObjectFactory;
	
	public Driver() {
		System.out.println("In Driver class");
	}

	public void test() {
		System.out.println("In Driver class test");
	}

	/*
	 * @Lookup public License getLisence() { return lisence ; }
	 */
	public License getLisence() {
		return prototypeBeanObjectFactory.getObject();
	}
	/*
	 * private License license;
	 * 
	 * @Autowired public void setLicense(License license) { this.license = license;
	 * }
	 */

	/*
	 * @Override public String toString() { return "Driver [license=" + license +
	 * "]"; }
	 */
}
