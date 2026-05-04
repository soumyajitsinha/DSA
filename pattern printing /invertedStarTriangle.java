// Problem: Inverted Star Triangle Pattern
// Topic: Pattern Printing
// Date: 04-05-2026
// Time Complexity: O(n²)
// Space Complexity: O(1)
// Description:
// Print an inverted right-angled triangle pattern using '*' symbols,
// where the number of stars decreases in each row.
//
// Example Input:
// 4
//
// Example Output:
// * * * *
// * * *
// * *
// *
//
// Approach:
// - Take n as input
// - Outer loop controls rows
// - Inner loop prints (n - i + 1) stars in each row

import java.util.Scanner;

public class InvertedStarTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}
