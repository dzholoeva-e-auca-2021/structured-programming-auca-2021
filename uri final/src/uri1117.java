import java.util.Scanner;

public class uri1117 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double a = inp.nextDouble();
        double b = inp.nextDouble();
        if (a>=0 && a<=10 && b>=0 && b<=10) {
            double media = (a+b)/2;
            System.out.printf("media = %.2f", media);
        } else {
            System.out.println("nota invalida");
             a = inp.nextDouble();
             b = inp.nextDouble();
        }
    }
}
