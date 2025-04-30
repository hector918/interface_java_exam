package org.example;


public class Triangle implements Shape {

    private final double sideA;
    private final double sideB;
    private final double sideC;


    public Triangle(double sideA, double sideB, double sideC) {
        if((sideA + sideB) <= sideC || (sideB + sideC) <= sideA || (sideA + sideC) <= sideB){
            throw new IllegalArgumentException("any two sides must be larger or equal to third side.");
        }
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }


    public double getSideA() {
        return this.sideA;
    }


    public double getSideB() {
        return this.sideB;
    }


    public double getSideC() {
        return this.sideC;
    }

    @Override
    public double calculateArea() {
        double perimeter = this.calculatePerimeter() / 2;
        return Math.sqrt(perimeter * (perimeter - this.sideA) * (perimeter - this.sideB) * (perimeter - this.sideC));
 
    }

    @Override
    public double calculatePerimeter() {
        return this.sideA + this.sideB + this.sideC;
    }

    @Override
    public String getType() {
        if(this.sideA == this.sideB && this.sideA == this.sideC){
            return "Equilateral Triangle";
        }else if(this.sideA == this.sideB || this.sideA == this.sideC || this.sideB == this.sideC){
            return "Isosceles Triangle";
        }else{
            return "Scalene Triangle";
        }
   
    }

    @Override
    public String toString() {
        return String.format("This is a %s.", getType());
    }
}