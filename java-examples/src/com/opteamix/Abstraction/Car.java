package com.opteamix.Abstraction;

import com.opteamix.View.Vehicle;

public abstract class Car implements Vehicle {
		@Override
		public int wheels() {
			// TODO Auto-generated method stub
			return 4;
		}
		
		public void CarDetails() {
			System.out.println("Horn is present: "+horn);
			System.out.println("Number of Wheels: "+wheels());
			System.out.println("Mileage of Car: "+mileage());
		}
}
