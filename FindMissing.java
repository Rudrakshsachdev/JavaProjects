public class FindMissing {
   public static void main(String[] args) {

    int[] arr = {1, 2, 4, 5, 6, 7, 8, 9};

    int n = arr.length+1;

    int expected_sum = n * (n + 1) / 2;

    int actual_sum = 0;

    for (int i = 0; i < n; i++) {
        actual_sum += i;
    }

    int missing_number = expected_sum - actual_sum;

    System.out.println("The missing number is: " + missing_number);
   } 
}
