//Input currency in rupees and output in USD.
package com.priya.PracticeSet1;
import java.util.Scanner;
public class Currency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of currency in Rs:");
        double rs =sc.nextDouble();
        double exchangeRate = 86;
        System.out.println("Exchange Rate is : "+ exchangeRate);
        double usd = rs/exchangeRate;
        System.out.println("Value of currency in USD:"+ usd+"USD");
        sc.close();
    }
}
