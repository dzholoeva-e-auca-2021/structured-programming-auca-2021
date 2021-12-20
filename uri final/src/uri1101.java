import java.util.Scanner;

public class uri1101 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        while (true) {
            int M = inp.nextInt();
            int N = inp.nextInt();
            int sum = 0;
            if (M <= 0 || N <= 0) {
                break;
            }

            for (int i = N; i <= M; i++) {
                sum += i;
                System.out.println(i + " ");
            }
                    System.out.println("Sum=" + sum);
                }
        }

        }

