import java.util.Scanner;

public class uri1172 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i =0; i < 10; i++){
            arr[i]= inp.nextInt();
            if (arr[i] <= 0){
                arr[i] = 1;
            }
        }
        for (int i = 0; i< 10; i++){
            System.out.printf("X[%d] = %d%n", i, arr[i]);
        }
    }
}
