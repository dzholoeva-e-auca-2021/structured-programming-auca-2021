import java.util.Scanner;

public class uri1006 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double A = inp.nextDouble();
        double B = inp.nextDouble();
        double C = inp.nextDouble();
        double average = (2*A + 3*B + 5*C)/(2 + 3 + 5);
        System.out.printf("MEDIA = %.1f", average);
    }
}
