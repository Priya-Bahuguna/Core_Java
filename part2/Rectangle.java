package com.part2;

public class Rectangle {
    public static void main(String[] args) {
        double length = 56.9;
        double width = 12.9;
        double area = length * width;
        System.out.println("Area of rectangle is " + area);
        double perimeter = 2*(length + width);
        System.out.println("perimeter of rectangle is " + perimeter);
    }
}
