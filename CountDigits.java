// program for counting the number of digits in a number

public class CountDigits {

    // function definition
    static int countDigits(int number) {
        int count = 0; //placeholder for counting the digits

        while (number != 0) {
            number /= 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int number = 123456789;

        int count = 0; // for counting digits

        // this loop will run until the number becomes 0 and each iteration this loop will divide the number by 10 and increment the count
        while (number != 0) {
            number /= 10;
            count++;
        }

        System.out.println("Number of digits: " + count);

        int number1 = 1234;
        // function calling
        System.out.println("Number of digits: " + countDigits(number1));
    }
}
