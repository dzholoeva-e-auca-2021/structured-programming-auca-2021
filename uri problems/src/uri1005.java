import java.util.Scanner;

public class uri1005 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double a = inp.nextDouble();
        double b = inp.nextDouble();
        double c = (a+b)/2;

        System.out.printf("MEDIA=%.5f", c);
    }
}
