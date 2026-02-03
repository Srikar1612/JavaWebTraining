package com.ibm.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("textEditor")
public class TextEditor {

	private SpellChecker spellChecker;

	public TextEditor() {
		super();
		System.out.println("Inside TextEditor no-args Constructor.");
	}
	
	
	public TextEditor(SpellChecker spellChecker) {
		super();
		System.out.println("Inside TextEditor Constructor.");
		this.spellChecker = spellChecker;
	}

	@Autowired
//	@Qualifier("spellChecker2")
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	public void spellCheck() {
		spellChecker.CheckSpelling();
	}

	public void init() {
		System.out.println("Text Editor Initialized");
	}

	public void destroy() {
		System.out.println("Text Editor Destroyed");
	}

}
