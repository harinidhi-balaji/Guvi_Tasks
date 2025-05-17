import java.util.Scanner;

public class Reverse_the_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rev = 0;

        while (n > 0) {
            int digit = n % 10;
            rev = digit;
            System.out.print(rev); // as per output given in task
            n = n / 10;
        }
    }
}
