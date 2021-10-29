import java.util.Scanner;

public class uri1012 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        final double pi = 3.14159;
        double A = inp.nextDouble();
        double B = inp.nextDouble();
        double C = inp.nextDouble();
        double triangle = (0.5 * A * C);
        double circle = (pi * C * C);
        double trapezium = (( (A+B)/2 ) * C);
        double square = (B*B);
        double rectangle = (A*B);
        System.out.printf("TRIANGULO: %.3f%n" , triangle );
        System.out.printf("CIRCULO: %.3f%n" , circle);
        System.out.printf("TRAPEZIO: %.3f%n" , trapezium);
        System.out.printf("QUADRADO: %.3f%n" , square);
        System.out.printf("RETANGULO: %.3f%n" , rectangle);

    }
}
