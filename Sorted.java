// program to check if the array is sorted or not

import java.util.*;

public class Sorted {
    public static void main(String[] args) {
        int n = 5;

        int[] arr = new int[n];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the " + (i + 1) + " element in the array: ");
            arr[i] = sc.nextInt();
        }

        // this loop will run from first element to the second last element and in each iteration this will check if the current element is greater than the next element
        for (int i = 0; i < arr.length - 1; i++) {
            // if the current element is greater than the next element, then the array is not sorted
            if (arr[i] > arr[i + 1]) {
                System.out.println("Array is not sorted");
                return;
            }
        }

        // if the loop completes without returning, then the array is sorted
        System.out.println("Array is sorted");

        sc.close();
    }
}
