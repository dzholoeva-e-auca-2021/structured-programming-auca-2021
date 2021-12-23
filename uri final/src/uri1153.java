import java.util.Scanner;

public class uri1153 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int N = inp.nextInt();
        int result = 1;
        for (int i=1; i<=N; i++) {
            result = result * i;
        }
            System.out.println(result);
        }
    }

