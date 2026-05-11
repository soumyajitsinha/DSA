// Problem: Star Pyramid Pattern
// Topic: Pattern Printing
// Date: 11-05-2026
// Time Complexity: O(n²)
// Space Complexity: O(1)
//
// Description:
// Print a centered pyramid pattern using '*' symbols.
// The number of stars increases in each row
// following the pattern (2*i - 1).
//
// Example Input:
// 5
//
// Example Output:
//         *
//       * * *
//     * * * * *
//   * * * * * * *
// * * * * * * * * *
//
// Approach:
// - Outer loop controls rows
// - First inner loop prints leading spaces
// - Number of spaces decreases in each row
// - Second inner loop prints stars
// - Number of stars follows (2*i - 1)
// - This creates a centered pyramid shape

import java.util.Scanner;

public class StarPyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
