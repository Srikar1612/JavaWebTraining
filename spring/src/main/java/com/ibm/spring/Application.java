package com.ibm.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ibm.spring.beans.SpellChecker;
import com.ibm.spring.beans.TextEditor;


public class Application
{
	public static void main( String[] args )
	{
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		
		/*
		 * TextEditor textEditor = (TextEditor)
		 * applicationContext.getBean("textEditor");
		 * 
		 * textEditor.spellCheck();
		 */
		
		SpellChecker spellChecker1 = (SpellChecker) applicationContext.getBean("spellChecker");
		
		SpellChecker spellChecker2 = (SpellChecker) applicationContext.getBean("spellChecker");
		
		SpellChecker spellChecker3 = (SpellChecker) applicationContext.getBean("spellChecker");
		
		spellChecker1.CheckSpelling();
		
		ClassPathXmlApplicationContext classPathXmlApplicationContext = (ClassPathXmlApplicationContext) applicationContext;
		classPathXmlApplicationContext.registerShutdownHook();
	}
}