// this program is for finding the second largest element in the array with and without using function

import java.util.*;

public class Find {


    // function definition for finding the second largest element in the array
    static int FindSecondLargest(int[] arr) {
        int Largest = arr[0];
        int SecondLargest = arr[1];

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > Largest) {
                SecondLargest = Largest;
                Largest = arr[i];
            } else if (arr[i] > SecondLargest) {
                SecondLargest = arr[i];
            }
        }
        return SecondLargest;
    }

    public static void main(String[] args) {
        int n = 5;

        int[] arr = new int[n];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + (i + 1) + " element in the array: ");
            arr[i] = sc.nextInt();
        }

        int Largest = arr[0];
        int SecondLargest = arr[1]; // we are assuming the first two elements are the largest and second largest


        // this for loop will run for the remaining elements in the array and each iteration this loop will check if the current element is greater than the largest or second largest
        for (int i = 2; i < n; i++) {
            // if the current element is greater than the largest, then the previous largest will become the second largest and the current element will become the largest
            if (arr[i] > Largest) {
                SecondLargest = Largest;
                Largest = arr[i];
            } else if (arr[i] > SecondLargest) { // this else if block will run if the current element is not greater than the largest but it is greater than the second largest
                SecondLargest = arr[i];
            }
        }

        System.out.println("Largest: " + Largest);
        System.out.println("Second Largest: " + SecondLargest);

        System.out.println("Second Largest: " + FindSecondLargest(arr));

        sc.close();
    }
}