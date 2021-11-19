import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Length in inches?");
        double length = inp.nextDouble();
        final double in = 2.54 ;
        double c = length * in ;
        System.out.printf("%f in. = %.2f cm", length, c);
    }
}
