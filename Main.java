//Write a Java program to find power of a number using for loop
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int b, x, i;
        double r = 1;

        // b - To store base number
        // x - To store exponent number
        // r - To store result value
        
        System.out.println ("-----Enter the input of base number-----");
        b = in.nextInt();

        System.out.println ("\n-----Enter the input of exponent number-----");
        x = in.nextInt();

        for (i = x; i > 0; i--) {
            r *= b;
        }
        System.out.println ("\nThe calculation of the power of N number is " + b + "^" + x + " = " + r);
    }
}