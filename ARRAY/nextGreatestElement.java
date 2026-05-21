// Problem: Next Greatest Element Array
// Topic: Arrays
//
// Description:
// Replace every element of the array with the
// greatest element present on its right side.
// The last element is replaced with -1.
//
// Example Input:
// Array: 12 8 41 37 2 49 16 28 21
//
// Example Output:
// 49 49 49 49 49 28 28 21 -1
//
// Approach:
//
// Method 1:
// - For every element, traverse all elements on its right side
// - Find the maximum element among them
// - Store that maximum value in the answer array
//
// Method 2 (Optimized):
// - Start traversing from the end of the array
// - Maintain a variable storing the greatest element seen so far
// - Store current greatest element in answer array
// - Update greatest element if current array element is larger
// - Last element is always assigned -1
//
// Time Complexity:
// Method 1 -> O(n²)
// Method 2 -> O(n)
//
// Space Complexity:
// O(n)
// Reason:
// Extra answer array is used.

public class NextGreatest {
    public static void main(String[] args) {

        int[] arr = {12, 8, 41, 37, 2, 49, 16, 28, 21};

        int n = arr.length;

        int[] ans = new int[n];

        ans[n - 1] = -1;

        // Method 1

        for (int i = 0; i < n - 1; i++) {

            int mx = Integer.MIN_VALUE;

            for (int j = i + 1; j < n; j++) {
                mx = Math.max(mx, arr[j]);
            }

            ans[i] = mx;
        }

        // Method 2 (Optimized)

        int nge = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {

            ans[i] = nge;

            nge = Math.max(nge, arr[i]);
        }

        System.out.println("Original Array:");

        for (int ele : arr) {
            System.out.print(ele + "  ");
        }

        System.out.println();

        System.out.println("Next Greatest Element Array:");

        for (int ele : ans) {
            System.out.print(ele + "  ");
        }
    }
}
