//Print Child, Teenager, Adult, or Senior Citizen based on age.
package com.priya.if_else_if_statement;
import java.util.Scanner;
public class Citizen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age of the citizen:");
        int age = sc.nextInt();
        if(age>=60){
            System.out.println("Senior Citizen");
        }else if(age>=18){
            System.out.println("Adult");
        }else if(age>=12){
            System.out.println("Teenager");
        }else{
            System.out.println("Child");
        }
        sc.close();
    }
}
