package com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext apc=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Student st = (Student) apc.getBean("std");
		
		System.out.println(st.getId());
		System.out.println(st.getName());
		System.out.println(st.getMobNo());
		
		System.out.println(st.getAddr().getCityname());
		System.out.println(st.getAddr().getAreaname());
	}

}
