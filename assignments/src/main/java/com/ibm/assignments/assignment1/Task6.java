package com.ibm.assignments.assignment1;

import java.util.Arrays;

public class Task6 {
	public void result() {
		int[] array = new int[10];
		
		for (int i = 0; i < array.length; i++) {
			array[i]=-3*i;
		}
		
		System.out.println("Original Contents:");
		display(array);
		
		Arrays.sort(array);
		System.out.println("Sorted: ");
		display(array);
		
		Arrays.fill(array, 2, 6, -1);
		System.out.println("After fill: ");
		display(array);
		
		Arrays.sort(array);
		System.out.println("Again sorted: ");
		display(array);
		
		System.out.print("The value -9 is at location: ");
		int index=Arrays.binarySearch(array, -9);
		System.out.println(index);
		
	}
	
	public static void display(int[] array) {
		for (int i : array) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
