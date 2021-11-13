import java.util.Scanner;

public class uri1010 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int a1 = inp.nextInt();
        double a2 = inp.nextDouble();
        int b = inp.nextInt();
        int b1 = inp.nextInt();
        double b2 = inp.nextDouble();
        double value = (a1*a2 + b1*b2);
        System.out.printf("VALOR A PAGAR: R$ %.2f", value);
    }
}
