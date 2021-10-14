package lab10;

import java.util.Arrays;
import java.util.Scanner;

public class DNACodon {

        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter the DNA codons ");
            String word = keyboard.nextLine();
            int num = (word.length()) / 3;
            String[] dna = new String[num];
            for (int j = 0, i = 0; j < num && i <= (3 * num); i += 3, j++) {
                dna[j] = word.substring((i), (i + 3));
            }
            for (String s : dna) {
                System.out.println(s);
            }
            System.out.println(Arrays.toString(dna));

        }

    }


