// Problem: Number Bridge Pattern
// Topic: Pattern Printing
// Date: 13-05-2026
// Time Complexity: O(n²)
// Space Complexity: O(1)
//
// Description:
// Print a number bridge pattern where numbers appear
// on both sides with spaces forming a bridge-like gap
// in the center.
//
// Example Input:
// 5
//
// Example Output:
// 1 2 3 4 5 6 7 8 9
// 1 2 3 4   6 7 8 9
// 1 2 3       7 8 9
// 1 2           8 9
// 1               9
//
// Approach:
// - First print numbers from 1 to (2*n - 1)
// - Decrease n by 1 for the remaining rows
// - Outer loop controls rows
// - Initialize variable 'a' with 1 for each row
// - First inner loop prints increasing numbers on the left side
// - Second inner loop prints spaces in the middle section
// - Third inner loop prints remaining numbers on the right side
// - Number of middle spaces increases with each row

import java.util.Scanner;

public class NumberBridgePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 2 * n - 1; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        n--;

        for (int i = 1; i <= n; i++) {

            int a = 1;

            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print(a++ + " ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("  ");
                a++;
            }

            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print(a + " ");
                a++;
            }

            System.out.println();
        }
    }
}
