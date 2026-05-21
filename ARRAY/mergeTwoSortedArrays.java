// Problem: Merge Two Sorted Arrays
// Topic: Arrays
//
// Description:
// Merge two sorted arrays into a single
// sorted array.
//
// Example Input:
// Array 1: 11 33 42 71
// Array 2: 26 54 69 81
//
// Example Output:
// 11 26 33 42 54 69 71 81
//
// Approach:
// - Create a new array to store merged elements
// - Use three pointers:
//   -> i for first array
//   -> j for second array
//   -> k for merged array
//
// - Compare elements of both arrays
// - Insert the smaller element into merged array
// - Move corresponding pointers forward
//
// - After one array is completely traversed,
//   copy remaining elements of the other array
//
// Time Complexity:
// O(n + m)
// Reason:
// Both arrays are traversed only once.
//
// Space Complexity:
// O(n + m)
// Reason:
// Extra array is used to store merged elements.

public class MergeArray {
    public static void main(String[] args) {

        int[] a = {11, 33, 42, 71};
        int[] b = {26, 54, 69, 81};

        int[] c = new int[a.length + b.length];

        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {

            if (a[i] <= b[j]) {

                c[k] = a[i];
                i++;

            } else {

                c[k] = b[j];
                j++;
            }

            k++;
        }

        if (i == a.length) {

            while (j < b.length) {
                c[k] = b[j];
                j++;
                k++;
            }
        }

        if (j == b.length) {

            while (i < a.length) {
                c[k] = a[i];
                i++;
                k++;
            }
        }

        System.out.println("Merged Array:");

        for (int ele : c) {
            System.out.print(ele + " ");
        }
    }
}
