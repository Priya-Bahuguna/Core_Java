package com.priya;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int i=sc.nextInt();
        while(i>=1){
            System.out.println(i);
            i--;
        }

    }
}
