//Write a Java program to:
//
//Input the user's age.
//If the age is 18 or above, print: Eligible to Vote
package com.priya.if_statement;
import java.util.Scanner;
public class Vote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age:");
        int age =sc.nextInt();
        if(age>=18){
            System.out.println("Eligible to vote");
        }
    }
}
