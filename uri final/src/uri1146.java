import java.util.Scanner;

public class uri1146 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        while (true) {
            int X = inp.nextInt();
            if (X == 0) {
                break;
            } else {
                for (int i = 1; i <= X; i++) {
                    if (i == X) {
                        System.out.println(i);
                    } else {
                        System.out.print(i + " ");
                    }


                }
            }
        }
    }
    }
