package com.nit.service;

import java.sql.SQLException;
import java.util.List;

import com.nit.model.Employee;


 public interface IEmpService 
{
	public List<Employee>showDesgDetails(String job1,String job2,String job3) throws SQLException ;
	
	
	
}
