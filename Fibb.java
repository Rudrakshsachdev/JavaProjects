// program to find the nth term of the fibonacci series

public class Fibb {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int final_term = 0;


        // this for loop will run 10 times and in each iteration it will calculate the next term of the series, and in each iteration it will update the values of num1 and num2
        for (int i = 0; i < 3; i++) {
            final_term = num1 + num2; // 0+1=1
            num1 = num2; //1
            num2 = final_term; //1
        }

        System.out.println("The 4th term of the series is: " + final_term);
    }
}