package com.priya.PracticeSet1;
import java.util.Scanner;
public class LargestOfThree2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        System.out.println("Enter the third number:");
        int c = sc.nextInt();
        int max = Math.max(c,Math.max(a,b));
        System.out.println("The largest number is:"+max);
        sc.close();
    }
}
