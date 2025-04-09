package com.nexturn.employee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nexturn.employee.beans.Employee;
import com.nexturn.employee.exceptions.EmployeeCodeAlreadyExistException;
import com.nexturn.employee.utils.DatabaseConnections;
import com.nexturn.employee.utils.DateConversion;
import com.nexturn.employee.utils.EmployeeDBQueries;

public class EmployeeDaoImpl implements EmployeeDao{

	Connection conn;
	PreparedStatement pst;
	ResultSet rs;
	
	@Override
	public int addEmployee(Employee emp) {
		int rows=0;
		conn=DatabaseConnections.getDbConnection();
		try {
			pst=conn.prepareStatement(EmployeeDBQueries.GETEMP_BY_ID);
			pst.setInt(1, emp.getEmpno());
			rs=pst.executeQuery();
			if(rs.next())
				throw new EmployeeCodeAlreadyExistException();
			pst=conn.prepareStatement(EmployeeDBQueries.ADDEMPL);
			pst.setInt(1, emp.getEmpno());
			pst.setString(2, emp.getEmpname());
			pst.setString(3, emp.getJob());
			pst.setDouble(4, emp.getSalary());
			pst.setDate(5, DateConversion.convertDate(emp.getDoj()));
			rows=pst.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DatabaseConnections.closeDBConnection();
		}
		return rows;
	}

	@Override
	public int updateEmployee(Employee emp) {
		int rows=0;
		conn=DatabaseConnections.getDbConnection();
		try {
			pst=conn.prepareStatement(EmployeeDBQueries.UPDATEEMP);
			pst.setString(1, emp.getEmpname());
			pst.setString(2, emp.getJob());
			pst.setDouble(3, emp.getSalary());
			pst.setDate(4, DateConversion.convertDate(emp.getDoj()));
			pst.setInt(5, emp.getEmpno());
			rows=pst.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DatabaseConnections.closeDBConnection();
		}
		return rows;
	}

	@Override
	public int deleteEmployee(int empno) {
		
		return 0;
	}

	@Override
	public List<Employee> getEmployeeList() {
		conn=DatabaseConnections.getDbConnection();
		List<Employee> emplist=new  ArrayList<Employee>();
		try {
			pst=conn.prepareStatement(EmployeeDBQueries.GET_ALL_EMPLS);
			rs=pst.executeQuery();
			while(rs.next()) {
				Employee emp=new Employee();
				emp.setEmpno(rs.getInt(1));
				emp.setEmpname(rs.getString(2));
				emp.setJob(rs.getString(3));
				emp.setSalary(rs.getDouble(4));
				emp.setDoj(rs.getDate(5).toString());
				emplist.add(emp);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return emplist;
	}

	@Override
	public Employee getEmployeeId(int empno) {
		
		return null;
	}

}
