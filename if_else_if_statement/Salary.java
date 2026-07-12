//Print Low, Medium, or High Salary.
package com.priya.if_else_if_statement;
import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the monthly salary:");
        double salary=sc.nextDouble();
        if(salary>=10000){
            System.out.println("High salary");
        }else if(salary>=5000){
            System.out.println("Medium salary");
        }else{
            System.out.println("Low salary");
        }
        sc.close();
    }
}
