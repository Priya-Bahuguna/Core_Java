package com.part4;

import java.util.Scanner;

public class Driving {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age:");
        int age=sc.nextInt();
        System.out.println("Do you have a license? true/false");
        boolean hasLicensed = sc.nextBoolean();
        if(age>=18){
            if(hasLicensed){
                System.out.println("you can drive");
            }else{
                System.out.println("you can't drive");
            }
        }else{
            System.out.println("Your age is less than 18");
        }
    }
}
