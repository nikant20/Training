package com.opteamix.core;

public class TestRuntimeProcess {

	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		try {
			Process process = runtime.exec("notepad.exe");
			System.out.println("Notepad opens");
			Thread.sleep(15000);
			process.destroy();
			System.out.println("Notepad Closes");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
