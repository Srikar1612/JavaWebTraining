package com.ibm.annotations;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class Application
{
	public static void main( String[] args )
	{
		System.out.println("Annotation information: ");
		Class<CustomAnnotationUsage> class1 = CustomAnnotationUsage.class;
		CustomAnnotation classAnnotation = class1.getAnnotation(CustomAnnotation.class);
		
		if(classAnnotation!=null) {
			printAnnotation("Class", classAnnotation);
		}
		
		try {
			Constructor<?> constructor = class1.getDeclaredConstructor();
			CustomAnnotation constructorAnnotation = constructor.getAnnotation(CustomAnnotation.class);
			if(constructorAnnotation!=null) {
				printAnnotation("Constructor", classAnnotation);
			}
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void printAnnotation(String element, CustomAnnotation classAnnotation) {
		// TODO Auto-generated method stub
		System.out.println("Element: "+element);
		System.out.println(" Name: "+classAnnotation.name());
		System.out.println(" Duration: "+classAnnotation.duration());
		System.out.println(" Version: "+Arrays.toString(classAnnotation.version()));
		System.out.println();
	}
}