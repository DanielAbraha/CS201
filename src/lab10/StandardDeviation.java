package lab10;

import java.util.Scanner;

public class StandardDeviation {

        public static void main(String[] args) {
            double sum=0;
            double deviation=0;
            double mean = 0;
            Scanner keyboard = new Scanner(System.in);
            System.out.println(" Enter the size of an array ");
            int N = keyboard.nextInt();
            double[] num = new double[N];
            for(int i=0;i<N;i++) {
                System.out.println("Enter the values for index " + i);
                num[i] = keyboard.nextDouble();
                sum = sum + num[i];

                mean = sum / N;

                deviation += Math.pow((num[i] - mean), 2);
            }


            double standardDeviation= Math.sqrt(deviation/N);
            System.out.println(" The sum is = " + sum);
            System.out.println("The mean is = " + mean);
            System.out.println("The deviation is =  " + deviation);
            System.out.println("standard Deviation is = " + standardDeviation);


        }
    }


