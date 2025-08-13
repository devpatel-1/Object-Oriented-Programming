
public class pr2_11 {
    public static void main(String[] args) {
        
        if (args.length < 1) {
            System.out.println("Please provide a number n.");
            return;
        }

        int n = Integer.parseInt(args[0]);

        // (a) Using for loop
        System.out.println("Prime numbers using for loop: ");
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }

        // (b) Using while loop
        System.out.println("\nPrime numbers using while loop: ");
        int i = 2;
        while (i <= n) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
            i++;
        }

        // (c) Using do-while loop
        System.out.println("\nPrime numbers using do-while loop: ");
        i = 2;
        if (n >= 2) {
            do {
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.print(i + " ");
                }
                i++;
            } while (i <= n);
        }
    }
}