package com.priya.switch_statement;

import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Chrome");
        System.out.println("2. Firefox");
        System.out.println("3. Edge");
        System.out.println("4. Safari");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Google Chrome");
                break;

            case 2:
                System.out.println("Mozilla Firefox");
                break;

            case 3:
                System.out.println("Microsoft Edge");
                break;

            case 4:
                System.out.println("Apple Safari");
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}