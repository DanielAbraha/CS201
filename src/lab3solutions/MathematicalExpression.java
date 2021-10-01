package lab3solutions;

public class MathematicalExpression {
    public static void main(String[] args) {
        //  Declaring and Initializing of  given variables.
        int A = 3;
        int B = 1;
        int C = 2;
        int X = 6;
        int Y = 4;
        int R = 5;
        // Square root of numbers
        double squareRoot = Math.sqrt(Math.pow(B, 2) + 4 * (A * C));
        System.out.println(squareRoot);
        double squareRoot2 = Math.sqrt(X + (4 * Math.pow(Y, 3)));
        System.out.println(squareRoot2);
        // cubic root of numbers
        double cubicRoot = Math.cbrt(X * Y);
        System.out.println(cubicRoot);
        // Area of a circle
        double areaOfCircle = Math.PI * Math.pow(R, 2);
        System.out.println(areaOfCircle);

    }
}