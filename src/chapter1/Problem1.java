package chapter1;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Enter first and last name");
        String fname = keyboard.next();
        String lname = keyboard.next();
        System.out.println(fname.substring(0,1) + lname.substring(0,1));

    }
}
