package com.example.greeter;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("greeter")
public class BasicConfiguration {
private String message;

public String getMessage() {
        return message;
    }
public void setMessage(String msg) {
    	this.message = msg;
    }
}
