//Check whether a character is uppercase or lowercase.
package com.priya.if_else_statement;
import java.util.Scanner;
public class LowercaseOrUppercase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch = sc.nextLine().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println("Lowercase");
        }else{
            System.out.println("Uppercase");
        }
        sc.close();
    }
}
