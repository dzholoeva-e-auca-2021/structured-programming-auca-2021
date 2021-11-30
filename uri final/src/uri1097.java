import java.util.Scanner;

public class uri1097 {
        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);

            int n = 7;
            for (int I = 1; I<10; I+=2) {

                for ( int J = n; J >=n-2; J--) {
                    System.out.println("I=" + I + " J=" + J);
                }
                n+=2;
            }

        }

    }

