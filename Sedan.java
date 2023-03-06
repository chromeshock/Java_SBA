package com.coreprogram;

public class Sedan extends Car {
	public int length;
	
	public Sedan(int speed, double regularPrice, String color, int length) {
		super(speed, regularPrice, color);	
		this.length = length;
	}

	@Override
	public double getSalePrice() {
		if (length > 20) {
			return super.regularPrice * 0.5;
		} else {
			return super.regularPrice * 0.9;
	    	}
	    }
}
