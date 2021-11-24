import java.util.Scanner;

public class lab0303 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("1st number?");
        int a = inp.nextInt();

        System.out.println("2nd number?");
        int b = inp.nextInt();

        System.out.println("3rd number?");
        int c = inp.nextInt();
        {
            if (a > b && b < c)
           System.out.println("The value " + c + " is the greatest");
            }
            else if (b > a && a < c) {
                System.out.println("The value" + b + "is the greatest");
            } else if (c > a && c > b) {
                System.out.println("The value" + c + "is the greatest");
            }

        }
    }
}
