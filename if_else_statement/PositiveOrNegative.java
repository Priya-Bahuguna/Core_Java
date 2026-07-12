//Check whether a number is positive or negative.
package com.priya.if_else_statement;
import java.util.Scanner;
public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if(num>0){
            System.out.println("The number is positive");
        }else{
            System.out.println("The number is negative");
        }
        sc.close();
    }
}
