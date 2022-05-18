public class MotorBikeRunner {

    public static void main(String[] args){
        MotorBike ducati = new MotorBike();
        MotorBike honda = new MotorBike();

        Book art_Of_Programming = new Book();
        Book effective_Java = new Book();
        Book clean_Code = new Book();


        // invoking or calling the method
//        ducati.start();
//        honda.start();


        art_Of_Programming.bookTitle("Art Of Programming", 7);
        effective_Java.bookTitle("Effective Java", 9);
        clean_Code.bookTitle("Clean Code", 3);
    }
}
