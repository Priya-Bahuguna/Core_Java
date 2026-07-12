//Print ticket price category based on age.
package com.priya.if_else_if_statement;

import java.util.Scanner;

public class TicketPrice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("Invalid Age");
        } else if (age < 5) {
            System.out.println("Free Ticket");
        } else if (age <= 12) {
            System.out.println("Child Ticket");
        } else if (age < 60) {
            System.out.println("Adult Ticket");
        } else {
            System.out.println("Senior Citizen Ticket");
        }

        sc.close();
    }
}