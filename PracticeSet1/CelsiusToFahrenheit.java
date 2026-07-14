package com.priya.PracticeSet1;
import java.util.Scanner;
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in celsius: ");
        float tempC = sc.nextFloat();
        float tempF = (tempC*9/5) + 32;
        System.out.println("Celsius to Fahrenheit: " + tempF);

    }
}
// fahrenheit to celsius: tempC= (tempF-32)*5/9