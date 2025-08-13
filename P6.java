import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number:");
        int secondNumber = scanner.nextInt();
        for (int i = Math.min(firstNumber, secondNumber);
             i <= Math.max(firstNumber, secondNumber);
             i++){
            if (isPrime(i)){
                System.out.println(i);
            }
            scanner.close();}}

    public static boolean isPrime(int number) {
        if (number < 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }}