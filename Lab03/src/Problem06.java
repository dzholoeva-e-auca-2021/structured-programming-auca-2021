import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double a = inp.nextDouble();
        double b = inp.nextDouble();
        double c = inp.nextDouble();
        double D = Math.sqrt(b * b - 4 * a * c);
        double r1 = (-b + Math.sqrt(D)) / (2 * a);
        double r2 = (-b - Math.sqrt(D)) / (2 * a);
        if (D > 0) {
            System.out.println("The equation has two roots" + r1 + "and" + r2);
        }
        if (D == 0) {
            System.out.println("The equation has one root" + r1);
        }
       else {
            if (D < 0) {
                System.out.println("The equation has no roots");
            }

        }
    }
}