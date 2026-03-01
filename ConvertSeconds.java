//program for converting seconds into hours, minutes and seconds

public class ConvertSeconds {
    public static void main(String[] args) {
        int seconds = 2500;

        int hours = seconds / 3600;
        int minutes = seconds % 3600 / 60;
        int remainingSeconds = seconds % 60;

        System.out.println(hours + " hours " + minutes + " minutes " + remainingSeconds + " seconds");
    }
}
