public class P7 {
    public static void main(String[] args) {
        int sum = 0;
        for (int number = 2; number < 1000; number++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += number;
            }
        }
        System.out.println("The sum of all prime numbers between 0 and 1000 is:" + sum);
    }
}
