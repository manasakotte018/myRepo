package com.nit.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nit.model.Employee;
import com.nit.service.IEmpService;

@Controller("empc")
public class Controler 
{

	@Autowired
	private IEmpService ser;
	
	public List<Employee> fetchDetailsdesg(String job1,String job2,String job3) throws SQLException
	{
		
		List<Employee> list = ser.showDesgDetails(job1, job2, job3);
		return list;
		
	}
	
	
}
