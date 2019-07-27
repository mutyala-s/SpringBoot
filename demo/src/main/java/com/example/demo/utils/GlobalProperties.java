package com.example.demo.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:logger.properties")
public class GlobalProperties {
@Value("${host}")	
 public String host;

@Value("${port}")
 public String port;

public String getHost() {
	return host;
}
public void setHost(String host) {
	this.host = host;
}
public String getPort() {
	return port;
}
public void setPort(String port) {
	this.port = port;
}
}
