public class SpeedCoverter {

    public static long toMilesPerHour(double kilometersPerHour){

        if(kilometersPerHour < 0){
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHours){
        if(kilometersPerHours < 0){
            System.out.println("Invalid value");
        }else{
            long milesPerHours = toMilesPerHour(kilometersPerHours);
            System.out.println(kilometersPerHours + " Km/h= " + milesPerHours + " mi/h");
        }

    }

}
