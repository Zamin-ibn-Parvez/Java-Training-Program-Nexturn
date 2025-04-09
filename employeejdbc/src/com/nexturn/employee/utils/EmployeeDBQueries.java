package com.nexturn.employee.utils;

public class EmployeeDBQueries {
	public static final String ADDEMPL=
			" insert into employee values(?,?,?,?,?)";
	public static final String GETEMP_BY_ID=
			"select * from employee where empno=?";
	public static final String UPDATEEMP=
			"update employee set empname=?, job=?, salary=?, doj=? where empno=?";
	public static final String GET_ALL_EMPLS=
			"select * from employee";
}
