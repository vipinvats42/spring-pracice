package com.telusko.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.telusko.Alien;
import com.telusko.Computer;
import com.telusko.Desktop;

@Configuration
public class AppConfig {

	@Bean(name = "com")
	//@Scope("prototype")
	public Desktop desktop() {
		return new Desktop();
	}
	
	@Bean(name = "alien")
	public Alien alien(@Autowired Computer com) {
		Alien obj = new Alien();
		obj.setAge(25);
		obj.setLap(com);
		return obj;
	}
}
