package com.priya.PracticeSet1;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take the starting number from the user.
        // Example: 100
        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();

        // Take the ending number from the user.
        // Example: 500
        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();

        // This loop checks EVERY number between start and end.
        // If start = 100 and end = 105,
        // then i will become:
        // 100 -> 101 -> 102 -> 103 -> 104 -> 105
        for (int i = start; i <= end; i++) {

            // Store the current number because later we will compare
            // the calculated sum with this original value.
            // Example:
            // i = 153
            // original = 153
            int original = i;

            // Create another copy of the number.
            // We will divide this variable repeatedly to extract digits.
            // We DO NOT want to change the original number.
            int temp = i;

            // This variable stores the total number of digits.
            // Example:
            // 153 -> digits = 3
            int digits = 0;

            // This variable stores the final Armstrong sum.
            // Example:
            // 1³ + 5³ + 3³ = 153
            int sum = 0;

            // -------------------------------
            // STEP 1 : Count the number of digits
            // -------------------------------

            // Keep dividing the number by 10 until it becomes 0.
            // Every division removes the last digit.
            while (temp > 0) {
                digits++;
                temp = temp / 10;
            }

            // After counting digits, temp becomes 0.
            // We need the original number again for the next step.
            // Therefore, restore temp.
            temp = original;

            // -------------------------------
            // STEP 2 : Calculate Armstrong Sum
            // -------------------------------

            // Extract every digit one by one.
            while (temp > 0) {

                // Get the last digit.
                // Example:
                // 153 % 10 = 3
                int rem = temp % 10;

                // Raise the digit to the power of total digits.
                // Example:
                // rem = 3
                // digits = 3
                // 3³ = 27
                //
                // Math.pow() returns a double,
                // therefore we convert it into int.
                sum = sum + (int) Math.pow(rem, digits);

                // Remove the last digit.
                // Example:
                // 153 becomes 15
                // 15 becomes 1
                // 1 becomes 0
                temp = temp / 10;
            }

            // -------------------------------
            // STEP 3 : Compare
            // -------------------------------

            // If the calculated sum equals the original number,
            // then it is an Armstrong Number.
            if (sum == original) {
                System.out.println(original);
            }

            // If the number is not Armstrong,
            // nothing is printed because there is no else block.
        }

        sc.close();
    }
}