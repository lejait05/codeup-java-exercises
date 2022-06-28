public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 0;
//do{
////    System.out.println("value" + i);
//    i = i + 1;
//    System.out.println("new value " + i);
//} while (i < 100);
//
//    }
        for (i = 0; i <= 100; i += 1) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
