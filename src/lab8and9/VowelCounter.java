package lab8and9;

import java.util.Scanner;

public class VowelCounter {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a sentence ");
        String sentence = keyboard.nextLine().toLowerCase();


        while (sentence != "") {
            VowelCounter.vowelCount(sentence);
            System.out.println("Enter any sentence");
            sentence = keyboard.nextLine();
        }
    }

    public static void vowelCount( String sentence) {
        int i = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;

        while (i < sentence.length()) {
            if (sentence.charAt(i) == 'a') {
                count1++;
            } else if (sentence.charAt(i) == 'e') {
                count2++;
            } else if (sentence.charAt(i) == 'i') {
                count3++;
            } else if (sentence.charAt(i) == 'o') {
                count4++;
            } else if (sentence.charAt(i) == 'u') {
                count5++;
            }
            i++;
        }
            System.out.println("# of \'a\' : " + count1);
            System.out.println("# of \'e\' : " + count2);
            System.out.println("# of \'i\' : " + count3);
            System.out.println("# of \'o\' : " + count4);
            System.out.println("# of \'u\' : " + count5);



    }
}



