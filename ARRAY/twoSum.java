// Problem: Two Sum
// Topic: Arrays
// Date: 17-05-2026
//
// Description:
// Find and print all pairs of elements in the array
// whose sum is equal to the target value.
//
// Example Input:
// Target Sum: 9
//
// Example Output:
// 2 7
// 8 1
//
// Approach:
// - Store array elements in an array
// - Take target sum as input
// - Use two nested loops to check every possible pair
// - If the sum of two elements equals the target,
//   print the pair
//
// Time Complexity:
// O(n²)
// Reason:
// Two nested loops are used to check all possible pairs.
//
// Space Complexity:
// O(1)
// Reason:
// No extra data structure is used.

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {2, 6, 5, 8, 7, 4, 1};

        System.out.print("Enter the target sum: ");
        int x = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == x) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}
