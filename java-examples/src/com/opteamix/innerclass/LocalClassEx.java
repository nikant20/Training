package com.opteamix.innerclass;

public class LocalClassEx {
	public static void main(String[] args) {
		//System.out.println("X =" +x);//Error can't resolve
		int x = 10;
		System.out.println("X = "+x);
		
		//Local l = new Local();//Error can't resolve
		class Local{
			void f1() {
				System.out.println("f1 method of local class");
			}
		}
		Local l = new Local();
		l.f1();
	}
}
