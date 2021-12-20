import java.util.Scanner;

public class uri1113 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        while (true) {
            int X = inp.nextInt();
            int Y = inp.nextInt();

            if (X == Y) {
                break;
            } else if (X > Y) {
                System.out.println("Decrescente");
            } else if (X < Y) {
                System.out.println("Crescente");
            }


        }
    }
}

