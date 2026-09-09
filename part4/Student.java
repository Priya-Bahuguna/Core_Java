package com.part4;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the marks:");
        int marks=sc.nextInt();
        if(marks>=45){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
    }
}
