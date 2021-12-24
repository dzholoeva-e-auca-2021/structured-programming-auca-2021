public class uri1156 {
    public static void main(String[] args) {
        double sum = 0;
        int count = 1;
        for(int i = 1; i <= 39; i+=2) {
             double s = (double)i/(double)count ;
             sum += s;
            count *=2;
            }
            System.out.printf("%.2f%n", sum);
        }
    }
