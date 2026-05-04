// Problem: Star Triangle Pattern
// Topic: Pattern Printing
// Date: 04-05-2026
// Time Complexity: O(n²)
// Space Complexity: O(1)
// Description:
// Print a right-angled triangle pattern using '*' symbols,
// where each row contains stars equal to the row number.
//
// Example Input:
// 4
//
// Example Output:
// *
// **
// ***
// ****
//
// Approach:
// - Take n as input
// - Outer loop controls rows
// - Inner loop prints '*' from 1 to i (current row)

import java.util.Scanner;

public class StarTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

       
    }
}
