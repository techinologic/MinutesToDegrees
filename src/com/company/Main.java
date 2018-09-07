// Paolo T. Inocencion
// Coppin CS Coding Challenge #2

package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

   /*
   This program returns the angle that is formed by the
   minute hand and the 12 o’clock mark on the clock.

   Example

   If the input is: 15 then your program should return 90 because
   a 90-degree angle is formed by the minute hand and
   the 12 o’clock mark on the clock.

   */

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // prompts user to enter numbers 1-60.
        System.out.print("Please enter minutes [0-60]: ");

        // try catch block that will check N if its an integer type.
        try {
            // stores user input (integer) into the in variable N using the scanner.
            int N = sc.nextInt();

            // checks if user entry is between 0-60.
            if (N >= 0 && N <= 60) {
                // converts N into degrees by multiplying it by 6.
                System.out.println(N + " is " + (N * 6) + " degrees.");
            } else {
                // Outputs if N is not between the numbers 0-60.
                System.out.println("Please enter numbers between 0-60 only.");
            }
        } catch (InputMismatchException e) {
            // output error
            System.out.println("Please enter only numbers.");
        }
    }
}
