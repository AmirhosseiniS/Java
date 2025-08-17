import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                if (i != n) {
                    sum += i;}
                if (i * i != n) {
                    sum += n / i;}}}
        if (sum == n) {
                        System.out.println(n + " is a perfect number.");
                    }
                    else {
                        System.out.println(n + " is not a perfect number.");
                    }
                    scanner.close();
                }}