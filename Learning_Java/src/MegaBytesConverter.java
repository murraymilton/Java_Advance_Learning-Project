public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid value");
        }else{
            int megaBytes = kiloBytes / 1024;
            int bytesRemainder = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and "
             + bytesRemainder + " KB ");
        }
    }
}
