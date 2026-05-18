// Problem: Reverse an Array
// Topic: Arrays
// Date: 18-05-2026
//
// Description:
// Reverse the elements of an array in-place
// using the swapping technique.
//
// Example Input:
// Array: 2 6 5 8 7 4 1
//
// Example Output:
// Original Array:
// 2 6 5 8 7 4 1
//
// Reversed Array:
// 1 4 7 8 5 6 2
//
// Approach:
// - Find the length of the array
// - Traverse only up to the middle of the array
// - Swap the first element with the last element
// - Continue swapping elements moving toward the center
// - Print the reversed array after completion
//
// Time Complexity:
// O(n)
// Reason:
// Array is traversed only once up to n/2.
//
// Space Complexity:
// O(1)
// Reason:
// Reversal is done in-place without extra array.

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {2, 6, 5, 8, 7, 4, 1};

        int n = arr.length;

        System.out.println("Original Array:");

        for (int ele : arr) {
            System.out.print(ele + " ");
        }

        System.out.println();

        for (int i = 0; i < n / 2; i++) {

            int j = n - 1 - i;

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.println("Reversed Array:");

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
