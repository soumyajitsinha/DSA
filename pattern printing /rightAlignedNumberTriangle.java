// Problem: Right Aligned Number Triangle Pattern
// Topic: Pattern Printing
// Date: 12-05-2026
// Time Complexity: O(n²)
// Space Complexity: O(1)
//
// Description:
// Print a right-aligned triangle pattern using numbers.
// Each row contains numbers from 1 up to the current row number.
//
// Example Input:
// 5
//
// Example Output:
//         1
//       1 2
//     1 2 3
//   1 2 3 4
// 1 2 3 4 5
//
// Approach:
// - Outer loop controls rows
// - First inner loop prints leading spaces
// - Number of spaces decreases in each row
// - Second inner loop prints numbers from 1 to i
// - This creates a right-aligned number triangle

import java.util.Scanner;

public class RightAlignedNumberTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
