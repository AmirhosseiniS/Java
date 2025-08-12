import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numberOfMinutes = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.println("Number of minutes:");
            if (scanner.hasNextDouble()) {
                numberOfMinutes = scanner.nextDouble();
                isValid = true;}
            else {
                System.out.println("Wrong input. Number of minutes:");
                scanner.next();}}

        System.out.println("Number of seconds:" + (numberOfMinutes*60));
        scanner.close();
    }}
