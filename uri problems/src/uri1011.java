import java.util.Scanner;

public class uri1011 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
       double R = inp.nextDouble();
       final double pi = 3.14159;
       double V = (4.0/3.0)*pi*R*R*R;
        System.out.printf("VOLUME = %.3f%n", V);
    }
}
