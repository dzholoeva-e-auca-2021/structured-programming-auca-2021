import java.util.Scanner;

public class uri1013 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int X = inp.nextInt();
        double Y = inp.nextDouble();
        double fuel = X/Y ;
        System.out.printf("%.3f", fuel);
        System.out.print(" km/l");
    }
}
