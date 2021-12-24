import java.util.Scanner;

public class uri1159 {
    public static void main(String[] args) {
        Scanner inp = new Scanner((System.in));
        while(true) {
            int x = inp.nextInt();
            int sum = 0;
            int n = 0;
            if (x==0){
                break;
                } else {
                while (n<5){
                    if (x%2==0) {
                      sum +=x;
                      n++;
                    }
                    x++;
                }
                System.out.println(sum);
            }
        }
    }
}
