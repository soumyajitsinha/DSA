// Problem: Reverse Array Using Two Pointers
// Topic: Arrays
// Date: 19-05-2026
//
// Description:
// Reverse the elements of an array using
// the two-pointer technique and a swap function.
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
// - Initialize two pointers:
//   -> i at the beginning of the array
//   -> j at the end of the array
// - Swap elements at i and j
// - Move i forward and j backward
// - Continue until both pointers meet
// - Print the reversed array
//
// Time Complexity:
// O(n)
// Reason:
// Each element is swapped only once.
//
// Space Complexity:
// O(1)
// Reason:
// Reversal is done in-place without extra space.

public class ReverseArrayUsingPointers {
    public static void main(String[] args) {

        int[] arr = {2, 6, 5, 8, 7, 4, 1};

        int n = arr.length;

        System.out.println("Original Array:");

        for (int ele : arr) {
            System.out.print(ele + " ");
        }

        System.out.println();

        int i = 0, j = n - 1;

        while (i <= j) {

            swap(arr, i, j);

            i++;
            j--;
        }

        System.out.println("Reversed Array:");

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    public static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
