// Problem: Palindromic Number Pyramid Pattern
// Topic: Pattern Printing
// Date: 11-05-2026
// Time Complexity: O(n²)
// Space Complexity: O(1)
//
// Description:
// Print a centered pyramid pattern where numbers
// increase and then decrease symmetrically in each row,
// forming a palindrome.
//
// Example Input:
// 5
//
// Example Output:
//         1
//       1 2 1
//     1 2 3 2 1
//   1 2 3 4 3 2 1
// 1 2 3 4 5 4 3 2 1
//
// Approach:
// - Outer loop controls rows
// - First inner loop prints leading spaces
// - Second inner loop prints increasing numbers from 1 to i
// - Third inner loop prints decreasing numbers from (i - 1) to 1
// - Combining both parts forms a palindrome pyramid

import java.util.Scanner;

public class PalindromicNumberPyramidPattern {
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

            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
