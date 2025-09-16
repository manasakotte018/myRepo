package com.nit;

import java.lang.ModuleLayer.Controller;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.controller.Controler;
import com.nit.model.Employee;

@SpringBootApplication
public class MiniProj01Application {

	public static void main(String[] args) {
     ConfigurableApplicationContext run = SpringApplication.run(MiniProj01Application.class, args);
  Controler bean = run.getBean(Controler.class);
	 try {
			List<Employee> fetchDetailsdesg = bean.fetchDetailsdesg("MANAGER", "CLERK", "SALESMAN");
	
	fetchDetailsdesg.forEach(emp->{
		System.out.println(emp);
	});
	 }
	 catch(Exception e){
		 e.printStackTrace();
	 }
	
		
		
	}

}
