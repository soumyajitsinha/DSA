// Problem: Transpose of a Matrix
// Topic: 2D Arrays
//
// Description:
// Print the transpose of a matrix.
// In transpose, rows become columns
// and columns become rows.
//
// Example Input:
// 13 26 31
// 41 53 64
// 35 31 190
//
// Example Output:
//
// Original Matrix:
// 13 26 31
// 41 53 64
// 35 31 190
//
// Transpose Matrix:
// 13 41 35
// 26 53 31
// 31 64 190
//
// Approach:
// - Store matrix elements in a 2D array
// - Traverse the matrix row-wise to print original matrix
// - For transpose:
//   -> Swap row and column indices
//   -> Print arr[j][i] instead of arr[i][j]
// - This converts rows into columns
//
// Time Complexity:
// O(m × n)
// Reason:
// Every element of the matrix is visited once.
//
// Space Complexity:
// O(1)
// Reason:
// No extra matrix is used for printing transpose.

public class TransposeOfMatrix {
    public static void main(String[] args) {

        int[][] arr = {
                {13, 26, 31},
                {41, 53, 64},
                {35, 31, 190}
        };

        int m = arr.length;
        int n = arr[0].length;

        System.out.println("Original Matrix:");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println();

        System.out.println("Transpose Matrix:");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                System.out.print(arr[j][i] + " ");
            }

            System.out.println();
        }
    }
}
