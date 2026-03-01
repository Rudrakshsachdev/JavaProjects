// program for finding the GCD of two numbers

public class GCD {

    // function definition
    static int gcd(int num1, int num2) {
        int gcd = 1;

        for (int i = 1; ((i < num1) && (i < num2)); i++) {
            if ((num1 % i == 0) && (num2 % i == 0)) {
                gcd = i;
            }
        }

        return gcd;
    }
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int gcd = 1;

        for (int i = 1; ((i < num1) && (i < num2)); i++) {
            if ((num1 % i == 0) && (num2 % i == 0)) {
                gcd = i;
            }
        }

        System.out.println("GCD of " + num1 + " and " + num2 + " is " + gcd);

        // function calling
        int num3 = 13;
        int num4 = 26;
        System.out.println("GCD of " + num3 + " and " + num4 + " is " + gcd(num3, num4));
    }
}
