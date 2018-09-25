package com.opteamix.Abstraction;

import com.opteamix.View.Vehicle;

public class TestAbstraction {
	
	public static void passVehicle(Vehicle v) {
		System.out.println("Mileage: "+v.mileage());
		System.out.println("Wheels: "+v.wheels());
	}

	public static void main(String[] args) {
		Car innova  = new Innova();
		Car swift = new Swift();
		Car bike = new Bike();
				
		passVehicle(innova);
		System.out.println("-------------");
		passVehicle(swift);
		System.out.println("--------------");
		passVehicle(bike);
		System.out.println("---------------");
		innova.CarDetails();
		System.out.println("---------------");
		swift.CarDetails();
	}

}
