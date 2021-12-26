import java.util.Scanner;

public class uri1142 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int N = inp.nextInt();
        for (int i = 1; i < (4*N - 1); i++) {

            for (int j = i; j <= i+2; j++) {
                for (int k = j; k <=j+1; k++ )

                System.out.printf("%d %d %d", i, j,k);
                System.out.println(" PUM");

                }
            }
        }
    }
