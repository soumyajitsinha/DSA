// Problem: Addition of Two Matrices
// Topic: 2D Arrays
//
// Description:
// Add two matrices of the same dimensions
// and print the resultant matrix.
//
// Example Input:
//
// Matrix A:
// 1  2  3
// 4  5  6
//
// Matrix B:
// 13 26 31
// 41 53 64
//
// Example Output:
//
// Resultant Matrix:
// 14 28 34
// 45 58 70
//
// Approach:
// - Create a result matrix having the same dimensions
//   as the input matrices
// - Traverse both matrices using nested loops
// - Add corresponding elements:
//   result[i][j] = matrixA[i][j] + matrixB[i][j]
// - Store the sum in the result matrix
// - Print the resultant matrix
//
// Time Complexity:
// O(m × n)
// Reason:
// Every element of both matrices is visited once.
//
// Space Complexity:
// O(m × n)
// Reason:
// An additional matrix is used to store the result.

public class AddTwoMatrix {
    public static void main(String[] args) {

        int[][] arr1 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] arr2 = {
                {13, 26, 31},
                {41, 53, 64}
        };

        int[][] sol = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr1[0].length; j++) {

                sol[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("Resultant Matrix:");

        for (int i = 0; i < sol.length; i++) {

            for (int j = 0; j < sol[0].length; j++) {

                System.out.print(sol[i][j] + " ");
            }

            System.out.println();
        }
    }
}
