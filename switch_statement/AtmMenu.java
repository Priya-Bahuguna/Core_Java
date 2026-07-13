//ATM menu (Balance, Withdraw, Deposit, Exit).
package com.priya.switch_statement;
import java.util.Scanner;
public class AtmMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 10000;
        System.out.println("=====ATM Menu=======");
        System.out.println("1. Check Balance ");
        System.out.println("2. Withdraw ");
        System.out.println("3. Deposit");
        System.out.println("4. Exit");
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Current Balance Rs : " + balance);
                break;
                case 2:
                    System.out.println("Enter Amount to Withdraw:");
                    double withdraw = sc.nextDouble();
                    if(withdraw>0 && withdraw<=balance){
                        System.out.println("Withdraw Successful");
                        balance = balance -  withdraw;
                        System.out.println("Remaining Balance Rs : " + balance);
                    }else if(withdraw<=0){
                        System.out.println("Invalid withdraw amount");
                }else{
                        System.out.println("Insufficient Balance");
                    }
                    break;
                    case 3:
                        System.out.println("Enter Amount to Deposit:");
                        double deposit = sc.nextDouble();
                        if(deposit>0) {
                            balance = balance + deposit;
                            System.out.println("Deposit Successful");
                            System.out.println("New Balance Rs : " + balance);
                        }else{
                            System.out.println("Invalid deposit amount");
                        }
                        break;
                        case 4:
                            System.out.println("Thank you for using our ATM");
                            break;
                            default:
                                System.out.println("Invalid choice");
        }
        sc.close();
    }
}
