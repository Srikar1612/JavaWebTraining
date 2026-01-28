package com.ibm.assignments;

import com.ibm.assignments.assignment1.MailList;
import com.ibm.assignments.assignment1.Task1;
import com.ibm.assignments.assignment1.Task2;
import com.ibm.assignments.assignment1.Task4;
import com.ibm.assignments.assignment1.Task5;
import com.ibm.assignments.assignment1.Task6;
import com.ibm.assignments.assignment1.Task7;

public class Application
{
	public static void main( String[] args )
	{
		Task1 task1 = new Task1();
		task1.result();
		
		Task2 task2 = new Task2();
		task2.result();
		
		MailList mailList=new MailList();
		mailList.result();
		
		Task4 task4 = new Task4();
		task4.result();
		
		Task5 task5 = new Task5();
		task5.result();
		
		Task6 task6 = new Task6();
		task6.result();
		
		Task7 task7 = new Task7();
		task7.result();
		
	}
}