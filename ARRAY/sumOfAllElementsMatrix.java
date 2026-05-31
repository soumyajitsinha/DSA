// Problem: Sum of All Elements in a Matrix
// Topic: 2D Arrays
//
// Description:
// Find and print the sum of all elements
// present in a matrix.
//
// Example Input:
//
// Matrix:
// 1 2 3
// 4 5 6
//
// Example Output:
// The sum of elements is 21
//
// Approach:
// - Initialize a variable sum with 0
// - Traverse the matrix using nested loops
// - Add each element to sum
// - After traversing the entire matrix,
//   print the final sum
//
// Time Complexity:
// O(m × n)
// Reason:
// Every element of the matrix is visited once.
//
// Space Complexity:
// O(1)
// Reason:
// Only a single variable is used to store the sum.

import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                sum += arr[i][j];
            }
        }

        System.out.println("The sum of elements is " + sum);
    }
}
