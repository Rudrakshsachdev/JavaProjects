public class Countchar {
    public static void main(String[] args) {
        int count = 0;
        int overallCount = 0;
        String str = "Hello World";

        for (int i = 0; i < str.length(); i++) {
            overallCount++;
            if (str.charAt(i) == 'l') {
                count++;
            }
        }

        System.out.println("The count of 'l' in the string is: " + count);
        System.out.println("The overall count of characters in the string is: " + overallCount);
    }
}

// This program counts the number of occurrences of the character 'l' in the string "Hello World" and also counts the total number of characters in the string. The results are printed to the console.
