package com.coreprogram;

// car class
public class Car {
    protected int speed;
    protected double regularPrice;
    protected String color;

    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }
    
    //get method for sales price
    public double getSalePrice() {
        return regularPrice;
    }

    
    
    
}