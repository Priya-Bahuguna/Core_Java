//Print Gold, Silver, Bronze, or No Medal based on rank.
package com.priya.if_else_if_statement;
import java.util.Scanner;
public class Rank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rank:");
        int n=sc.nextInt();
        if(n==1){
            System.out.println("Gold");
        }else if(n==2){
            System.out.println("Silver");
        }else if(n==3){
            System.out.println("Bronze");
        }else{
            System.out.println("No Medal");
        }
        sc.close();
    }
}
