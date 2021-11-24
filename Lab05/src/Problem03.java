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
            System.out.println(-50 + rnd.nextInt(101));
            System.out.println(-50 + rnd.nextInt(101));
            ++i;
        }
    }
}
