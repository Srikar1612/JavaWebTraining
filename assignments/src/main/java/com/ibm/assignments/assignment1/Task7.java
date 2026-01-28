package com.ibm.assignments.assignment1;

import java.util.Enumeration;
import java.util.Vector;

public class Task7 {
	public void result() {
		Vector<Integer> vector = new Vector<Integer>(3,2);
		System.out.println("Intial size: "+vector.size());
		System.out.println("Initial Capacity: "+vector.capacity());
		
		vector.addElement(1);
		vector.addElement(2);
		vector.addElement(3);
		vector.addElement(4);
		
		System.out.println("Capacity after 4 additions: "+vector.capacity());
		
		vector.addElement(5);
		
		System.out.println("Current capacity: "+vector.capacity());
		
		vector.addElement(6);
		vector.addElement(7);
		
		System.out.println("Current capacity: "+vector.capacity());
		
		vector.addElement(9);
		vector.addElement(10);
		
		System.out.println("Current capacity: "+vector.capacity());
		
		vector.addElement(11);
		vector.addElement(12);
		
		System.out.println("First Element: "+vector.firstElement());
		System.err.println("Last Element: "+vector.lastElement());
		
		if(vector.contains(3))
			System.out.println("Collection contains 3");
		
		Enumeration<Integer> vEnumeration = vector.elements();
		
		while (vEnumeration.hasMoreElements()) {
			Integer integer = (Integer) vEnumeration.nextElement();
			System.out.print(integer+" ");
		}
		System.out.println();
	}
}
