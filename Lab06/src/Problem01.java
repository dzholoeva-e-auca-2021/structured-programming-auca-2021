import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("User coordinate: ");
        int userX = inp.nextInt();

        System.out.println("Coordinate of the 1st point: ");
        int x1 = inp.nextInt();

        System.out.println("Coordinate of the 2nd number: ");
        int x2 = inp.nextInt();

        int d1 = AuAbs(userX - x1);

        int d2 = AuAbs(userX - x2);
        if (d1<d2) {
                System.out.println("The 1st point is closer. The distance is " + d1);
        } else if (d1>d2) {
            System.out.println("The 2st point is closer. The distance is " + d2);
        } else {
                System.out.println("The distance is the same. It is " + d1);
            }
    }

    private static int AuAbs(int value) {
        if (value < 0) {
            value =  -value;
        }
        return value;
    }
}
