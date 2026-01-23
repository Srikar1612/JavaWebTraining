package com.ibm.oops;

import com.ibm.oops.payroll.Employee;
import com.ibm.oops.payroll.permanentEmployee;

public class Application
{
	public static void main( String[] args )
	{
		Employee employee=new permanentEmployee();
		employee.netPay();
	}
}