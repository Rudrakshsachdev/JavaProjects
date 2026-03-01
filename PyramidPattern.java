// program for printing the right-angled triangle pattern

public class PyramidPattern {
    public static void main(String[] args) {
        int rows = 5;

        // the first loop will run for the rows
        for (int i = 1; i <= rows; i++) {
            // the second loop will run for the columns and each iteration it will print the spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("");
            }

            // the third loop will run for the columns and each iteration it will print the stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();   
        }
    }
}
