// Swap two numbers using third variable

public class SwapUsingThird {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;

        System.out.println("Before Swapping: " + a + " " + b);

        int temp;

        temp = a; // temp = 10
        a = b; // a = 20
        b = temp; // b = 10

        System.out.println("After Swapping: " + a + " " + b);
    }
}
