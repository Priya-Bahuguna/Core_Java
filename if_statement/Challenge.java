//Write a Java program that:
//
//Takes three inputs:
//Name
//Age
//Marks
//Print:Welcome <Name>
//only if:
//Age is 18 or above
//Marks are 90 or above
package com.priya.if_statement;
import java.util.Scanner;
public class Challenge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a name:");
        String name=sc.nextLine();
        System.out.println("Enter a age:");
        int age=sc.nextInt();
        System.out.println("Enter the marks:");
        int marks=sc.nextInt();
        if(age>=18 && marks>=90){
            System.out.println("Welcome " + name);
        }
        sc.close();
    }
}
