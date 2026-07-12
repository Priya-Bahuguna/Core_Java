/* Write a Java program to:

Take an integer as input.
If the number is positive, print: positive */
package com.priya.if_statement;
import java.util.Scanner;
public class PositiveNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        if(num>0){
            System.out.println("Positive");
        }
        System.out.println("Program ends");
    }
}