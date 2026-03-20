// program for finding larget of 3 numbers without using conditional statement and relational operators, implemented this program using Math.max() method

public class Largest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        int max_abc = Math.max(a, Math.max(b, c));
        System.out.println("The largest number is: " + max_abc);
    }
}