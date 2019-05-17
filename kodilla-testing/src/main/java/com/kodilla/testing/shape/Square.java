package com.kodilla.testing.shape;

public class Square implements Shape {
    private String name;
    private double a;


    public Square(String name) {
        this.name = name;
    }

    public String getShapeName(){
        return name = "Square";
    }
    public double getField(){
        return a * a ;
    }

}
