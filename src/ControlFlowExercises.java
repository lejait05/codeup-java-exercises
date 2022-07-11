import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 0;
//do{
////    System.out.println("value" + i);
//    i = i + 1;
//    System.out.println("new value " + i);
//} while (i < 100);
//
//    }
//        for (i = 0; i <= 100; i += 1) {
//            if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if ((i % 3 == 0) && (i % 5 == 0)) {
//                System.out.println("FizzBuzz");
//            } else {
//                System.out.println(i);
//            }
//        }
     boolean keepGoing = false;
      do {
          System.out.println("Please enter an integer: ");
          Scanner scan = new Scanner(System.in);
          int userInt = scan.nextInt();
          System.out.println(userInt + "|" + userInt * userInt + "|" + Math.pow(userInt,3));
      for (int i = 1; i <= userInt; i += i++){
          System.out.println(i + "|" + i * i + "|" + Math.pow(i , 3));
      }
          System.out.println("Would you like to  enter another integer?  (yes/no) ");
      String userInput = scan.next();
          keepGoing = userInput.equalsIgnoreCase("yes");
      }while (keepGoing);
    }
}
