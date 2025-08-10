import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        InputReader inputReader = new InputReader();
        double p = inputReader.getNumber("Add a number");
        double q = inputReader.getNumber("Add another number");
        System.out.println("The Sum:"+ (p + q));
    }
}

class InputReader{
    public final Scanner scanner;

    public InputReader() {
        this.scanner = new Scanner(System.in);
    }

    public double getNumber(String message) {
        double number = 0 ;
        Boolean R = false;
        while (!R) {
            System.out.println(message);
            if (scanner.hasNextDouble()) {
                number = scanner.nextDouble();
                R = true;}
            else {
                System.out.println("Wrong input. Add a number:");
                scanner.next();
            }}
        return number;}
}

