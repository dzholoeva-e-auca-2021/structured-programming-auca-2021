import java.util.Scanner;

public class uri1002 {


        public static void main (String[]args){
        Scanner inp = new Scanner(System.in);

        final double p = 3.14159;
        double R = inp.nextDouble();
        double A = p * R * R;

        System.out.printf("A=%.4f", A);

    }

}