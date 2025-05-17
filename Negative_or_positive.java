import java.util.Scanner;

public class Negative_or_positive{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Postive");
        }
    }
}