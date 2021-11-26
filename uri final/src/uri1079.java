import java.util.Scanner;

public class uri1079 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int N = inp.nextInt();
        int i = 0 ;

        while (i < N) {
            double a1 = inp.nextDouble();
            double a2 = inp.nextDouble();
            double a3 = inp.nextDouble();
        double average = (2*a1 + 3*a2 + 5*a3)/(2+3+5);
            System.out.printf("%.1f%n", average);
        i++;
        }
    }
}
