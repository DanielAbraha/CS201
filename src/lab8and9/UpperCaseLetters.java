package lab8and9;


import java.util.Scanner;

public class UpperCaseLetters {
    public static void main(String[] args) {

            Scanner input= new Scanner(System.in);
            System.out.println("Enter the sentence");
            String word=input.nextLine();
            while(word!="") {

                UpperCaseLetters.upperCaseCounter(word);
                System.out.println("Enter the sentence");
                word=input.nextLine();
            }
    }
    public static void upperCaseCounter(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i)))
                count++;
        }
        System.out.println("There are " + count + " Upper Cases in : " + word);
    }
}