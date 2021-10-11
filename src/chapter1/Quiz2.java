package chapter1;

import java.util.Random;

public class Quiz2 {
    public static void main(String[] args) {
        Random grade = new Random();
        for (int i = 0; i < 10; i++) {
        char grad = (char) (grade.nextInt(4) + 'A');

            System.out.print(grad + " ");
        }
    }
}