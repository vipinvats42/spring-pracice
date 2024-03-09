package com.telusko;

import java.beans.ConstructorProperties;

import org.springframework.stereotype.Component;

@Component
public class Alien {
     private int count =0;
     private int age=0;
     private Computer lap;
     
     public Alien() {
    	 System.out.println("Allien Object created");
     }
     
     
     @ConstructorProperties({"age","lap"})
     public Alien(int age ,Computer lap) {
    	 System.out.println("Para constructor called");
    	 this.age=age;
    	 this.lap=lap;
     }
     
     public void getLap() {
 		this.lap = lap;
 	}

	public void setLap(Computer lap) {
		this.lap = lap;
	}
	public void code() {
		System.out.println("Coding");
		lap.compile();
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}
