// program for calculating the factorial of a number using recursion and iteration

public class Factorial {

    // Recursive function definition
    static int factorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }

        return number * factorial(number - 1);
    }

    public static void main(String[] args) {
        int number = 5;
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + number + " is " + factorial);

        // function calling
        int number1 = 7;
        System.out.println("Factorial of " + number1 + " is " + factorial(number1));
    }
}
