package com.ibm.lambda;

import java.util.Arrays;
import java.util.List;

interface Printer{
	public void printing(String name, int count);
}

class Process{
	public void execute(String name, int count, Printer printer) {
		printer.printing(name, count);
	}
}

public class Application
{
	public static void main( String[] args )
	{
		Process process = new Process();
		process.execute("HP",5,Application::printIt);
		process.execute("Canon", 8, (name, count)->System.out.println(name+" printer printing "+count+" pages"));
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
		
		list.forEach((number)->System.out.print(number));
		list.forEach(number-> System.out.println(number));
		
		list.forEach(System.out::println);
		
		list.stream()
				.map(element->String.valueOf(element))
				.forEach(System.out::println);
		
		list.stream()
				.map(String::valueOf)
				.forEach(System.out::println);
		
		System.out.println( list.stream()
				.reduce(0, (total, element)-> Integer.sum(total, element)));
		
		System.out.println( list.stream()
				.reduce(0, Integer::sum));
	}
	
	static void printIt(String name, int count) {
		System.out.println(name+" printer printing "+count+" pages");
	}
}