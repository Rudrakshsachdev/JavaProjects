// program for counting vowels and consonants


public class CountVowels {
    public static void main(String[] args) {
        int Vowelcount = 0;
        int Consonantcount = 0;

        String vowels = "aeiouAEIOU";

        String test = "Hello World!";


        //  this for loop will run till the length of the string and check if the character is a vowel or not
        for (int i = 0; i < test.length(); i++) {

            // this if block will check if the character is a vowel or not
            if (vowels.contains(String.valueOf(test.charAt(i)))) {
                Vowelcount++;
            } else {
                Consonantcount++;
            }
        }

        System.out.println("Number of vowels: " + Vowelcount);
        System.out.println("Number of consonants: " + Consonantcount);
    }
}
