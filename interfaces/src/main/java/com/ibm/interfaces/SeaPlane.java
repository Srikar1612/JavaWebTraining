package com.ibm.interfaces;

public class SeaPlane implements Flyer, Sailor {

	@Override
	public void sail() {
		// TODO Auto-generated method stub
		System.out.println("SeaPlane sail");

	}

	@Override
	public void dock() {
		// TODO Auto-generated method stub
		System.out.println("Seaplane dock");
	}

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		System.out.println("SeaPlane takeOff");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("SeaPlane takeOff");
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("SeaPlane takeOff");
	}

}
