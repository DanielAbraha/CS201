package lab8and9;


import java.sql.SQLOutput;
import java.util.Scanner;

public class DNAStrand {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Enter DNA strand");
        String dna = keyboard.nextLine();
        dna.toUpperCase();

        while (dna != "") {
            for (int i = 0; i < dna.length(); i++) {
                char word = dna.charAt(i) == 'A' ?
                        'T' : dna.charAt(i) == 'T' ? 'A'
                        : dna.charAt(i) == 'G' ? 'C' : 'G';
                System.out.print(word);
            }
            System.out.println();
            System.out.println(" Enter DNA strand");
            dna = keyboard.nextLine().toUpperCase();


        }
    }

}