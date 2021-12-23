import java.util.Scanner;

public class uri1133 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();;
        int y = inp.nextInt();
        if (x>y){
            int t = x;
            x = y;
            y = t;
        }
        for (int i = x + 1; i < y; i++) {
            if (i%5==2 || i%5==3) {
                System.out.println(i);
            }
        }
    }
}
