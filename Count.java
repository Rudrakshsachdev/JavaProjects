// program for counting even and odd numbers in an array and their sum as well seprately

import java.util.*;

public class Count {

    // function defintion for finding the event count inside an array
    static int CountEven(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    // function definition for finding the odd count inside an array
    static int CountOdd(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    // function definition for finding the sum of even numbers inside an array
    static int SumEven(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    // function definition for finding the sum of odd numbers inside an array
    static int SumOdd(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sum += arr[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking array size from user
        System.out.println("Enter the number of elements you want in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // taking array elements from the user
        System.out.println("Enter the " + n + " elements in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int EvenCount = 0;
        int OddCount = 0;

        int EvenSum = 0;
        int OddSum = 0;


        // finding the event & odd count and as well as sum of even & odd numbers seprately from the user
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                EvenCount++;
                EvenSum += arr[i];
            } else {
                OddCount++;
                OddSum += arr[i];
            }
        }

        System.out.println("Number of even numbers: " + EvenCount);
        System.out.println("Number of odd numbers: " + OddCount);

        System.out.println("Sum of even numbers: " + EvenSum);
        System.out.println("Sum of odd numbers: " + OddSum);

        System.out.println("Number of even numbers: " + CountEven(arr));
        System.out.println("Number of odd numbers: " + CountOdd(arr));

        System.out.println("Sum of even numbers: " + SumEven(arr));
        System.out.println("Sum of odd numbers: " + SumOdd(arr));
    }
}
