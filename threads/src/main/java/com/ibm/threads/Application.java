package com.ibm.threads;

import java.util.Date;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

//class Runner implements Runnable{
//
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		System.out.println("Current Thread is: "+Thread.currentThread());
//		try {
//			Thread.sleep(2000);
//		}catch (InterruptedException e) {
//			// TODO: handle exception
//		}
//	}
//	
//}

//class Task implements Runnable {
//	int count;
//	
//	public Task(int count) {
//		this.count=count;
//	}
//	
//	@Override
//	public void run() {
//		System.out.println(Thread.currentThread()+" --------> "+count);
////		System.out.println(new Date());
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//}

public class Application
{
	static {
		System.out.print("\u001B[32m");
	}
	public static void main( String[] args )
	{
//		Runner runner = new Runner();
//		Thread producer = new Thread(runner, "Producer");
//		Thread consumer = new Thread(runner, "Consumer");
//		
//		producer.start();
//		consumer.start();
//		
//		try {
//			producer.sleep(1000);
//		}catch (InterruptedException e) {
//			// TODO: handle exception
//		}
//		
//		try {
//			producer.join();
//			consumer.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		System.out.println(producer.getState());
//		System.out.println(consumer.getState());
//		System.out.println("The End");
		
//		ExecutorService executorService = Executors.newFixedThreadPool(100);
//		
//		for(int counter=0;counter<10000000;counter++) {
//			executorService.submit(new Task(counter));
//		}
//		
//		executorService.shutdown();
		
//		int cpu = Runtime.getRuntime().availableProcessors();
//		System.out.println(cpu);
//		ScheduledExecutorService scheduledExecutorService=Executors.newScheduledThreadPool(cpu);
//		
//		ExecutorService executorService = Executors.newCachedThreadPool();
//		
//		System.out.println(new Date());
		
//		scheduledExecutorService.schedule(new Task(1), 10, TimeUnit.SECONDS);
		
//		scheduledExecutorService.scheduleAtFixedRate(new Task(2), 10, 5, TimeUnit.SECONDS);
		
//		scheduledExecutorService.scheduleWithFixedDelay(new Task(3), 10, 5, TimeUnit.SECONDS);
		
//		for(int counter=0;counter<10;counter++) {
//			executorService.submit(new Task(counter));
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO: handle exception
//				e.printStackTrace();
//			}
//		}
		
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread());
			}
		});
		
		thread1.start();
		
		System.out.println("The End");
		
	}
}