package com.nexturn.employee.utils;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateConversion {

	public static java.sql.Date convertDate(String strdate){
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Date utilDate=null;
		try {
			utilDate = sdf.parse(strdate);
		}catch (ParseException e) {
			e.printStackTrace();
		}
		java.sql.Date sqlDate= new java.sql.Date(utilDate.getTime());
		return sqlDate;
	}
}
