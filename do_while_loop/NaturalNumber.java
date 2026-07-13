//Print natural numbers from 1 to n (user input).
package com.priya.do_while_loop;
import java.util.Scanner;
public class NaturalNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a natural number:");
        int num=sc.nextInt();
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i<=num);
        sc.close();
    }
}
