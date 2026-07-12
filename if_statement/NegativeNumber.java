//Write a program to:
//
//Input a number.
//If the number is negative, print: negative
package com.priya.if_statement;
import java.util.Scanner;
public class NegativeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if(num<0){
            System.out.println("Negative");
        }
        System.out.println("Program ends");
    }
}
