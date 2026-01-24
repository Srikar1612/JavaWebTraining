package com.ibm.oops;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.ibm.oops.payroll.Employee;
import com.ibm.oops.payroll.Finance;
import com.ibm.oops.payroll.Freelancer;
import com.ibm.oops.payroll.HR;

public class Application
{
	static {
		System.out.print("\u001B[32m");
	}
	public static void main( String[] args )
	{
//		Employee employee=new permanentEmployee();
//		employee.netPay();
//		
//		float f=(float)1.2;
//		
//		Calendar calendar = new GregorianCalendar();
//		System.out.println(calendar);
//		
//		GregorianCalendar gregorianCalendar=(GregorianCalendar)calendar;
//		
//		List<String> list=new LinkedList<String>();
//		
//		if(list instanceof ArrayList) {
//			ArrayList<String> arrayList = (ArrayList<String>)list;
//		}
//		
//		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
//		if( map instanceof HashMap) {
//			HashMap<Integer, Integer> tMap=(HashMap)map;
//			
//		}
		
		Finance finance = new Finance();
		Employee employee1 = HR.recruit("I");
		if(employee1!=null)
				finance.processPay(employee1);
		
		Employee employee2 = HR.recruit("P");
		if(employee2!=null)
			finance.processPay(employee2);
		
		Employee employee3 = HR.recruit("F");
		if(employee3!=null)
			finance.processPay(employee3);
	}
}