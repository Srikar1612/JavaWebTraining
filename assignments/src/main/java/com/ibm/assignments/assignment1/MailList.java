package com.ibm.assignments.assignment1;

import java.util.LinkedList;

class Address{
	private String name;
	private String street;
	private String city;
	private String state;
	private String code;
	
	public Address(
			String name,
			String street,
			String city,
			String state,
			String code
			) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.street=street;
		this.city=city;
		this.state=state;
		this.code=code;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+"\n"+street+"\n"+city+" "+state+" "+code;
	}
}

public class MailList {
	public void result() {
		LinkedList<Address> mailList = new LinkedList<Address>();
		
		mailList.add(new Address("J.W. West", "11 Oak Ave", "Urbana", "IL", "61801"));
		mailList.add(new Address("Ralph Baker", "1142 Maple Lane", "Mahome", "IL", "61853"));
		mailList.add(new Address("Tom Carlton", "867 Elm St", "Champaign", "IL", "61820"));
		
		for(Address address:mailList)
			System.out.println(address+"\n");
		System.out.println();
	}
}
