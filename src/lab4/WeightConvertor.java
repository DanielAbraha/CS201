package lab4;

import java.util.Scanner;

public class WeightConvertor {
    private double moonWeight;

    public WeightConvertor(double moonWeight) {
        this.moonWeight = moonWeight;
    }

    public double convert(double earthWeight ){
        double weight = earthWeight * 0.167;
        return weight;

    }

    public static void main(String[] args) {
        WeightConvertor moonWeight = new WeightConvertor(0.167);
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Enter your weight in pounds");
        double earthWeight = keyboard.nextDouble();

        System.out.println( " Your moon weight is : " + moonWeight.convert(earthWeight));

    }

}

