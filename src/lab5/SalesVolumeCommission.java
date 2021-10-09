package lab5;

import java.util.Scanner;

public class SalesVolumeCommission {

        public static final double HOURLY_WAGE = 7.25;
        public static final double OVER_TIME_WAGE = 10.875;
        public static final int WEEKLY_WORKED_HOURS = 40;

        public static void workHours() {
            Scanner keyboard = new Scanner(System.in);
            System.out.println(" Enter the hours worked");
            int hours = keyboard.nextInt();
            if (hours <= WEEKLY_WORKED_HOURS) {
                System.out.println(" the total wage is : " + HOURLY_WAGE * hours);
            } else {
                System.out.println(" The total wage is : " + (OVER_TIME_WAGE * (hours - WEEKLY_WORKED_HOURS)+(WEEKLY_WORKED_HOURS * HOURLY_WAGE)));

            }

        }
        public static double commissionWage(){
            Scanner input = new Scanner(System.in);
            System.out.println(" Enter the sale amount");
            double sales = input.nextDouble();
            double totalWage;
            if( sales >= 1.00 && sales< 99.9){
                double commission1 = sales * 0.05;
                totalWage = commission1 + sales;
                return totalWage;
            } else if( sales > 100.00 && sales < 299.99){
                double commission2 = sales * 0.1;
                totalWage = commission2 + sales;
                return totalWage;
            } else{
                double commission3 = sales * 0.15;
                totalWage = commission3 + sales;
                return totalWage;
            }
        }

        public static void main(String[] args) {
            workHours();
            System.out.println(" The total wage : " + commissionWage());
        }
    }

