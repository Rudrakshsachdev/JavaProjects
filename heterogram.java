// program for checking if a string is a heterogram or not

public class heterogram {
    public static void main(String[] args) {
        String str = "Rudraksh";
        str = str.toLowerCase();
        
        boolean isHeterogram = true;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    isHeterogram = false;
                    break;
                }
            }
        }

        if (isHeterogram) {
            System.out.println("The string is a heterogram");
        } else {
            System.out.println("The string is not a heterogram");
        }
    }
}
