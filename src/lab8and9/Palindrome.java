package lab8and9;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = keyboard.nextLine();
        while (word != "") {
            Palindrome.palindromeCheck(word);
            System.out.println("Enter the word");
            word = keyboard.nextLine();
        }
    }

    public static void palindromeCheck(String word) {
        String reversed = "";
        for (int i = (word.length() - 1); i >= 0; i--) {
            reversed += (word.charAt(i));
        }
        if (reversed.equalsIgnoreCase(word))
            System.out.println("its a palindrome");
        else
            System.out.println("its not a palindrome");
    }
}
