import java.util.Scanner;

public class uri1116 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int N = inp.nextInt();
        for (int i = 0; i<N; i++){
            int X = inp.nextInt();
            int Y = inp.nextInt();
                if (Y==0){
                    System.out.println("divisao impossivel");
                }
                else {
                    System.out.printf("%.1f%n", ((double)X/Y));
                }
            }
        }
    }
