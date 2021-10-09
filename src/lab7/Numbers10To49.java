package lab7;

public class Numbers10To49 {
    public static void main(String[] args) {
        for (int r =1; r<= 4; r++) {
            for (int c = 0; c < 10; c++) {
                System.out.print( (10*r+c) + "\t"  );
            }
            System.out.println(" ");
        }

    }
}