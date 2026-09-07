package com.priya;

import java.util.Scanner;

public class Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        if (n>0){
            System.out.println("Positive");
        }
       if( n<=0){
           System.out.println();
       }
        sc.close();
    }
}
