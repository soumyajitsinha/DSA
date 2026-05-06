// Problem: Binary Triangle Pattern
// Topic: Pattern Printing
// Date: 06-05-2026
// Time Complexity: O(n²)
// Space Complexity: O(1)
//
// Description:
// Print a binary triangle pattern consisting of 0s and 1s.
// The pattern alternates values based on row and column positions.
//
// Example Input:
// 5
//
// Example Output:
// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1
//
// Approach:
// - Outer loop controls rows
// - Inner loop prints values for each column
// - If the row number is odd:
//   -> Print 1 at odd positions
//   -> Print 0 at even positions
// - If the row number is even:
//   -> Print 1 at even positions
//   -> Print 0 at odd positions

import java.util.Scanner;

public class BinaryTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                if (i % 2 == 1) {

                    if (j % 2 == 1) {
                        System.out.print(1 + " ");
                    } else {
                        System.out.print(0 + " ");
                    }

                } else {

                    if (j % 2 == 0) {
                        System.out.print(1 + " ");
                    } else {
                        System.out.print(0 + " ");
                    }
                }
            }

            System.out.println();
        }
    }
}
