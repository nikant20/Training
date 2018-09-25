package com.opteamix.innerclass;

public class AnonymousInnerClassEx {
	public static void main(String[] args) {
		Ex e = new Ex() {
			void f2() {
				super.f2();
				System.out.println("Implemantation Changed");
			}
		};
		e.f1();
		e.f2();
	}
}
class Ex{
	 void f1() {
		System.out.println("F1 method of Ex");

	}
	 void f2() {
		System.out.println("F2 method of Ex");
	}
	
}
