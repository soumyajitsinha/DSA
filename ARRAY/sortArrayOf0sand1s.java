// Problem: Sort Array of 0s and 1s
// Topic: Arrays
// Date: 20-05-2026
//
// Description:
// Sort an array containing only 0s and 1s
// using the two-pointer technique in a single traversal.
//
// Example Input:
// Array: 0 1 0 1 0 1
//
// Example Output:
// 0 0 0 1 1 1
//
// Approach:
// - Use two pointers:
//   -> i starts from the beginning
//   -> j starts from the end
// - If arr[i] is 0, move i forward
// - If arr[j] is 1, move j backward
// - Otherwise swap values by placing 0 at i and 1 at j
// - Continue until both pointers meet
//
// Time Complexity:
// O(n)
// Reason:
// Array is traversed only once.
//
// Space Complexity:
// O(1)
// Reason:
// Sorting is done in-place without extra space.

public class SortArrayOf0And1 {
    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 1, 0, 1};

        int n = arr.length;

        int i = 0, j = n - 1;

        while (i < j) {

            if (arr[i] == 0) {

                i++;

            } else if (arr[j] == 1) {

                j--;

            } else {

                arr[i] = 0;
                arr[j] = 1;

                i++;
                j--;
            }
        }

        System.out.println("Sorted Array:");

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
