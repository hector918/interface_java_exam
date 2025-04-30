package org.example;


public class Circle implements Shape {

    private final double radius;


    public Circle(double radius) {
        if(radius <= 0) throw new IllegalArgumentException("radius can not be zero.");
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI * this.radius * 2;
    }

    @Override
    public String getType() {
        return "Circle";
    }

    @Override
    public String toString() {
        return "this is a Circle.";
    }
}