import java.util.Scanner;

public class uri1115 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        while (true) {
            int x = inp.nextInt();
            int y = inp.nextInt();

            if (x == 0 || y == 0) {
                break;
            } else if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else if (x > 0 && y < 0) {
                System.out.println("quarto");
            }
        }
    }
}
