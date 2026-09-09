package com.part4;

import java.util.Scanner;

public class Marks75 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the marks:");
        int marks=sc.nextInt();
        if(marks>75){
            System.out.println("marks is greater than 75");
        }else{
            System.out.println("marks is less than 75");
        }
    }
}
