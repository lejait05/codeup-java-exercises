import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("%.3f",pi);
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter an integer:");
        int userInput = scanner.nextInt(5);
        System.out.println("You entered " + userInput);
        System.out.println(" Enter 3 words:");
        String first;
        String second;
        String third;

        System.out.printf(" You entered " + scanner.next() + scanner.nextLine() + scanner.nextLine());

    }
}

