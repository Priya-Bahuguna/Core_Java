//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
package com.priya.PracticeSet1;
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal:");
        double p = sc.nextDouble();
        System.out.println("Enter time:");
        double t= sc.nextDouble();
        System.out.println("Enter rate:");
        double r = sc.nextDouble();
        double si = (p*r*t)/100;
        System.out.println("Simple interest is "+ si);
        sc.close();
    }
}
