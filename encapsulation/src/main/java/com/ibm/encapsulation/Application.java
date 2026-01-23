package com.ibm.encapsulation;

import com.ibm.encapsulation.pack1.Base1;
import com.ibm.exception.InvalidAgeException;

class Student{
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws InvalidAgeException {
		if(age<=0)
			throw new InvalidAgeException("Not a valid age");
		this.age = age;
	}
	
}

public class Application
{
	public static void main( String[] args )
	{
		Student student=new Student();
		try {
			student.setAge(-10);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
		System.out.print(student.getAge());
		
		Base1 base1=new Base1();
		base1.pubf=1;
		
	}
}