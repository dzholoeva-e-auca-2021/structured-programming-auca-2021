import java.util.Scanner;

public class uri1005 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double a = inp.nextDouble();
        double b = inp.nextDouble();
        double c = (3.5*a+7.5*b)/(3.5+7.5);

        System.out.printf("MEDIA = %.5f", c);
    }
}
