package chapter1;

import java.util.Random;

   public class Quize2 {
        public static void main(String[] args) {
            Random grade = new Random();
            char grad = (char) (grade.nextInt( 4)+('A'));
            for(int i=0; i<10;i++){
                System.out.println(grad);
            }



        }
    }

