package com.company;

public class TestShape {
    public static void main(String[] args) {
        Circle figure = new Circle(1,"red", true);
        System.out.println("Are is "+figure.getArea()+'\n');
        System.out.println(figure.toString());
        figure.setRadius(3);
        figure.setFilled(false);
        figure.setColor("White");
        System.out.println(figure.toString());
    }
}
