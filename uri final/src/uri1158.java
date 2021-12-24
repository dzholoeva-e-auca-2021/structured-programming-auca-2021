import java.util.Scanner;

public class uri1158 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int N = inp.nextInt();
        for (int i = 0; i < N; i++) {
            int X = inp.nextInt();
            int Y = inp.nextInt();
            int count = 0;
            int sum = 0;
            while (Y > count) {
                if (X % 2 != 0) {
                    sum += X;
                    count++;

                }
                X++;

            }
            System.out.println(sum);
        }
    }
}
