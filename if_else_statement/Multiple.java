package com.priya;

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        if(n%5==0){
            System.out.println("Multiple of 5");
        }else{
            System.out.println("Not a multiple of 5");
        }
        sc.close();
    }
}
