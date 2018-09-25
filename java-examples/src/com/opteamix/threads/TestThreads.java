package com.opteamix.threads;

public class TestThreads {

	public static void main(String[] args) {
		R r = new R();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r,"Third Thread");
		
		t1.start();
		t2.start();
		t3.start();
		Thread t = Thread.currentThread();
		System.out.println("Parent Thread: "+t.getName());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("*********Main method exits************");
	}

}
