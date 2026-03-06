public class CountVowels {
    public static void main(String[] args) {
        int count = 0;
        
        String vowels = "aeiouAEIOU";

        String str = "Hello World";

        for (int i = 0; i < str.length(); i++) {
            if (vowels.contains(str.charAt(i))) {
                count++;
            }
        }

        System.out.println("Number of vowels: " + count);
    }
}
