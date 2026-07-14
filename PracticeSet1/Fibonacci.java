//To calculate Fibonacci Series up to n numbers.
package com.priya.PracticeSet1;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        if(n>=1){
            System.out.println(a+" ");
        }
        if(n>=2){
            System.out.println(b+" ");
        }
        while(count<n){
            int temp = b;
            b = a + b;
            System.out.println(b);
            a = temp;
            count++;
        }
        sc.close();
    }
}
