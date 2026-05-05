// Problem: Floyd's Triangle
// Topic: Pattern Printing
// Date: 05-05-2026
// Time Complexity: O(n²)
// Space Complexity: O(1)
//
// Description:
// Print Floyd's Triangle where numbers are printed in a
// continuous increasing sequence across rows.
//
// Example Input:
// 4
//
// Example Output:
// 1
// 2 3
// 4 5 6
// 7 8 9 10
//
// Approach:
// - Start with a number variable initialized to 1
// - Run the outer loop from 1 to n (for rows)
// - For each row i, run the inner loop i times
// - In each iteration, print the current number and then increment it
// - After completing each row, move to the next line

import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }

       
    }
}
