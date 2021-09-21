package com.company;
import java.lang.*;
public class Circle extends  Shape {
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius=radius;
        this.color=color;
        this.filled=filled;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }//alt+insert->toString()

    @Override
    double getArea() {
        return (Math.PI*radius*radius);
    }//ctrl+o

    @Override
    double getPerimeter() {
        return (2*Math.PI*radius);
    }
}
