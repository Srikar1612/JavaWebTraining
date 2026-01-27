package com.ibm.interfaces;

//class IllegalAgeException extends Exception{
//
//	private static final long serialVersionUID = 1L;
//
//	@Override
//	public String getMessage() {
//		// TODO Auto-generated method stub
//		return  "You must be 18 or above to register for vote";
//	}
//	
//	public IllegalAgeException(String message) {
//		// TODO Auto-generated constructor stub
//		super(message);
//	}
//	
//	public IllegalAgeException() {
//		// TODO Auto-generated constructor stub
//	}
//}
//
//class Voting{
//	void register(int age) throws IllegalAgeException {
//		if(age<18)
//			throw new IllegalAgeException("age must be greater than or equal to 18");
//	}
//}

class Test{
	public void test1() throws ClassNotFoundException {
		// TODO Auto-generated method stub
		test2();
		System.out.println("Test 1 completed");

	}
	
	public void test2() throws ClassNotFoundException {
		test3();
		System.out.println("Test 2 completed");
	}
	
	public void test3() throws ClassNotFoundException {
		test4();
		System.out.println("Test 3 completed");
	}
	
	public void test4() throws ClassNotFoundException {
		Class.forName("java.util.Date");
		System.out.println("Test 4 completed");
	}
	
}

public class Application
{
	
	static {
		System.out.print("\u001B[32m");
	}
	
//	public void land(Flyer flyer) {
//		flyer.land();
//	}
//	
//	public void takeOff(Flyer flyer) {
//		flyer.takeOff();
//	}
//	
//	public void fly(Flyer flyer) {
//		flyer.fly();
//	}
//	
//	public void sail(Sailor sailor) {
//		sailor.sail();
//	}
//	
//	public void dock(Sailor sailor) {
//		sailor.dock();
//	}
	
	public static void main( String[] args )
	{
//		Application application = new Application();
//		
//		Airplane airplane = new Airplane();
//		
//		application.takeOff(airplane);
//		application.fly(airplane);
//		application.land(airplane);
//		System.out.println();
//		
//		Bird bird = new Bird();
//		
//		application.takeOff(bird);
//		application.fly(bird);
//		application.land(bird);
//		System.out.println();
//		
//		SeaPlane seaPlane = new SeaPlane();
//		
//		application.takeOff(seaPlane);
//		application.fly(seaPlane);
//		application.land(seaPlane);
//		application.sail(seaPlane);
//		application.dock(seaPlane);
		
//		Voting voting = new Voting();
//		try {
//			voting.register(16);
//		} catch (IllegalAgeException exception) {
//			// TODO Auto-generated catch block
//			System.out.println(exception.getMessage());
//			exception.printStackTrace();
//		}
		
		Test test = new Test();
		try {
			test.test1();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("The End");
		
		
	}
}