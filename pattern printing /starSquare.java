// Problem: Star Square Pattern
// Topic: Pattern Printing
// Date: 01-05-2026
// Time Complexity: O(n²)
// Space Complexity: O(1)
// Description:
// Print an n x n square pattern using '*' symbols.
//
// Example Input:
// 4
//
// Example Output:
// * * * *
// * * * *
// * * * *
// * * * *
package patern.square;

import java.util.Scanner;

public class starSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();

        for (int i = 1; i <=n ; i++) { //rows
            for (int j = 1; j <=n ; j++) { //col
                System.out.print("* ");

            }
            System.out.println();

        }
    }
}
