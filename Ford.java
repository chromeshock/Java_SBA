package com.coreprogram;

	public class Ford extends Car {
		public int year;
    	private int manufacturerDiscount;
		
    	
    	public Ford(int speed, double regularPrice, String color) {
			super(speed, regularPrice, color);
			
		}
    	
    	@Override
    	public double getSalePrice() {
			return super.getSalePrice() - manufacturerDiscount;
		}
}	
