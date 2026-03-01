// program for checking whether a number is prime or not

public class Prime {
    // function definition
    static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 3;

        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }

        // function calling
        int number1 = 10;
        if (isPrime(number1)) {
            System.out.println(number1 + " is a prime number");
        } else {
            System.out.println(number1 + " is not a prime number");
        }
    }
}
