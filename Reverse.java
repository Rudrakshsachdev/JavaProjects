// program to reverse the array using and without using function

import java.util.*;

public class Reverse {

    // function definition to reverse the array
    static void reverseArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int n = 5;

        int[] arr = new int[n];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + (i + 1) + " element in the array: ");
            arr[i] = sc.nextInt();
        }

        for (int i = n - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
