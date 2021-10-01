import java.util.Scanner;

public class uri1001 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("a=");

        int a = inp.nextInt();

        System.out.println("b=");
        int b = inp.nextInt();

        int sum = a + b;

        System.out.println("x=" + sum);
    }
}