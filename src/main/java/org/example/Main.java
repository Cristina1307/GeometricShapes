package org.example;

import com.itfactory.GeometricShape;
import com.itfactory.Rectangle;
import com.itfactory.Square;
import com.itfactory.Triangle;

public class Main {
    public static void main(String[] args){
    GeometricShape triangle = new Triangle(3, 4, 5);
    GeometricShape square = new Square(4);
    GeometricShape rectangle = new Rectangle(3, 6);

System.out.println("Perimetrul triunghiului: " + triangle.calculatePerimeter());
        System.out.println("Perimetrul patratului: " + square.calculatePerimeter());
        System.out.println("Perimetrul dreptunghiului: " + rectangle.calculatePerimeter());
}
}
