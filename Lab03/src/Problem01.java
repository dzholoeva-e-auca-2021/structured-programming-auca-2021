import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Some real number?");
        double a = inp.nextDouble();
        double x  = Math.abs(a);
        System.out.printf("[" + a + "]" + "=" + " %.4f" ,  x);
    }
}
