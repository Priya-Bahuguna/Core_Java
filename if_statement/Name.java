//Write a Java program to:
//
//Input your name.
//If the name is exactly: Priya
package com.priya.if_statement;
import  java.util.Scanner;
public class Name {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a name:");
        String name = sc.nextLine();
        if(name.equalsIgnoreCase("Priya")){    // ignore lowercase and uppercase
            System.out.println("Welcome Priya!");
        }
        sc.close();
    }
}

