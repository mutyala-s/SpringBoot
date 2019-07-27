package com.example.demo.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("env")
public class EnvironmentPropertires {
 private String devEnv;
 private String prodEnv;
 
public String getDevEnv() {
	return devEnv;
}
public void setDevEnv(String devEnv) {
	this.devEnv = devEnv;
}
public String getProdEnv() {
	return prodEnv;
}
public void setProdEnv(String prodEnv) {
	this.prodEnv = prodEnv;
}
}
