package com.part4;

import java.util.Scanner;

public class Zero {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a number: ");
            int num = sc.nextInt();
            if (num % 10 == 0) {
                System.out.println("The last digit is zero");
            } else {
                System.out.println("The last digit is not zero");
            }
        }
    }

