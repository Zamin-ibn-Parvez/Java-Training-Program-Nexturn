package com.nexturn.employee.dao;

import java.util.List;

import com.nexturn.employee.beans.Employee;
import com.nexturn.employee.exceptions.EmployeeCodeAlreadyExistException;

public interface EmployeeDao {
	int addEmployee(Employee emp)throws EmployeeCodeAlreadyExistException;
	int updateEmployee(Employee emp);
	int deleteEmployee(int empno);
	List<Employee>getEmployeeList();
	Employee getEmployeeById(int empno);
}
