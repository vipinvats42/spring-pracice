package com.telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.telusko.config.AppConfig;

public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	Desktop desktop = context.getBean("com",Desktop.class);
    	desktop.compile();
    	
    	Desktop desktop1 = context.getBean("com",Desktop.class);
    	desktop1.compile();
    	
       	  Alien obj = context.getBean("alien" , Alien.class);
       	  System.out.println(obj.getAge());
    	   obj.code(); 
    	  
    	
		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("spring.xml"); // create a container // Alien
		 * obj = new Alien(); Alien obj = context.getBean("alien" , Alien.class);
		 * obj.code(); obj.setCount(20);
		 * 
		 * 
		 * 
		 * 
		 * Alien obj1 = (Alien) context.getBean("alien"); obj1.code();
		 * System.out.println("Age is :"+obj1.getAge());
		 */
    	
  
    }
}
