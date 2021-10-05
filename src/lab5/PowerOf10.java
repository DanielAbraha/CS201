package lab5;

import java.util.Scanner;

public class PowerOf10 {
        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println(" Enter an integer power of 10 ");
            int number = keyboard.nextInt();
            if (number == 6) {
                System.out.println(" Million");
            } else if (number == 9) {
                System.out.println(" Billion");
            }  else if( number==12){
                System.out.println(" Trillion");
            } else if( number==15) {
                System.out.println(" Quadrillion");
            }  else if( number==18) {
                System.out.println(" Quintillion");
            }else if( number==21) {
                System.out.println(" Sextillion");
            }else if( number==30) {
                System.out.println(" Nonillion");
            }else if( number==100) {
                System.out.println(" Googol");
            }else
                System.out.println(" Invalid entry");
        }
    }

