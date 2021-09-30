package chapter1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Homework1c {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Enter a text");
        String text = keyboard.nextLine();
        int middle = text.length();
        System.out.println(text.charAt(middle/2));

    }
}
