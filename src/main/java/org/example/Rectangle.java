package org.example;


public class Rectangle implements Shape {

    private final double width;
    private final double height;


    public Rectangle(double width, double height) {
        if(width <= 0) throw new IllegalArgumentException("width can not less or equal to zero.");
        if(height <= 0) throw new IllegalArgumentException("height can not less or equal to zero.");
        this.width = width;
        this.height = height;
    }


    public double getWidth() {
        return this.width;
    }


    public double getHeight() {
        return this.height;
    }

    @Override
    public double calculateArea() {
        return this.height * this.width;
    }

    @Override
    public double calculatePerimeter() {
        return (this.height + this.width) * 2;
    }

    @Override
    public String getType() {
        if(this.width == this.height){
            return "Square";
        }else{
            return "Rectangle";
        }

    }

    @Override
    public String toString() {
        return String.format("This is a %s.", getType());
    }
}