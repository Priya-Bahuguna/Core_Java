package com.priya;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int i=sc.nextInt();
        int sum=0;
        while(i>=1){
            sum +=i;
            i--;
        }
        System.out.println(sum);
    }
}
