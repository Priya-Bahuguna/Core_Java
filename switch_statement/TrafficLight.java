package com.priya.switch_statement;

import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Traffic Light (R, Y, G): ");
        char light = sc.next().charAt(0);

        switch (Character.toUpperCase(light)) {

            case 'R':
                System.out.println("Stop");
                break;

            case 'Y':
                System.out.println("Ready");
                break;

            case 'G':
                System.out.println("Go");
                break;

            default:
                System.out.println("Invalid Traffic Light");
        }

        sc.close();
    }
}