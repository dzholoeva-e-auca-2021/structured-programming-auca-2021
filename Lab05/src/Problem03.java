import java.util.Random;
import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        //System.out.println((int)(100 * Math.random());
        System.out.println("Number of tests?");
        int nTest = inp.nextInt();


        Random rnd = new Random();
        int i = 0;
        while (i < nTest) {
            int numOfCorrectAnswers = 0;
            int x = -50 + rnd.nextInt(101);
            ;
            int y = -50 + rnd.nextInt(101);
            System.out.printf("%d + %d = ", x, y);
            int userAnswer = inp.nextInt();
            if (x + y == userAnswer) {
                ++numOfCorrectAnswers;
            }
            ++i;
        }
    }
}
