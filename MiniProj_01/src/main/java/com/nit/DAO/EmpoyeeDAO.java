package com.nit.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nit.model.Employee;

@Repository("empDAO")
public class EmpoyeeDAO implements IEmployeeDAO 
{

	private static final String GEt_EMP_DET= "SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE JOB IN(?,?,?) ORDER BY JOB";
	
	@Autowired
	private DataSource source;
	
	@Override
	public List<Employee> showEmployeeDeatailsJob(String job1, String job2, String job3) throws SQLException 
	{
		List<Employee> list = new ArrayList<Employee>();
		Connection connection = source.getConnection();
		PreparedStatement st = connection.prepareStatement(GEt_EMP_DET);
		st.setString(1, job1);
		st.setString(2, job2);
		st.setString(3, job3);
		ResultSet rs = st.executeQuery();
		while(rs.next()) 
		{
			
			Employee emp = new Employee();
			emp.setENo(rs.getInt(1));
			emp.setEName(rs.getString(2));
			emp.setJob(rs.getString(3));
			emp.setSalary(rs.getDouble(4));
			emp.setDepto(rs.getInt(5));
			list.add(emp);
			
			
		}

		return list;
	}

}
