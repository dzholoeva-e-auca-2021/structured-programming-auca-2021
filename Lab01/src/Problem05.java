import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("1st double?");
        double a = inp.nextDouble();

        System.out.println("2nd double?");
        double b = inp.nextDouble();

        double sum = a+b;
        double sub = a-b;
        double mul = a*b;
        double div = a/b;
        double rem = a%b;
        System.out.printf("a", "+",  "b", "=", "sum = %.5f", sum);
        System.out.printf("a = %.5f", "-",  "b = %5f","=", sub);
        System.out.printf("a = %.5f", "*",  "b = %5f", "=", mul);
        System.out.printf("a = %.5f", "/",  "b = %5f", "=", div);
        System.out.printf("a = %.5f", "+",  "b = %5f", "=", rem);
    }
}
