import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int birth = (365*24*60*60)/7 ;
        int death = (365*24*60*60)/13 ;
        int immigrant = (365*24*60*60)/45 ;
        int a = 312032486 + birth - death + immigrant ;
        int b = a + birth - death + immigrant ;
        int  c = b + birth - death + immigrant ;
        int  d = c + birth - death + immigrant ;
        int  e = d + birth - death + immigrant ;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
