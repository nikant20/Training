package com.opteamix.View;

public interface Vehicle {
	boolean horn = true; //horn is a variable which is public static final boolean horn = true
	double mileage(); //compiled to public abstract double mileage();
	int wheels(); ///compiled to abstract int wheels();
}
