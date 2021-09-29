package chapter1;

import java.util.Scanner;

public class Homework1a {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Enter full name please ");
        String fname = keyboard.next();
        String mname = keyboard.next();
        String lname = keyboard.next();
        System.out.println(fname +" " + mname.substring(0,1) + "." + " " +  lname);
    }
}
