// program for checking whether a number is palindrome or not

public class PalindromeNumber {

    // function definition
    static int reverseNumber(int number) {
        int revNum = 0;

        while (number != 0) {
            int digit = number % 10;
            revNum = revNum * 10 + digit;
            number /= 10;
        }

        return revNum;
    }
    public static void main(String[] args) {
        int number = 121;
        int revNum = 0;
        int originalNum = number; // this variable will store the original number

        // this loop will run until the number becomes 0 and in each iteration this loop will extract the last digit of the number and add it to the revNum and then remove that extract digit.
        while (number != 0) {
            int digit= number % 10;
            revNum = revNum * 10 + digit;
            number /= 10;
        }

        if (originalNum == revNum) {
            System.out.println(originalNum + " is a Palindrome");
        } else {
            System.out.println(originalNum + " is not a Palindrome");
        }

        // function calling
        int number1 = 123;
        int revNum1 = reverseNumber(number1);
        if (number1 == revNum1) {
            System.out.println(number1 + " is a Palindrome");
        } else {
            System.out.println(number1 + " is not a Palindrome");
        }
    }
}
