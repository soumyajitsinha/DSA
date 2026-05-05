// Problem: Odd Number Triangle Pattern
// Topic: Pattern Printing
// Date: 05-05-2026
// Time Complexity: O(n²)
// Space Complexity: O(1)
//
// Description:
// Print a triangle pattern where each row contains
// odd numbers starting from 1.
//
// Example Input:
// 4
//
// Example Output:
// 1
// 1 3
// 1 3 5
// 1 3 5 7
//
// Approach:
// - Outer loop runs from 1 to n (rows)
// - For each row i, print i numbers
// - Each number is calculated using (2*j - 1)
// - This generates odd numbers: 1, 3, 5, 7...

import java.util.Scanner;

public class OddNumberTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((2 * j - 1) + " ");
            }
            System.out.println();
        }
    }
}
