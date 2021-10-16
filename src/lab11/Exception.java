//package lab11;
//
    import java.util.InputMismatchException;
import java.util.Scanner;
//          Question #1.
//public class Exception {
//    Scanner scanner = new Scanner(System.in);
//    try{
//        int num = scanner.nextInt();
//        if ( num!=0){
//            throw new java.lang.Exception("Not zero");
//        }
//        System.out.println("I'm happy with the input.");
//
//    } catch (InputMismatchException e){
//        System.out.println("Invalid Entry");
//    }catch (Exception e){
//        System.out.println(" Error: " + e.getMessage());
//    }
//
//}
//            a). -1;
//    Output : Error:Not zero
//            b). 0;
//    Output : I'm happy with the input.
//            c). 12xy;
//    Output : Invalid entry
//  --------------------------------------------------------------------------------------------------------------------
//            Question #2.
//              Scanner scanner = new Scanner(System.in);
//                    try{
//                    int num = scanner.nextInt();
//                    if ( num!=0){
//                    throw new java.lang.Exception("Not zero");
//                    }
//                    System.out.println("I'm happy with the input.");
//
//                    } catch (InputMismatchException e){
//                    System.out.println("Invalid Entry");
//                    }catch (Exception e){
//                    System.out.println(" Error: " + e.getMessage());
//                    } finally {
//                        System.out.println("Finally Clause Executed")
//
//
//                    }
//                    }
//                    a). -1;
//           Output : Error:Not zero
//                    Finally Clause Executed
//                    b). 0;
//           Output : I'm happy with the input.
//                    Finally Clause Executed
//                    c). 12xy;
//           Output : Invalid entry
//                    Finally Clause Executed