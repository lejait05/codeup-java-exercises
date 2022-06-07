import java.sql.SQLOutput;

public class Loopcontrollec {
    public static void main(String[] args) {
        int i = 0;
        while (i< 10){
            System.out.println("This is inside the Loop. Before i is incremented though. The value of i is" +i);
            i = i +1;
            System.out.println("This is still inside the loop, but now the loop control varible has incremented the value of i is now" +i);
        }
    }
}
