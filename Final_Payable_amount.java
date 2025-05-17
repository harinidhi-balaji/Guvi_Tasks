import java.util.Scanner;

public class Final_Payable_amount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the purchase amount: ");
        double amount = sc.nextDouble();
        double discount = 0;

        if (amount >= 500 && amount <= 1000) {
            discount = amount * 0.10;
        } else if (amount > 1000) {
            discount = amount * 0.20;
        }

        double finalAmount = amount - discount;

        System.out.println("Discount applied: " + discount);
        System.out.println("Final payable amount: " + finalAmount);
    }
}
