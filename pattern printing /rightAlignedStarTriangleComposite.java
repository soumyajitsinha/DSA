// Problem: Right Aligned Star Triangle Pattern
// Topic: Pattern Printing
// Date: 12-05-2026
// Time Complexity: O(n²)
// Space Complexity: O(1)
//
// Description:
// Print a right-aligned triangle pattern using '*' symbols.
// The number of stars increases in each row
// while spaces decrease from the left side.
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
// - First inner loop prints leading spaces
// - Number of spaces decreases in each row
// - Second inner loop prints stars from 1 to i
// - This creates a right-aligned star triangle

import java.util.Scanner;

public class RightAlignedStarTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
