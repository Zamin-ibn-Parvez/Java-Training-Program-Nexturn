package com.nexturn.employee.applications;

import java.util.List;

import com.nexturn.employee.beans.Employee;
import com.nexturn.employee.dao.EmployeeDao;
import com.nexturn.employee.dao.EmployeeDaoImpl;

public class GetAllEmployee {

	public static void main(String[] args) {
		EmployeeDao dao=new EmployeeDaoImpl();
		List<Employee>emplist=dao.getEmployeeList();
		emplist.forEach((e)-> System.out.println(e.getEmpno()+" "+e.getEmpname()+" "+e.getJob()+" "+e.getSalary()+" "+e.getDoj()));

	}

}
