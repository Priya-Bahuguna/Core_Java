package com.part1;

public class Marks {
    public static void main(String[] args) {
        float maths = 56f;
        float sst = 89f;
        float science = 78.6f;
        float hindi =56f;
        float computer = 67.4f;
        System.out.println("Student marks in five subject:\n" + "maths: "+ maths +"\nsst: " + sst +"\nscience: " + science +"\nhindi: " + hindi +"\ncomputer: " + computer);
        float sum = maths + sst + science + hindi+computer;
        System.out.println("The sum is: " + sum);
        float average = sum/5;
        System.out.println("The average is: " + average);
    }
}


