package com.ibm.assignments.assignment1;

import java.util.LinkedList;
import java.util.List;

public class Task1 {	
	public void result() {
		LinkedList<String> collection = new LinkedList<String>();
		collection.add("B");
		collection.add("C");
		collection.add("D");
		collection.add("X");
		collection.add("Y");
		collection.add("Z");
		collection.add("A");
		collection.add(1,"A2");
		
		System.out.println("Original contents of result: "+collection);
		
		collection.remove("F");
		collection.remove(2);
		
		System.out.println("Contents of result after deletion: "+collection);
		
		collection.removeFirst();
		collection.removeLast();
		
		System.out.println("result ater deleting first and last: "+collection);
		
		String val = collection.get(2);
		collection.set(2, val+"changed");
		
		System.out.println("result ater change: "+collection);
	}
}
