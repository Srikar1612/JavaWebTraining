package com.ibm.assignments.assignment1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task4 {
	public void result() {
		HashMap<String, Double> map = new HashMap<String, Double>();
		
		map.put("John Doe", new Double(3434.34));
		map.put("Tom Smith", new Double(123.22));
		map.put("Jane Baker", new Double(1378.00));
		map.put("Tod Hall", new Double(99.22));
		map.put("Ralph Smith", new Double(-19.08));
		
		Set<Map.Entry<String, Double>> entrySet = map.entrySet();
		
		for(Map.Entry<String, Double> entry:entrySet) {
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
		
		System.out.println();
		
		Double balance = map.get("John Doe");
		map.put("John Doe",balance+1000);
		System.out.println("John Doe's new balance: "+map.get("John Doe"));
	}
}
