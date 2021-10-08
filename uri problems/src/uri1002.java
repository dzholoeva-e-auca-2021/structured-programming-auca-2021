import java.util.Scanner;

public class uri1002 {


        public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        final double p = 3.14159;
        double R = sc.nextDouble();
        double A = p * R * R;

        System.out.printf("A=%.4f", A);
                System.out.println();
    }

}