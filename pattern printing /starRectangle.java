// Problem: Star Rectangle Pattern
// Topic: Pattern Printing
// Date: 03-05-2026
// Time Complexity: O(m × n)
// Space Complexity: O(1)
//
// Description:
// Print a rectangle pattern of '*' symbols
// based on user-defined rows (m) and columns (n).
//
// Example Input:
// Rows = 3
// Columns = 5
//
// Example Output:
// *****
// *****
// *****


import java.util.Scanner;

public class StarRectanglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking number of rows
        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();

        // Taking number of columns
        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();

        // Outer loop for rows
        for (int i = 0; i < m; i++) {

            // Inner loop for columns
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }

            // Move to next line after each row
            System.out.println();
        }

    }
}
