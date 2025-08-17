public class P10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int k = 1; k <= 3 - i; k++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = 2; i >= 1; i--) {
            for (int k = 1; k <= 3 - i; k++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}