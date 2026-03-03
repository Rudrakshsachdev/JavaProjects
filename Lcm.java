// program for finding the GCD and LCM of two numbers using function and without using function

public class Lcm {

    static int gcd(int num1, int num2) {
        for (int i = 1; ((i < num1) && (i < num2)); i++) {
            if ((num1 % i == 0) && (num2 % i == 0)) {
                return i;
            }
        }
        return 1;
    }

    static int lcm(int num1, int num2) {
        return (num1 * num2) / gcd(num1, num2);
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        int gcd = 1;
        int lcm = 1;

        for (int i = 1; ((i < num1) && (i < num2)); i++) {
            if ((num1 % i == 0) && (num2 % i == 0)) {
                gcd = i;
            }
        }

        lcm = (num1 * num2) / gcd;

        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);

        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd(num1, num2));
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm(num1, num2));
    }
}
