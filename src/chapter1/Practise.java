package chapter1;

import java.util.Random;
import java.util.Scanner;

public class Practise {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Enter the number of rolls ");
        int rolls = keyboard.nextInt();
       for( int i = 1; i<=rolls; i++ ){
            Random random = new Random();
            int dice1 = random.nextInt( 6)+1;
            int dice2 = random.nextInt( 5)+3;
            System.out.print( " ("+ dice1 + " , " + dice2 +")");


        }
            // if you want to call a method we create a void method

            }
        }






