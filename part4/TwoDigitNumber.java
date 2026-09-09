//Check whether a number is a two-digit number.
package com.part4;
import java.util.Scanner;

public class TwoDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();
        if (num >= 10 && num <= 99) {
            System.out.println("Two-digit number");
        } else {
            System.out.println("Not a two-digit number");
        }
    }
}
