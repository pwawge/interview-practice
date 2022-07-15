package com.practice.multithreading;

public class TestMultithreading {

	public static void main(String[] args) throws InterruptedException {
				
		
		CreateThread t1 = new CreateThread(1);
		
		CreateThread t2 = new CreateThread(2);
		
		Thread t111=new Thread(t1,"T1");
        Thread t2222=new Thread(t2,"T2");
		
        t111.start();
        t2222.start();
		
	}
}
