package com.opteamix.threads;

public class R implements Runnable {

	@Override
	public synchronized void run() {
		Thread t = Thread.currentThread();
		for(int i=1; i<=100; i++) {
			System.out.println("i: "+i+", Name: "+t.getName());
		}
		System.out.println("Threads are about to exit");	
	}
}
