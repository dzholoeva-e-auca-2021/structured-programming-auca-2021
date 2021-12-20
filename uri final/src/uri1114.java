import java.util.Scanner;

public class uri1114 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int password = 2002;
        int input = inp.nextInt();
        while (input != password) {
            System.out.println("Senha Invalida");
            input = inp.nextInt();
            if (input == password) {
                System.out.println("Acesso Permitido");
            }

        }
    }
}
