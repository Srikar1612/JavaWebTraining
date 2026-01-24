package com.ibm.exceptions;

public class Application
{
	static {
		System.out.print("\u001B[32m");
	}
	public static void main( String[] args )
	{
		try {
			System.out.println(Integer.parseInt(args[0])/Integer.parseInt(args[1]));
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException exception) {
			System.out.println("You need to provide 2 valid numbers");
		} catch (ArithmeticException e) {
			System.out.println("You can't divide by 0");
		}
		
		System.out.println("The End");
		System.out.print("\u001B[0m");
	}
}