package com.priya.switch_statement;

import java.util.Scanner;

public class RestaurantMenu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Restaurant Menu =====");
        System.out.println("1. Pizza");
        System.out.println("2. Burger");
        System.out.println("3. Pasta");
        System.out.println("4. Sandwich");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Pizza Price = Rs.250");
                break;

            case 2:
                System.out.println("Burger Price = Rs.120");
                break;

            case 3:
                System.out.println("Pasta Price = Rs.180");
                break;

            case 4:
                System.out.println("Sandwich Price = Rs.100");
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}