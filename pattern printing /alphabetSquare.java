// Problem: Alphabet Square Pattern
// Topic: Pattern Printing
// Date: 03-05-2026
// Time Complexity: O(n²)
// Space Complexity: O(1)
// Description:
// Print a square pattern where each row contains
// uppercase alphabets from A to nth alphabet.
//
// Example Input:
// 4
//
// Example Output:
// A B C D
// A B C D
// A B C D
// A B C D
//
// Approach:
// - Take n as input
// - Outer loop controls rows
// - Inner loop prints alphabets from A onward
// - Convert numbers to characters using ASCII values
// - 'A' = 65, so use (char)(j + 64)

import java.util.Scanner;

public class AlphabetSquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {

            // Inner loop for columns
            for (int j = 1; j <= n; j++) {
                System.out.print((char)(j + 64) + " ");
            }

            // Move to next line after each row
            System.out.println();
        }

    }
}
