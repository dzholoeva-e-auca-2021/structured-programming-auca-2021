import java.util.Scanner;
public class Problem06 {

    public static void main(String[] args) {
         int value;
         int sum = 0;
         Scanner input = new Scanner(System.in);
         do {
             System.out.print("Enter an integer (the input ends if it is 0): ");
             value = input.nextInt();

             sum += value;
             } while (value != 0);
         System.out.println("The sum is " + sum);
    }
}