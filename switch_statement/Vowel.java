//Print vowel using character input (a, e, i, o, u).

package com.priya.switch_statement;
import java.util.Scanner;
public class Vowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch = sc.next().charAt(0);
        switch (ch){
            case 'a':
                System.out.println("its a vowel" );
                break;
                case 'e':
                    System.out.println("its a vowel" );
                    break;
                    case 'i':
                        System.out.println("its a vowel" );
                        break;
                        case 'o':
                            System.out.println("its a vowel" );
                            break;
                            case 'u':
                                System.out.println("its a vowel" );
                                break;
                                case 'A':
                                     System.out.println("its a vowel" );
                                     break;
                                     case 'E':
                                     System.out.println("its a vowel" );
                                     break;
                                     case 'I':
                                         System.out.println("its a vowel" );
                                         break;
                                         case 'O':
                                             System.out.println("its a vowel" );
                                             break;
                                             case 'U':
                                                 System.out.println("its a vowel" );
                                                 break;
                                         default:
                                    System.out.println("its not a vowel");
        }
        sc.close();
    }
}
