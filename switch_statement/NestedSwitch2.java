package com.priya.switch_statement;

import java.util.Scanner;

public class NestedSwitch2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Select College");
        System.out.println("1. Engineering");
        System.out.println("2. Management");

        int college = sc.nextInt();

        switch (college) {

            case 1:

                System.out.println("Select Course");
                System.out.println("1. CSE");
                System.out.println("2. Civil");

                int course = sc.nextInt();

                switch (course) {

                    case 1:
                        System.out.println("Computer Science Engineering");
                        break;

                    case 2:
                        System.out.println("Civil Engineering");
                        break;

                    default:
                        System.out.println("Invalid Course");
                }
                break;

            case 2:

                System.out.println("Select Course");
                System.out.println("1. MBA");
                System.out.println("2. BBA");

                int management = sc.nextInt();

                switch (management) {

                    case 1:
                        System.out.println("Master of Business Administration");
                        break;

                    case 2:
                        System.out.println("Bachelor of Business Administration");
                        break;

                    default:
                        System.out.println("Invalid Course");
                }
                break;

            default:
                System.out.println("Invalid College");
        }

        sc.close();
    }
}