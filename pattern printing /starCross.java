// Problem: Star Cross Pattern
// Topic: Pattern Printing
// Date: 06-05-2026
// Time Complexity: O(n²)
// Space Complexity: O(1)
//
// Description:
// Print a cross (X-shaped) pattern using '*' symbols.
// Stars are printed on both diagonals of the square.
//
// Example Input:
// 5
//
// Example Output:
// *       *
//   *   *
//     *
//   *   *
// *       *
//
// Approach:
// - Outer loop controls rows
// - Inner loop controls columns
// - Print '*' when:
//   -> Row number equals column number (main diagonal)
//   -> Sum of row and column equals n + 1 (secondary diagonal)
// - Otherwise print spaces

import java.util.Scanner;

public class StarCrossPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                if (i == j || i + j == n + 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            System.out.println();
        }
    }
}
