//Print month season (Winter, Summer, Rainy) using month number.
package com.priya.if_else_if_statement;
import java.util.Scanner;

public class MonthSeason {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the month number (1-12): ");
        int month = sc.nextInt();

        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Winter");
        } else if (month >= 3 && month <= 6) {
            System.out.println("Summer");
        } else if (month >= 7 && month <= 11) {
            System.out.println("Rainy");
        } else {
            System.out.println("Invalid Month");
        }

        sc.close();
    }
}