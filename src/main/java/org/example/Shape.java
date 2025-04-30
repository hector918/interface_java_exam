package org.example;

public interface Shape {
 
    default double calculateArea(){
        return 0;
    };

    default double calculatePerimeter(){
        return 0;
    };

    default String getType(){
        return "Shape";
    }
}
