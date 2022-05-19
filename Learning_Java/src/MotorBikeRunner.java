import java.text.NumberFormat;
import java.util.Scanner;

public class MotorBikeRunner {
    public static void main(String[]args){
        //Mortgage Calculator
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal
                * (monthlyInterest * Math.pow(1+ monthlyInterest,numberOfPayments) /
                (Math.pow(1 + monthlyInterest,numberOfPayments)-1));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}


//    NumberFormat currency = NumberFormat.getCurrencyInstance();
//    NumberFormat percentage = NumberFormat.getPercentInstance();
//    String percent = percentage.format(0.15);
//    String result = currency.format(12536156.36);
//        System.out.println(result);
//                System.out.println(percent);



  //  String x = "1";
//     int y = Integer.parseInt(x)+5;
//        System.out.println(y);

// implicit casting
// byte > short > int > long > float > double - no data loss
//        short x = 1;
//        int y = x + 2;
////        explicit casting
//        double i = 1.1;
//        int j = (int)i + 2; // We are saying that it's okay for lost to occur
//        System.out.println(j);


//// Arithmetic Expression * % + /  prefix ++x postfix x++
//      double result = (double)10 / (double) 3;
//      int x = 1;
//      x+=2;
//        System.out.println(x);
















































//        Using constants
        //final float PI = 3.14F; //our variables are capitalized 



//   Arrays
//        int[] number = new int [5];
//        number[0] = 1;
//        number[3] = 3;
//        System.out.println(number.length);
//        System.out.println(Arrays.toString(number)); // Method Overloading
//          int[][] numbers ={{1,2,3},{4,5,6}};
//          System.out.println(Arrays.deepToString(numbers));



//        String message = "Hello \"Murray\"";
//        String directoryLocation = "c:\nWindows\\sfc";
//        System.out.println(directoryLocation);
//        System.out.println(message);

//        String message = "Hello Murray!"+ " Ready to learn JAVA";
//
//        //Before
//        System.out.println(message);
//
//        // After
//        System.out.println(message.replace("Ready", "Prepare"));
//        System.out.println(message.toLowerCase());
//        System.out.println(message.trim());

//        Reference Type vs Primitive Types

//        Point point1 = new Point(1,7);
//        Point point2 = point1;
//        point1.x = 5;
//        System.out.println(point2);






//        MotorBike ducati = new MotorBike();
//        MotorBike honda = new MotorBike();
//
//        Book art_Of_Programming = new Book();
//        Book effective_Java = new Book();
//        Book clean_Code = new Book();


        // invoking or calling the method
//        ducati.start();
//        honda.start();


//        art_Of_Programming.bookTitle("Art Of Programming", 7);
//        effective_Java.bookTitle("Effective Java", 9);
//        clean_Code.bookTitle("Clean Code", 3);

        // Variables

//        byte myAge = 30;
//        byte herAge = myAge;
//        long viewsCount = 3_000_000_000L; // Java will always see as an int unless specified
//        float price = 10.99F;
//        char letter = 'M';
//        boolean isEligible = false;

//        Date now = new Date();
//        System.out.println(now);
