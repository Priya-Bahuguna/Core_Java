//approach2(using reverse string)
package com.priya.PracticeSet1;
import java.util.Scanner;
public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String str=sc.nextLine();
        String reverse="";
        for(int i = str.length()-1;i>=0;i--){
            reverse += str.charAt(i);
        }
        if(str.equals(reverse)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}
