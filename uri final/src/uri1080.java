import java.util.Random;
import java.util.Scanner;

public class uri1080 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        Random rnd = new Random();
        int i = 0;
        while (i < 101) {
            System.out.println(0 + rnd.nextInt(100000));
            ++i;
        }
    }
}
