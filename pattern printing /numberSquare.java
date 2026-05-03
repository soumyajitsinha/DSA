// Problem: Number Square Pattern
// Topic: Pattern Printing
// Date: 03-05-2026
// Time Complexity: O(n²)
// Space Complexity: O(1)
//
// Description:
// Print a square pattern where each row contains
// numbers from 1 to n.
//
// Example Input:
// 4
//
// Example Output:
// 1 2 3 4
// 1 2 3 4
// 1 2 3 4
// 1 2 3 4
//
// Approach:
// - Take n as input
// - Outer loop controls rows
// - Inner loop prints numbers from 1 to n
// - Repeat for n rows

import java.util.Scanner;

public class NumberSquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {

            // Inner loop for columns
            for (int j = 1; j <= n; j++) {
                System.out.print(j + " ");
            }

            // Move to next line after each row
            System.out.println();
        }

    }
}
