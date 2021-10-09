package lab7;

public class WhileDoWhileForLoop {
    public static void main(String[] args) {
        // using for loop
        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            sum += i;
//        }
//        System.out.println("The Total is " + sum);
        // using while loop

//        int sum1=0;
//        int i=1;
//        while ( i <=100){
//            sum1 +=i;
//            i++;
//        }
//        System.out.println("The Total is "+ sum1);
        // using do while
//        int sum2 =0;
//        int i=1;
//        do{
//            sum2 +=i;
//              i++;
//        } while (i <=100);
//        System.out.println(  "The total is " + sum2);


        // b. using for loop  5+10+15+...+50
//        int sum3 = 0;
//        int p = 5;
//        for (int p = 5; p < 50; p += 5) {
//            sum3 += p;
//
//            System.out.print("The total is " + sum3);
            //using while loop
//            int sum4 = 0;
//            int l = 5;
//            while (l <= 50) {
//                sum4 += l;
//                l += 5;
//            }
//            System.out.println("The total is " + sum4);

            // using do while
           int s =5;
                int sum5 = 0;
        do {
            sum5 += s;
            s+= 5;
        } while (s <= 50);
        System.out.println("The total is " + sum5);

            }
        }

