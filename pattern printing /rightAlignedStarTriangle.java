// Problem: Right Aligned Star Triangle Pattern
// Topic: Pattern Printing
// Date: 07-05-2026
// Time Complexity: O(n²)
// Space Complexity: O(1)
//
// Description:
// Print a right-aligned triangle pattern using '*' symbols.
// Stars are aligned toward the right side of the pattern.
//
// Example Input:
// 5
//
// Example Output:
//         *
//       * *
//     * * *
//   * * * *
// * * * * *
//
// Approach:
// - Outer loop controls rows
// - Inner loop controls columns
// - Print '*' when the sum of row and column
//   becomes greater than n
// - Otherwise print spaces to maintain alignment

import java.util.Scanner;

public class RightAlignedStarTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                if (i + j > n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}
