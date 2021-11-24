import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Integer?");
        int n = inp.nextInt();
        int s = 0 ;
        while (n != 0 ) {
            s += Math.abs(n) % 10 ;
            n /= 10;
        }
        System.out.println("The sum of all digits is" + s);
    }
}
