package com.org;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	 public Student std() {
		 
		 Student stu = new Student();
		 stu.setId(1);
		 stu.setName("pavan");
		 stu.setMobNo(7721090103l);

		 return stu;
	 }
       
	 @Bean
	 public Address add() {
		 
		 Address addr= new Address();
		 
		 addr.setCityname("pune");
		 addr.setAreaname("karvenagr");
		 
		 return addr;
	 }
	 
}
