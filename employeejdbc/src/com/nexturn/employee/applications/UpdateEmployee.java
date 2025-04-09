package com.nexturn.employee.applications;

import com.nexturn.employee.beans.Employee;
import com.nexturn.employee.dao.EmployeeDao;
import com.nexturn.employee.dao.EmployeeDaoImpl;

public class UpdateEmployee {

	public static void main(String[] args) {
		EmployeeDao dao=new EmployeeDaoImpl();
		Employee empl=new Employee();
		empl.setEmpno(102);
		empl.setEmpname("Muneez");
		empl.setJob("Electrical Engineer");
		empl.setSalary(60000);
		empl.setDoj("28-12-2025");
		int rows=dao.updateEmployee(empl);
		if(rows>0) {
			System.out.println("Updated");
		}else {
			System.out.println("Not Updated");
		}

	}

}
