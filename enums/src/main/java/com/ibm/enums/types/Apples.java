package com.ibm.enums.types;

public enum Apples {
	RED_DEL(500),
	GOLDEN_DEL(800),
	FUJI(1000),
	GREEN(2000);
	
	private int price;
	
	private Apples(int price) {
		this.price=price;
	}
	
	public int getPrice() {
		return price;
	}
}
