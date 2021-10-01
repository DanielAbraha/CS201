package lab3solutions;

import java.time.YearMonth;
import java.util.Scanner;

public class AgeOfPerson {
    public static void main(String[] args) {
        int birthYear;
        final int currentYear = YearMonth.now().getYear();
        int age;
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Enter birth year");
        birthYear = keyboard.nextInt();
        age = currentYear - birthYear;
        System.out.println(" You were born in " + birthYear + " and will be " + age + " this year.");
        keyboard.close();
    }
}
