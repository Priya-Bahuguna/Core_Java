//Check Income Tax Slab
package com.priya.if_else_if_statement;
import java.util.Scanner;
public class IncomeTaxSlab {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the income:");
        double income=sc.nextDouble();
        if(income>=1000000){
            System.out.println("20% tax");
        }else if(income>=500000){
            System.out.println("10% tax");
        }else if(income>=300000){
            System.out.println("5% tax");
        }else{
            System.out.println("No tax");
        }
        sc.close();
    }
}
