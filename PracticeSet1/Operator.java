//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
package com.priya.PracticeSet1;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        System.out.println("Choose the operator(+, -, *, /):");
        char op = sc.next().charAt(0);
        if(op=='+' ){
            System.out.println("Addition:" + (a+b));
        }
        if(op=='-'){
            System.out.println("Subtraction:" + (a-b));
        }
        if(op=='*'){
            System.out.println("Multiplication:" + (a*b));
        }
        if(op=='/'){
           if(b!=0){
               System.out.println("Division:" + (a/b));
           }else{
               System.out.println("invalid division value");
           }
        }
        sc.close();
    }
}
