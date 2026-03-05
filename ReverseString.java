// program to reverse the string and check if the string is palindrome or not


import java.util.*;

public class ReverseString {

    // function definiton to reverse the string
    static String RevString(String str) {
        String rev = "";

        for (int i = (str.length() - 1); i >= 0; i--) {
            rev += str.charAt(i);
        }

        System.out.println("Reversed String: " + rev);
        return rev;
    }

    // function definition to check if the string is palindrome or not
    static void Palindrome(String str) {

        String rev = RevString(str);

        if (str.equals(rev)) {
            System.out.println("String is a palindrome");
        } else {
            System.out.println("String is not a palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of the string: ");
        String str = sc.nextLine();

        String RevString = "";


        // this loop will run from the last element of the string to the first element
        for (int i = (str.length() - 1); i >= 0; i--) {

            // this will add the last element of the string to the RevString in each iteration
            RevString = RevString + str.charAt(i);
        }

        System.out.println("Reversed String: " + RevString);

        RevString(str);

        // this if condition will check if the original string is equal to the reversed string
        if (str.equals(RevString)) {
            System.out.println("String is a palindrome");
        } else {
            System.out.println("String is not a palindrome");
        }
        sc.close();
    }
}
