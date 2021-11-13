import java.util.Scanner;

public class uri1008 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        double c = inp.nextDouble();
        double salary = b * c;
        System.out.println("NUMBER = " + a);
        System.out.printf("SALARY = U$ %.2f", salary);
    }
}