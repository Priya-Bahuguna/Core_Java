package com.priya;

public class EvenSum {
    public static void main(String[] args) {
        int i = 2;
        int sum = 0;
        while(i<=10){
            System.out.println(i);
           sum+=i;

            i+=2;
        }
        System.out.println(" Sum of Even no. from 1 to 10 are : " + sum);
    }
}

