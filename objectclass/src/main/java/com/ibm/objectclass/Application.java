package com.ibm.objectclass;

class Point{
	public int x;
	public int y;
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj!=null && obj instanceof Point) {
			Point point2=(Point)obj;
			if(this.x==point2.x && this.y==point2.y)
				return true;
		}
		return false;
	}
}

public class Application
{
	public static void main( String[] args )
	{
		Point point1=null,point2=null;
		
		point1=new Point();
		point2=new Point();
		
		point1.x=2;
		point1.y=4;
		point2.x=2;
		point2.y=4;
		
		System.out.println(point1.equals(point2));
		
		
	}
}