//Input a number.
//If the number is divisible by 5, print: Divisible by 5
package com.priya.if_statement;
import java.util.Scanner;
public class Divisible {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=sc.nextInt();
        if(number%5==0){
            System.out.println("The number is divisible by 5");
        }
        sc.close();
    }
}
