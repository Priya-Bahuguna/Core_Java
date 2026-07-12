//Find the greater of two numbers.
package com.priya.if_else_statement;
import java.util.Scanner;
public class Greater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a=sc.nextInt();
        System.out.println("Enter the second number: ");
        int b=sc.nextInt();
        if(a>b){
            System.out.println("a is greater than b");
        }else{
            System.out.println("b is greater than a");
        }
        sc.close();
    }
}
