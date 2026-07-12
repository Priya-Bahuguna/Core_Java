//Print Grade A, B, C, D, or Fail based on marks
package com.priya.if_else_if_statement;
import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks: ");
        int marks=sc.nextInt();
        if(marks>=90){
            System.out.println("A");
        }else if(marks>=80){
            System.out.println("B");
        }else if(marks>=70){
            System.out.println("C");
        }else if(marks>=60){
            System.out.println("D");
        }else {
            System.out.println("Fail");
        }
        sc.close();
    }
}
