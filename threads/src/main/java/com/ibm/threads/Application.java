package com.ibm.threads;

class Runner implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Current Thread is: "+Thread.currentThread());
		try {
			Thread.sleep(2000);
		}catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
	
}

public class Application
{
	static {
		System.out.print("\u001B[32m");
	}
	public static void main( String[] args )
	{
		Runner runner = new Runner();
		Thread producer = new Thread(runner, "Producer");
		Thread consumer = new Thread(runner, "Consumer");
		
		producer.start();
		consumer.start();
		
//		try {
//			producer.sleep(1000);
//		}catch (InterruptedException e) {
//			// TODO: handle exception
//		}
		
		try {
			producer.join();
			consumer.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(producer.getState());
		System.out.println(consumer.getState());
		System.out.println("The End");
	}
}