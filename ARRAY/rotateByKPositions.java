// Problem: Rotate Array
// Topic: Arrays
// Date: 19-05-2026
//
// Description:
// Rotate the elements of an array by k positions.
//
// Example Input:
// Array: 2 6 5 8 7 4 1
// k = 3
//
// Example Output:
// Rotated Array:
// 7 4 1 2 6 5 8
//
// Approach:
// - Take the value of k as input
// - Reduce k using k % n to handle large rotations
// - Reverse the complete array
// - Reverse the first k elements
// - Reverse the remaining elements
// - This results in the array rotated by k positions
//
// Time Complexity:
// O(n)
// Reason:
// Array elements are reversed a constant number of times.
//
// Space Complexity:
// O(1)
// Reason:
// Rotation is done in-place without extra array.

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {2, 6, 5, 8, 7, 4, 1};

        int n = arr.length;

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        k = k % n;

        reverse(arr, 0, n - 1);

        reverse(arr, 0, k - 1);

        reverse(arr, k, n - 1);

        System.out.println("Rotated Array:");

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    public static void reverse(int[] arr, int i, int j) {

        while (i <= j) {

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
}
