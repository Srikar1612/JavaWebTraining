package com.ibm.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ibm.spring.beans.TextEditor;
import com.ibm.spring.config.BeanConfig;
import com.ibm.spring.services.OrderService;

public class Application {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		
//		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);

//		
//		  TextEditor textEditor = (TextEditor)
//		  applicationContext.getBean("textEditor");
//		  
//		  textEditor.spellCheck();
		 
//
//		TextEditor textEditor = (TextEditor) applicationContext.getBean("textEditor");

//		SpellChecker spellChecker1 = (SpellChecker) applicationContext.getBean("spellChecker");
//		
//		SpellChecker spellChecker2 = (SpellChecker) applicationContext.getBean("spellChecker");
//		
//		SpellChecker spellChecker3 = (SpellChecker) applicationContext.getBean("spellChecker");
//		
//		spellChecker1.CheckSpelling();
//		
//		AbstractApplicationContext abstractApplicationContext = (ClassPathXmlApplicationContext) applicationContext;
//		abstractApplicationContext.registerShutdownHook();
		
//		JavaCollections javaCollections = (JavaCollections) applicationContext.getBean("JavaCollections");
//		System.out.println("List Address");
//		List<String> listAddress = javaCollections.getAddressList();
//		listAddress.forEach(System.out::println);
//		System.out.println();
//		System.out.println("Set Address");
//		Set<String> setAddress = javaCollections.getAddressSet();
//		setAddress.forEach(System.out::println);
//		System.out.println();
//		Map<String, String> mapAddress = javaCollections.getAddressMap();
//		System.out.println("Map Address");
//		for (Map.Entry<String, String> entry : mapAddress.entrySet()) {
//			String key = entry.getKey();
//			String val = entry.getValue();
//			System.out.println(key+"--------->"+val);
//		}
//		System.out.println();
//		System.out.println("Properties Address");
//		Properties propertiesAddress = javaCollections.getAddressProperties();
//		for (Entry<Object, Object> entry : propertiesAddress.entrySet()) {
//			Object key = entry.getKey();
//			Object val = entry.getValue();
//			System.out.println(key+"--------->"+val);
//		}
		
//		TextEditor textEditor = (TextEditor) applicationContext.getBean("textEditor");
//		textEditor.spellCheck();
		
		OrderService orderService = (OrderService) applicationContext.getBean("orderService");
		orderService.makePayment(100.50);
		
		System.out.println("End");
	}
}