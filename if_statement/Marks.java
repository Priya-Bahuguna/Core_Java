//Write a program to:
//
//Input marks.
//If marks are 90 or above, print: Grade A
package com.priya.if_statement;
import java.util.Scanner;
public class Marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks:");
        int marks=sc.nextInt();
        if(marks>=90){
            System.out.println("Grade A");
        }
        sc.close();
    }
}
