package lab7;

import java.util.Scanner;

public class PrimeNumbers {
    public static boolean primeNumber(int number ){
        for(int i=2;i<number;i++){
            if(number%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        while(true){
            System.out.println(" Enter an integer ");
            int num = keyboard.nextInt();
            if(num<0) {
                System.out.println("End loop");
                break;
            } if (primeNumber(num)) {
                    System.out.println(num + " is prime ");
                } else {
                    System.out.println(num + " is not prime");
               }


      }

     }

    }
