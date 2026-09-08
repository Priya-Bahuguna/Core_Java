package com.part2;

import static java.lang.Math.pow;

public class Circle {
    public static void main(String[] args) {
        double radius= 34.6;
        double area = Math.PI* Math.pow(radius,2);
        System.out.println("Area of circle is "+area);
        double circumference = 2*Math.PI*radius;
        System.out.println("Circumference of circle is "+circumference);
    }
}
