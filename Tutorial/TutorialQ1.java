public class TutorialQ1 {
    public static void main(String[] args) {
        int miles = 26;
        int yards = 385;
        double kilometers;

        // Convert yards to miles, then total to kilometers
        kilometers = (miles + (yards / 1760.0)) * 1.609;

        System.out.println("Kilometers = " + kilometers);
    }
}
