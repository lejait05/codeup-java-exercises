import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

        System.out.println(" Enter the numbers to be added:");
        Scanner readInput = new Scanner(System.in);
        int a = readInput.nextInt();
        int b = readInput.nextInt();
        readInput.close();
        System.out.println("The sum of  a and b is :" + Integer.sum(a,b));

        private static String subtraction(int num1, int num2) {
            num1 - num2;
        }
        System.out.println(" Enter the numbers to be subtracted:");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        readInput.close();
        System.out.println(" The difference between num1 and num2 is : " + subtraction(num2,num1) );
//        public static int getInteger(int min, int max);
//        if ( max == 0){
//            return 1;
//        }
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);


    }




}
