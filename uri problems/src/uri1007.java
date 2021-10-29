
import java.util.Scanner;

public class uri1007 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int A = inp.nextInt();
        int B = inp.nextInt();
        int C = inp.nextInt();
        int D = inp.nextInt();
        int difference = (A*B-C*D);
        System.out.println("DIFERENCA = " + difference);

    }
}
