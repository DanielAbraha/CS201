package lab4;

import java.util.Scanner;

public class CoffeeBag {
    public static void main(String[] args) {
        int numberOfBags;
        double bagWeight;
        final   double PRICE_PER_POUND = 5.99;
        final  double TAX_RATE = 7.25;
        double totalPriceWithTax ;
        double price;
        Scanner keyboard = new Scanner(System.in);
        System.out.println( " Enter the number of bags sold ");
        numberOfBags = keyboard.nextInt();
        System.out.println(" Enter the weight per bag");
        bagWeight = keyboard.nextDouble();
        price = bagWeight * numberOfBags * PRICE_PER_POUND;
        totalPriceWithTax = price + (price * TAX_RATE / 100);
        totalPriceWithTax  = Math.round(totalPriceWithTax * 100.0)/100.0;
        System.out.println(" Number of bags sold : " + numberOfBags);
        System.out.println(" Weight per bag : " + bagWeight + "lb");
        System.out.println(" Price per pound : $" + PRICE_PER_POUND);
        System.out.println(" Sales tax : " + TAX_RATE + "%");
        System.out.println(" Total price : $" + totalPriceWithTax  );
    }

}
