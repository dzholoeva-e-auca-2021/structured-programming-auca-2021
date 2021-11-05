import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("1st number? ");
        int a = inp.nextInt();
        System.out.print("2nd number? ");
        int b = inp.nextInt();
        System.out.print("3rd number ");
        int c = inp.nextInt();
        int max = a; {
        if (max < b)
            max = b; }
        {
            if (max < c)
                max = c;
        }
                System.out.println("The value " + max + " is the greatest.");
            }
        }

