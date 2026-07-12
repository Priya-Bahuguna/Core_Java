//Print Division Based on Percentage
package com.priya.if_else_if_statement;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter percentage: ");
        double percentage = sc.nextDouble();

        if (percentage < 0 || percentage > 100) {
            System.out.println("Invalid Percentage");
        } else if (percentage >= 60) {
            System.out.println("First Division");
        } else if (percentage >= 45) {
            System.out.println("Second Division");
        } else if (percentage >= 33) {
            System.out.println("Third Division");
        } else {
            System.out.println("Fail");
        }

        sc.close();
    }
}