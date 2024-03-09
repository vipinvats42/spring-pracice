package com.telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");  // create a container
//    	Alien obj = new Alien();
    	Alien obj =  context.getBean("alien" , Alien.class);
    	obj.code();
    	obj.setCount(20);
    	
    
    
    	
    	Alien obj1 = (Alien) context.getBean("alien");
    	obj1.code();
    	System.out.println("Age is :"+obj1.getAge());
    
    	
  
    }
}
