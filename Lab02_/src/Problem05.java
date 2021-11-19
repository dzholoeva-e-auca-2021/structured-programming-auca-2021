import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Temperature in degrees Fahrenheit?");
        double f = inp.nextDouble();
         double c = (f-32)*(5.0/9.0) ;
        System.out.printf("The temperature in degrees Celsius is %.2f", c);
    }
}
