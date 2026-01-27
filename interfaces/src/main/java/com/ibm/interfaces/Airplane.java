package com.ibm.interfaces;

public class Airplane implements Flyer {

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		System.out.println("Airplane takeoff");

	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Airplane flying");

	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("Airplane landing");

	}

}
