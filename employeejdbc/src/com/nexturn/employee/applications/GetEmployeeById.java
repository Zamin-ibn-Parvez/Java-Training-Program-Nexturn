package com.nexturn.employee.applications;

import com.nexturn.employee.beans.Employee;
import com.nexturn.employee.dao.EmployeeDao;
import com.nexturn.employee.dao.EmployeeDaoImpl;

public class GetEmployeeById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDao employeeDao = new EmployeeDaoImpl();
		Employee emp1 = employeeDao.getEmployeeById(101);
		
		if(emp1==null)
		{
			System.out.println("Not AVAIBALE");
		}else {
			System.out.println(emp1.getEmpname()+"  "+emp1.getJob()+"  "+emp1.getSalary()+"   "+emp1.getDoj());

		}
		
	}

}