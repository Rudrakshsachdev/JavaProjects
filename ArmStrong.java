// program for checking whether a number is armstrong or not; Armstrong number is a number that is equal to the sum of the cubes of its digits

public class ArmStrong {
    public static void main(String[] args) {
        int number = 153;

        int originalNum = number;
        int sum = 0;

        // this loop will run until the number becomes 0 and in each iteration this loop will extract the last digit of the number and add it to the sum using Math.pow() which simply means power of the digit raised to 3
        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, 3);
            number /= 10;
        }

        // this if-else block will check if the original number is equal to the sum of the cubes of its digits
        if (originalNum == sum) {
            System.out.println(originalNum + " is an Armstrong number");
        } else {
            System.out.println(originalNum + " is not an Armstrong number");
        }

        
    }
}
