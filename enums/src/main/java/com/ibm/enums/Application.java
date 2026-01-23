package com.ibm.enums;

import static com.ibm.enums.types.Apples.*;

import com.ibm.enums.types.Apples;

public class Application
{
	public static void main( String[] args )
	{
		Apples apples;
		apples=FUJI;
		System.out.println(apples);
		
		System.out.println("--------------------------------");
		
		Apples[] apples2 = values();
		for(Apples apple: apples2) {
			System.out.println(apple+" COSTS: "+apple.getPrice());
		}
		System.out.println("--------------------------------");
		System.out.println(valueOf("FUJI"));
		
	}
}