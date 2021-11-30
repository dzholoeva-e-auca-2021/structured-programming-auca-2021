public class Problem07 {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

        while (number<14) {
            number++;
            sum += number;
            if (sum >= 189)
                break;
        }
        System.out.println("The number is " + number);
        System.out.println("The sum is " + sum);
    }
}
