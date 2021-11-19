import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a degree in Celsius:");
        double c = inp.nextDouble();
        double f = (c*(9.0/5.0)) + 32.0 ;
        System.out.printf("%f Cesium is %.2f Farenheit", c, f);
    }
}
