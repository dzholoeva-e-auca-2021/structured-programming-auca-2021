import java.util.Scanner;

public class uri1154 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number = 0;
        int all = 0;
        while (true) {
            int age = inp.nextInt();

            if(age<0) {
                break;

            } else {
            all+=age;
            number++;
            }
        }
        double average = all/(double)number;
        System.out.printf("%.2f%n", average);
    }
}
