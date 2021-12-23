import java.util.Scanner;

public class uri1144 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int N = inp.nextInt();
        if (N>1 && N<1000) {
            for (int i = 1; i <= N; i++) {
                System.out.printf("%s %s %s%n", i, i*i, i*i*i);
                System.out.printf("%s %s %s%n", i, i*i+1, i*i*i+1);
            }
        }
    }
}
