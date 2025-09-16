package com.nit.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.DAO.IEmployeeDAO;
import com.nit.model.Employee;

@Service("eser")
public class EmployeeService implements IEmpService 
{
@Autowired
private IEmployeeDAO dao;


	public List<Employee>showDesgDetails(String job1,String job2,String job3) throws SQLException
	{

	
		List<Employee> list = dao.showEmployeeDeatailsJob(job1, job1, job3);
		list.forEach(emp->
		{
			emp.setGrossSalary(emp.getSalary()+(emp.getSalary()*0.20));
		emp.setNetSalary(emp.getSalary()-(emp.getSalary()*0.10));
		
					});
	
	return list;
	
		
		
	}

}







