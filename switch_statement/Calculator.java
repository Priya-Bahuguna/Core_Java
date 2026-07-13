//Create a calculator using +, -, *, /
package com.priya.switch_statement;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        double a = sc.nextDouble();
        System.out.println("Enter the second number:");
        double b = sc.nextDouble();
        System.out.println("Enter the operator(+,-,*,/):");
        String operator = sc.next();
        switch(operator){
            case "+":
                System.out.println("Addition = " + (a+b));
                break;
                case "-":
                    System.out.println("Subtraction = " + (a-b));
                    break;
                    case "*":
                        System.out.println("Multiplication = " + (a*b));
                        break;
                        case "/":
                            if(b!=0) {
                                System.out.println("Division = " + (a / b));
                            }else{
                                System.out.println("Cannot divide by zero");
                            }
                            break;
                            default:
                                System.out.println("Invalid input");
        }
        sc.close();
    }
}
