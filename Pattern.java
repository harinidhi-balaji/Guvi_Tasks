public class Pattern {
    public static void main(String[] args) {
        int k = 5;

        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= k; j++) {
                if (j <= i) {
                    System.out.print((k - j + 1) + " ");
                } else {
                    System.out.print((k - i + 1) + " ");
                }
            }
            System.out.println();
        }
    }
}
