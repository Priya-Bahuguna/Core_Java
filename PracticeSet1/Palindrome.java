//approach1(using two pointers)
package com.priya.PracticeSet1;

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();
        int start = 0;
        int end = str.length()-1;
        boolean flag = true;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                flag = false;
                break;
            }
            start++;
            end--;
        }
        if(flag){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}
