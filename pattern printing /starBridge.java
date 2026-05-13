// Problem: Star Bridge Pattern
// Topic: Pattern Printing
// Date: 13-05-2026
// Time Complexity: O(n²)
// Space Complexity: O(1)
//
// Description:
// Print a star bridge pattern where stars appear
// on both sides with spaces forming a bridge-like gap
// in the center.
//
// Example Input:
// 5
//
// Example Output:
// * * * * * * * * *
// * * * *   * * * *
// * * *       * * *
// * *           * *
// *               *
//
// Approach:
// - First print a full row containing (2*n - 1) stars
// - Decrease n by 1 for remaining rows
// - Outer loop controls rows
// - First inner loop prints stars on the left side
// - Second inner loop prints spaces in the middle section
// - Third inner loop prints stars on the right side
// - Number of spaces increases in each row

import java.util.Scanner;

public class StarBridgePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 0; i < 2 * n - 1; i++) {
            System.out.print("* ");
        }

        System.out.println();

        n--;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print("* ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
