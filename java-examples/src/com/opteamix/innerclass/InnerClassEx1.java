package com.opteamix.innerclass;

import com.opteamix.innerclass.Outer.Inner2;

public class InnerClassEx1 {
	public static void main(String[] args) {
		Outer.Inner1 inner1 = new Outer.Inner1();
		System.out.println("--------------------");
		Outer.Inner2 inner2 = new Outer().new Inner2(); //one line access
		/*Outer o = new Outer(); //two line procedure
		Outer.Inner2 inner2 = o.new Inner2();*/
	}
}
 class Outer{
	 int x =10;
	 public Outer() {
		System.out.println("Outer Class Initialized");
	 }
	 static class Inner1{
		 public Inner1() {
			 System.out.println("static inner class Initialized.."); //You can't access here the x declared above
		}
	 }
	 class Inner2{
		 int x = 99;//shadowing the enclosing member of the outer class
		 public Inner2() {
			 int x = 88;
			 System.out.println("Non static inner class initialized..");
			 System.out.println(x);//88
			 System.out.println(this.x);//99
			 System.out.println(Outer.this.x);//10
		}
	 }
 }