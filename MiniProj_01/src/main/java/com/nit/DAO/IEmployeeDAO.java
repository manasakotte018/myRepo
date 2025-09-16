package com.nit.DAO;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nit.model.Employee;


 public interface IEmployeeDAO
{

	 List<Employee> showEmployeeDeatailsJob(String job1,String job2,String job3) throws SQLException;
}