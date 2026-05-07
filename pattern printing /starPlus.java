// Problem: Star Plus Pattern
// Topic: Pattern Printing
// Date: 07-05-2026
// Time Complexity: O(n²)
// Space Complexity: O(1)
//
// Description:
// Print a plus (+) shaped pattern using '*' symbols.
// Stars are printed in the middle row and middle column.
//
// Example Input:
// 5
//
// Example Output:
//     *
//     *
// * * * * *
//     *
//     *
//
// Approach:
// - Find the middle position using (n / 2 + 1)
// - Outer loop controls rows
// - Inner loop controls columns
// - Print '*' when:
//   -> Current row equals middle row
//   -> Current column equals middle column
// - Otherwise print spaces

import java.util.Scanner;

public class StarPlusPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int mid = n / 2 + 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                if (i == mid || j == mid) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}
