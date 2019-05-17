package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String name;
    private double a;
    private double h;

    public Triangle(String name) {
        this.name = name;
    }
    public String getShapeName(){
        return name = "Triangle";
    }
    public double getField() {
        return (a / 2) * h;
    }
}