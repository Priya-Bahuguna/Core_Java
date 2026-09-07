package com.priya;

import java.util.Scanner;

public class EvenPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        if(n%2==0 && n>0)
        {
            System.out.println("even positive");
        }else{
            System.out.println(" not even positive");
        }
    }
}
