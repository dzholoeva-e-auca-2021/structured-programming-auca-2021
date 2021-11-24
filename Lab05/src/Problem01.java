import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double sum = 0;
        int numberOfGrades = 0;
        int grade = inp.nextInt();
        while (grade != 0) {
            sum += grade;
            ++numberOfGrades;
            grade = inp.nextInt();
        }
        if (numberOfGrades != 0) {
            System.out.printf("The arithmetic mean is %.1f%n", sum / numberOfGrades);
        } else {
            System.out.println("Nothing to calculate");
        }
    }
}

