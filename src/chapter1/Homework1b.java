package chapter1;

import java.util.Scanner;

public class Homework1b {
    public static void main(String[] args) {
         Scanner keyboard = new Scanner(System.in);
        System.out.println(" Enter a text please");
        String text = keyboard.nextLine();
        System.out.println(text.length());
        System.out.println(text.charAt(0));
        System.out.println(text.charAt(text.length()-1));


    }
}
