//Compare two ages and print who is older.
package com.priya.if_else_statement;
import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first age:");
        int a=sc.nextInt();
        System.out.println("Enter the second age:");
        int b=sc.nextInt();
        if(a>b){
            System.out.println("a is older than b");
        }else{
            System.out.println("b is older than a");
        }
        sc.close();
    }
}
