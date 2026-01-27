package com.ibm.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//class Point<T extends Number>{
//	private T x;
//	private T y;
//	
//	public Point(T x, T y) {
//		this.x=x;
//		this.y=y;
//	}
//	
//	public T getX() {
//		return x;
//	}
//	
//	public void setX(T x) {
//		this.x=x;
//	}
//	
//	public T getY() {
//		return y;
//	}
//	
//	public void setY(T y) {
//		this.y=y;
//	}
//	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return "[x: "+this.x+", y: "+this.y+"]";
//	}
//	
//}


public class Application
{
	static {
		System.out.print("\u001B[33m");
	}
	public Map<Integer, String> getData(){
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "Z");
		map.put(5, "G");
		map.put(2, "Z");
		map.put(3, "U");
		map.put(4, "K");
		map.put(6, "G");
		map.put(7, "O");
		
		return map;
	}
	public static void main( String[] args )
	{
//		Point<Float> point1=new Point<>(2.0f, 4.0f);
//		System.out.println(point1.toString());
//		
//		Point<Integer> point2=new Point<>(2, 4);
//		System.out.println(point2.toString());
		
//		List<String> arrayList = Arrays.asList("A","C","B","E","D");
//		
//		Iterator<String> iterator = arrayList.iterator();
//		
//		while(iterator.hasNext()) {
//			String text =  iterator.next();
//			System.out.println(text);
//		}
		Application application = new Application();
		
		Map<Integer, String> map = application.getData();
		
		for(Entry<Integer, String> entry: map.entrySet()) {
			System.out.println("Key: "+entry.getKey()+" ----->  value: "+entry.getValue());
		}
		
		
		
	}
}