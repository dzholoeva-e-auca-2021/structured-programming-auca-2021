import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        System.out.print("What's your name?");
        Scanner inp = new Scanner(System.in);
        String name = inp.next();
        System.out.println("Hello, " + name+"!");

    }
}
