package com.priya.switch_statement;
import java.util.Locale;
import java.util.Scanner;
public class Fruit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fruit: ");
        String fruit = sc.next();
        switch (fruit) {           //alt+enter to enhance switch statement
            case "Mango" -> System.out.println("King of Fruit");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Orange" -> System.out.println("Round fruit");
            case "Grapes" -> System.out.println("Small fruit");
            default -> System.out.println("Please enter a valid fruit");
        }
sc.close();
    }
}
