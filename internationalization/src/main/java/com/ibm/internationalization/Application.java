package com.ibm.internationalization;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Application
{
	public static void main( String[] args )
	{
//		double d = 123456.789;
//		NumberFormat numberFormat1 = NumberFormat.getInstance(Locale.ITALY);
//		NumberFormat numberFormat2 = NumberFormat.getInstance(Locale.US);
//		NumberFormat numberFormat3 = NumberFormat.getInstance(Locale.CHINA);
//		NumberFormat numberFormat4 = NumberFormat.getInstance(Locale.CHINESE);
//		
//		System.out.println("Italy representation of "+d+" : "+numberFormat1.format(d));
//		System.out.println("US representation of "+d+" : "+numberFormat2.format(d));
//		System.out.println("China representation of "+d+" : "+numberFormat3.format(d));
		
		Locale defaultLocale = new Locale("fr");
		System.out.println(defaultLocale);
		System.out.println("Default Locale:");
		System.out.println("Language: "+defaultLocale.getLanguage());
		System.out.println("Country: "+defaultLocale.getCountry());
		System.out.println("Display Name "+defaultLocale.getDisplayName());
		System.out.println("Variant: "+defaultLocale.getVariant());
		
		ResourceBundle resourceBundle = ResourceBundle.getBundle("Messages",defaultLocale);
		
		System.out.println("English:");
		printMessages(resourceBundle);
	}

	private static void printMessages(ResourceBundle resourceBundle) {
		// TODO Auto-generated method stub
		
		System.out.println("Greeting: "+resourceBundle.getString("greeting"));
		System.out.println("Question: "+resourceBundle.getString("question"));
		System.out.println("Farewell: "+resourceBundle.getString("farewell"));
		
	}
}