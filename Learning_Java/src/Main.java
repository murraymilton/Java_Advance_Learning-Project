public class Main {

    public static void main(String[] args) {

        long miles = SpeedCoverter.toMilesPerHour(20.5);
        System.out.println("Miles = " + miles);

        SpeedCoverter.printConversion(10.5);
    }
}
