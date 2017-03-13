
import java.util.Scanner;
public class DecimalToBinary {

   public String toBinary(int n) {
       if (n == 0) {
           return "0";
       }
       String binary = "";
       while (n > 0) {
           int rem = n % 2;
           binary = rem + binary;
           n = n / 2;
       }
       return binary;
      
   }

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a number: ");
       int decimal = scanner.nextInt();

       long startTime = System.nanoTime();

       DecimalToBinary decimalToBinary = new DecimalToBinary();
       String binary = decimalToBinary.toBinary(decimal);
       
       long stopTime = System.nanoTime();

       long totalTime = stopTime - startTime;
       System.out.println(totalTime);

       System.out.println("The binary representation is " + binary);
    
   }
}