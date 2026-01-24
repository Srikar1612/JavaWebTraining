package com.ibm.oops.payroll;

public class Finance {
	public void processPay(Employee employee) {
		employee.netPay();
		
		if (employee instanceof permanentEmployee) {
			permanentEmployee pEmployee = (permanentEmployee)employee;
			pEmployee.transportation();
		}
	}
}
