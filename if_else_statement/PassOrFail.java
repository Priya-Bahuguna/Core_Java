//Check whether a student passed or failed (passing marks = 33).
 package com.priya.if_else_statement;
import java.util.Scanner;
public class PassOrFail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks: ");
        int marks = sc.nextInt();
        if(marks>=33){
            System.out.println("Passed");
        }else{
            System.out.println("Fail");
        }
        sc.close();
    }
}
