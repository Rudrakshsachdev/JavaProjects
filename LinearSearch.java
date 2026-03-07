// program for finding elements using iterative and recursive approach of linear search

import java.util.*;

public class LinearSearch {

    // iterative approach
    static int linear(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return 0;
    }

    // recursive approach
    static int Linear(int[] arr, int target, int index, int size) {

        // base case-1: index is getting out of bounds
        if (index >= size) {
            return -1;
        } else if (arr[index] == target) {
            return index; // check current element and if it matches the key return the index
        }

        // if all the base conditions fails, then recursively calls itself and move to the next element
        return Linear(arr, target, index + 1, size);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements you want in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the " + n + " elements in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target element you want to find: ");
        int target = sc.nextInt();

        // linear search using iterative approach
        int linear = linear(arr, target);
        System.out.println("The target " + target + " found at index " + linear + " using iterative approach.");

        // linear search using recursive approach
        int Linear = Linear(arr, target, 0, arr.length);
        System.out.println("The target " + target + " found at index " + Linear + " using recursive approach.");
    }
}
