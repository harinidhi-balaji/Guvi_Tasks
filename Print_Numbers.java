public class Print_Numbers {
    public static void main(String[] args) {
        System.out.println("Printing numbers using for loop: ");
        printUsingForLoop();
        System.out.println("Printing numbers using while loop: ");
        printUsingWhileLoop();
    }

    public static void printUsingForLoop() {
        for (int i = 10; i <= 50; i++) {
            System.out.println(i);
        }
    }

    public static void printUsingWhileLoop() {
        int n = 10;
        while (n <= 50) {
            System.out.println(n);
            n++;
        }
    }
}
