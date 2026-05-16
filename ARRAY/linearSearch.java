// Problem: Linear Search
// Topic: Arrays
// Date: 16-05-2026
// Time Complexity: O(n)
// Space Complexity: O(1)
//
// Description:
// Search for a target element in an array
// using Linear Search technique.
//
// Example Input:
// Target Element: 5
// Array Size: 6
// Array Elements: 1 3 5 7 9 2
//
// Example Output:
// The element found
//
// Approach:
// - Take target element as input
// - Take array size and array elements
// - Traverse the array from beginning to end
// - Compare each element with the target element
// - If target element is found, stop searching
// - Print whether the element is found or not

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter target element: ");
        int x = sc.nextInt();

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array elements: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean flag = false;

        for (int i = 0; i < n; i++) {

            if (arr[i] == x) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("The element found");
        } else {
            System.out.println("The element not found");
        }
    }
}
