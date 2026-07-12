//Write a Java program to:
//
//Input a character.
//If the character is 'A', print: Excellent
package com.priya.if_statement;
import java.util.Scanner;
public class Character {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character:");
      char str=sc.nextLine().charAt(0);
      if(str=='A'){
          System.out.println("Excellent");
      }
      sc.close();
    }
}
