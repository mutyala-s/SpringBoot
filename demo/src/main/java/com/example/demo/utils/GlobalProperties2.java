package com.example.demo.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:logger.properties")
@ConfigurationProperties
public class GlobalProperties2 {

 public String host;
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
