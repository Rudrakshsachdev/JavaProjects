// program to find the sum of the elements in the array using and without using function

import java.util.*;

public class CalSum {


    // function definition to find the sum of the elements in the array
    static int findSum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }
    public static void main(String[] args) {
        int n = 10;

        int[] arr = new int[n];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + (i + 1) + " element in the array: ");
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        System.out.println("The sum of the elements in the array is: " + sum);

        System.out.println("The sum of the elements in the array is: " + findSum(arr));

        sc.close();
    }
}
