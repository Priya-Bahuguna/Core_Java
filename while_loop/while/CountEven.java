package com.priya;

public class CountEven {
    public static void main(String[] args) {
        int i = 2;
        int count = 0;
        while(i<=10){
            System.out.println(i);
            count++;

            i+=2;
        }
        System.out.println("Even no. from 1 to 10 are : " + count);
    }
}
