package lab10;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            double[][] temp = new double[12][31];
            double maxtemp = 0.0;
            double mintemp = 0.0;

            double sum = 0.0;
            for (int i = 0; i < temp.length; i++) {
                for (int j = 1; j < temp[i].length; j++) {
                    if (temp[i][j] > maxtemp)
                        maxtemp = temp[i][j];
                    if (temp[i][j] < mintemp)
                        mintemp = temp[i][j];
                    sum += temp[i][j];
                }
                double dt = maxtemp - mintemp;
                System.out.println("The month temp range is " + dt);
                double Average = (sum / temp[i].length);
                System.out.println("The month average temp is for " + i + " is " + Average);
            }
            System.out.println("To get temp of any day ");
            System.out.println("Enter the number of month ");
            int x = input.nextInt();
            if (x < 0 || x > 12) {
                System.out.println("Enter the number of month ");
                x = input.nextInt();
            }
            System.out.println("Enter the number of day ");
            int y = input.nextInt();
            if (y < 0 || y > 31) {
                System.out.println("Enter the number of month ");
                x = input.nextInt();
            }
            System.out.println("The temp is " + temp[x][y]);
        }
    }






