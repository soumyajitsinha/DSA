// Problem: Rhombus Pattern
// Topic: Pattern Printing
// Date: 14-05-2026
// Time Complexity: O(n²)
// Space Complexity: O(1)
//
// Description:
// Print a rhombus pattern using '*' symbols.
// The pattern is formed by printing a square
// shifted toward the right side using spaces.
//
// Example Input:
// 5
//
// Example Output:
//         * * * * *
//       * * * * *
//     * * * * *
//   * * * * *
// * * * * *
//
// Approach:
// - Outer loop controls rows
// - First inner loop prints leading spaces
// - Number of spaces decreases in each row
// - Second inner loop prints n stars in every row
// - This creates a slanted rhombus shape

import java.util.Scanner;

public class RhombusPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
