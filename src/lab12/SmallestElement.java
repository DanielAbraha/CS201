package lab12;

import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter the size of the array");
            int n = input.nextInt();
            int integer[] = new int[n];
            System.out.println("Enter "+ n +" " +"numbers");
            for( int i = 0; i < n; i++){
                integer[i] = input.nextInt();
            }
            small (integer, n, 0, integer[0]);
        }
        public static void small(int y[], int num, int index, int least){
            if (index < num){
                if ( least <= y[index]){
                    index++;
                    small(y, num, index,least);
                } else{
                    least =y[index];
                    index++;

                    small(y, num, index,least);
                }
            }
            else {
                System.out.println("The smallest Number Entered is: " + least);
            }
        }
    }


