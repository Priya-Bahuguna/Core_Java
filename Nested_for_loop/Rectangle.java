//Print a rectangle of * with 4 rows and 6 columns.
package com.priya.Nested_for_loop;

public class Rectangle {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=1;j<=6;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
