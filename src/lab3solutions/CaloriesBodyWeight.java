package lab3solutions;

import java.util.Scanner;

public class CaloriesBodyWeight {
    public static final int CALORIES_PER_BODY = 19;
    public static void main(String[] args) {

        double bodyWeight;
        double calories;
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Enter the body weight in pounds");
        bodyWeight = keyboard.nextDouble();
        calories = bodyWeight* CALORIES_PER_BODY ;
        System.out.println( "The amount of calories in the body is " + calories);
        keyboard.close();
    }
}
