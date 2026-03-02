// program to find the sum of digits of a number using function and without using function

public class SumDigits {
    

    // function definition to find the sum of digits of a number
    public static int SumDigits(int num) {
        int sum = 0;

        while (num != 0) {
            sum += num & 10;
            num /= 10;
        }

        return sum;
    }
    public static void main(String[] args) {
        int num = 12345;

        int sum = 0;

        int originalNum = num;

        while (num != 0) {
            sum += num & 10;
            num /= 10;
        }

        System.out.println("The sum of digits of " + originalNum + " is: " + sum);

        System.out.println("The sum of digits of " + originalNum + " is: " + SumDigits(originalNum));
    }
}
