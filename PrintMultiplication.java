// program for calculating the multiplication table of a number

public class PrintMultiplication {

    // function definition
    static void PrintTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
    public static void main(String[] args) {
        int number = 5;

        PrintTable(number); // function calling
    }
}
