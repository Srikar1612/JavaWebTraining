package com.ibm.classObjects.mammals;

import com.ibm.classObjects.mammals.organs.HumanEye;

public class Human {
	public HumanEye leftEye, rightEye;
	public Human() {
		leftEye=new HumanEye();
		rightEye=new HumanEye();
	}
}
