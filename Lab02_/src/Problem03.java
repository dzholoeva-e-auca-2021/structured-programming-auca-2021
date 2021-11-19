import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("The four-digit integer?");
        int A = inp.nextInt();
        int a =A/1000 ;
        int b = A/100 - a*10;
        int c = A/10 - b*10 - a*100;
        int d = A - c*10 - b*100 - a*1000;
        int sum = a+b+c+d;
        System.out.println("The sum of digits is" + sum );

    }
}
