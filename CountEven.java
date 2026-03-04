// program to count the number of even and odd elements in the array using and without using function

import java.util.*;

public class CountEven {

    // function definition to count the number of even elements in the array
    static int EvenCount(int[] arr) {
        int EvenCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                EvenCount++;
            }
        }

        return EvenCount;
    }

    // function definition to count the number of odd elements in the array
    static int OddCount(int[] arr) {
        int OddCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                OddCount++;
            }
        }

        return OddCount;
    }
    public static void main(String[] args) {
        int n = 10;

        int[] arr = new int[n];

        int EvenCount = 0;
        int OddCount = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + (i + 1) + " element in the array: ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                EvenCount++;
            } else {
                OddCount++;
            }
        }

        System.out.println("Even count: " + EvenCount);
        System.out.println("Odd count: " + OddCount);

        System.out.println("Even count: " + EvenCount(arr));
        System.out.println("Odd count: " + OddCount(arr));

        sc.close();
    }
}
