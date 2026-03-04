// program to find the largest and smallest element in the array

import java.util.*;

public class FindElement {

    // function defintion to find the largest element in the array
    static int Largest(int[] arr) {
        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }

    // function defintion to find the smallest element in the array
    static int Smallest(int[] arr) {
        int smallest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        return smallest;
    }
    public static void main(String[] args) {
        int n = 10;
        int[] arr = new int[n];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }


            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);

        System.out.println("Largest element: " + Largest(arr));
        System.out.println("Smallest element: " + Smallest(arr));

        sc.close();
    }
}