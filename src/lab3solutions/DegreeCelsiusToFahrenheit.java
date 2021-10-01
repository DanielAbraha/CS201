package lab3solutions;

import java.util.Scanner;

public class DegreeCelsiusToFahrenheit {
    // Declaring the constants.
    public static final double CONSTANT = 1.8;
    public static final int CONSTANT1 = 32;
    public static void main(String[] args) {

        double celsius;
        double fahrenheit;
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Enter the degree in Celsius");
        celsius = keyboard.nextDouble();
        fahrenheit = (CONSTANT*celsius)+CONSTANT1;
        System.out.println(fahrenheit);
        keyboard.close();

    }
}
