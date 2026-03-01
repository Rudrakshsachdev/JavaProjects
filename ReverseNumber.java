public class ReverseNumber {
    public static void main(String[] args) {
        int number = 123;
        int revNum = 0;

        while (number != 0) {
            int digit = number % 10;
            revNum = revNum * 10 + digit; // 0*10+3=3
            number /= 10;
        }

        System.out.println("Reversed Number: " + revNum);
    }
}
