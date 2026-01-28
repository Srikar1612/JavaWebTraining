package com.ibm.assignments.assignment1;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class Task5 {
	public void result() {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(-8);
		linkedList.add(20);
		linkedList.add(-20);
		linkedList.add(8);
		
		Comparator<Integer> comparator = Collections.reverseOrder();
		
		Collections.sort(linkedList, comparator);
		
		System.out.println("List sorted in reverse: ");
		
		for (Iterator<Integer> iterator = linkedList.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.print(integer+" ");
		}
		
		System.out.println();
		
		Collections.shuffle(linkedList);
		
		System.out.println("List shuffled:");
		
		for (Iterator<Integer> iterator = linkedList.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.print(integer+" ");
		}
		
		System.out.println();
		
		System.out.println("Minimum: "+Collections.min(linkedList));
		System.out.println("Maximum: "+Collections.max(linkedList));
	}
}
