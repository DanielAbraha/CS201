package quize;

public class Quiz5b {
    public static void printNextTen(int num){

        for( int i=num ;i<=num+10;i++){
            System.out.print((i) +  " "  );

        }
    }

    public static void main(String[] args) {
        printNextTen(5);
    }
}

