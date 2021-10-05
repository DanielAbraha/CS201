package chapter1;

import java.util.Scanner;

public class Quize1 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Please enter first name and last name ");
        String fname = keyboard.next();
        String lname = keyboard.next();
        System.out.println(fname.charAt(0) + lname + "@miu.edu");
    }
}
