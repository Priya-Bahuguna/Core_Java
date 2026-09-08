package com.part2;
import static java.lang.Math.pow;
public class Cylinder {
    public static void main(String[] args) {
        double radius= 56.8;
        double height=3.6;
        double volume = Math.PI*Math.pow(radius,2)*height;
        double curvedSurfaceArea=2*(Math.PI)*radius*height;
        System.out.println("Surface Area:"+curvedSurfaceArea);
    }
}
