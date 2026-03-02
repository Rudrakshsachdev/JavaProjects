// program to print the sum of first N natural numbers
public class PrintNum {

    // Recursive function defintion
    static int num(int num) {
        if (num == 1) {
            return 1;
        }

        return num + num(num - 1);
    }
    public static void main(String[] args) {
        int N = 10;

        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.println("The sum of first " + N + " natural numbers is: " + sum);

        System.out.println("The sum of first " + N + " natural numbers using recursive function is: " + num(N));
    }
}
