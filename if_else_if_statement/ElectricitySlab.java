//Check Electricity Bill Slab.
package com.priya.if_else_if_statement;
import java.util.Scanner;
public class ElectricitySlab {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of unit:");
        int n=sc.nextInt();
        if (n < 0) {
            System.out.println("Invalid number of units");
        } else if (n == 0) {
            System.out.println("No bill");
        } else if (n >= 450) {
            System.out.println("Rs.8/unit");
        } else if (n >= 250) {
            System.out.println("Rs.6/unit");
        } else if (n >= 150) {
            System.out.println("Rs.4/unit");
        } else {
            System.out.println("Rs.2/unit");
        }
        sc.close();
    }
}
