// Problem: Dutch National Flag Algorithm
// Topic: Arrays
// Date: 20-05-2026
//
// Description:
// Sort an array containing only 0s, 1s, and 2s
// using the Dutch National Flag Algorithm.
//
// Example Input:
// Array: 2 0 1
//
// Example Output:
// 0 1 2
//
// Approach:
// - Use three pointers:
//   -> low for placing 0s
//   -> mid for traversing the array
//   -> high for placing 2s
//
// - If arr[mid] is 0:
//   -> Swap arr[mid] with arr[low]
//   -> Increment low and mid
//
// - If arr[mid] is 1:
//   -> Move mid forward
//
// - If arr[mid] is 2:
//   -> Swap arr[mid] with arr[high]
//   -> Decrement high
//
// - Continue until mid becomes greater than high
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

public class DutchFlagAlgo {
    public static void main(String[] args) {

        int[] arr = {2, 0, 1};

        int n = arr.length;

        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {

            if (arr[mid] == 0) {

                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;

                low++;
                mid++;

            } else if (arr[mid] == 1) {

                mid++;

            } else {

                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
        }

        System.out.println("Sorted Array:");

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
