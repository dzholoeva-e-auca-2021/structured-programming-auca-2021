import java.util.Scanner;

public class uri1020 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        double c = (b/12.0)*a;
        System.out.printf("%.3f", c);
    }
}
