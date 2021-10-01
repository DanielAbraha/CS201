package lab3solutions;

import java.util.Scanner;

public class ConversionInchToCentimeter {
    public static void main(String[] args) {

        double centimeter;
        Scanner keyboard = new Scanner(System.in);
        System.out.println( " Enter a number to be convert");
        centimeter = keyboard.nextDouble();
        double inch  =  centimeter/2.54;
        int feet = (int) inch/12;
        int  inches = (int) inch % 12;


        System.out.println(" The converted centimeter is " + feet + " and  " + inches );
        keyboard.close();


    }

}

