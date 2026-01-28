package com.ibm.assignments.assignment1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Task2 {
	public void result() {
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("C");
		arrayList.add("A");
		arrayList.add("E");
		arrayList.add("B");
		arrayList.add("D");
		arrayList.add("F");
		
		System.out.println("Original contents of arrayList: ");
		
		Iterator<String> iterator = arrayList.iterator();
		
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.print(string+" ");
		}
		
		ListIterator<String> listiterator = arrayList.listIterator();
		while (listiterator.hasNext()) {
			String string = (String) listiterator.next()+"+";
			listiterator.set(string);
		}
		
		System.out.println();
		
		System.out.println("Modified contents of arrayList");
		
		listiterator=arrayList.listIterator();
		
		while (listiterator.hasNext()) {
			String string = (String) listiterator.next();
			System.out.print(string+" ");
		}
		
		System.out.println();
		
		System.out.println("Modified list backwards:");
		
		while (listiterator.hasPrevious()) {
			String string = (String) listiterator.previous();
			System.out.print(string+" ");
			
		}
		
	}
}
