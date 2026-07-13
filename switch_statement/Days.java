package com.priya.switch_statement;
import java.util.Scanner;
public class Days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days(1-7): ");
        int days = sc.nextInt();
        switch (days) {
            case 1 :
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekends");
                break;
            default:
                System.out.println("Invalid input");
        }
        sc.close();
    }
}
