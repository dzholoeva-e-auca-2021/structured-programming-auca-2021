import java.sql.SQLOutput;
import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Number of points?");
        int points = inp.nextInt();
        if (points <= 100 && points >= 90) {
            System.out.println("Grade: A");
        }
        if (points < 90 && points >= 80) {
            System.out.println("Grade: B");
        }
        if (points < 80 && points >= 70) {
            System.out.println("Grade: C");
        }
        if (points < 70 && points >= 60) {
            System.out.println("Grade: D");
        }
        if (points < 60 ) {
            System.out.println("Grade: F");
        }
        else {
            if (points < 0 || points > 100) {
                System.out.println(points + " is not in the permitted range.");
            }
        }

    }
}
