package com.coreprogram;

public class MyOwnAutoShop {

	public static void main(String[] args) {
		
		// instances
		Sedan sedan = new Sedan(60, 20000.00, "blue", 25);
		
		Ford ford = new Ford(130, 70000.00, "red");
		
		Ford ford2 = new Ford(110, 55000.00, "white");	
		
		Car car = new Car(150, 45000.00, "green");
		
		//sales prices
		System.out.printf("Sale price of sedan is: $%,.2f\n", sedan.getSalePrice());
		System.out.printf("Sale price of car is: $%,.2f\n", car.getSalePrice());
		System.out.printf("Sale price of ford2 is: $%,.2f\n", ford.getSalePrice());
		System.out.printf("Sale price of ford2 is: $%,.2f\n", ford2.getSalePrice());
	}
}
