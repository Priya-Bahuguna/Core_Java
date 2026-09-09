package com.part4;

import java.util.Scanner;

public class Between {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        if(n>=10 && n<=50){
            System.out.println("no. is between 10 and 50");
        }else {
            System.out.println("no. is not between 10 and 50");
        }
    }
}
