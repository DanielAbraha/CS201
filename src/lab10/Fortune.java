package lab10;

import java.util.Random;
import java.util.Scanner;

public class Fortune {

    public static void fortuneTeller(){
            Scanner Keyboard =new Scanner(System.in);
            System.out.println("Enter y or n");
            String choice= Keyboard.nextLine();

            while(choice.equalsIgnoreCase("y")){
                Random random= new Random();
                String [] rand={"you will get 4 gpa this semester. ", " Happiness is programing. ","Satisfaction follows hard work. ", "Patience is fortune."};
                int no_choice=random.nextInt(rand.length);
                System.out.println(rand[no_choice]);
                System.out.println("Enter y or n");
                choice= Keyboard.nextLine();
            }
        }
    public static void main(String[] args) {
        fortuneTeller();
    }
}
