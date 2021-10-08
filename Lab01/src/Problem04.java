import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("1st int?");
        int a = inp.nextInt();

        System.out.println("2nd integer?");
        int b = inp.nextInt();

        int sum = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;
        int rem = a%b;
        System.out.println(a+"+"+ b+ "="+sum);
        System.out.println(a+"-"+b+"="+sub);
        System.out.println(a+"*"+ b+ "="+mul);
        System.out.println(a+"/"+ b+ "="+div);
        System.out.println(a+"%"+ b+ "="+rem);
    }
}
