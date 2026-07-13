package com.priya.switch_statement;

import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the month number (1-12): ");
        int month = sc.nextInt();

        switch (month) {

            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Summer");
                break;

            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("Rainy");
                break;

            case 10:
            case 11:
                System.out.println("Autumn");
                break;

            default:
                System.out.println("Invalid month number");
        }

        sc.close();
    }
}