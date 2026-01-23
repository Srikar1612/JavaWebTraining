/**
 * 
 */
package com.ibm.client.cui;

/**
 * 
 */
class Point{
	int x;
	int y;
}
public class MainApp {
	public static void main(java.lang.String[] args) {	
		Point point1, point2;
		point1=new Point();
		point1.x=2;
		point1.y=4;
		System.out.println(point1.x+" "+point1.y);
		point2=point1;
		point2.x=3;
		point2.y=6;
		System.out.println(point1.x+" "+point1.y);
		System.out.println(point2.x+" "+point2.y);
	}
}
