public class pr2_8 {
    public static void main(String[] args) {
        // Check if user provided a number
        if (args.length < 1) {
            System.out.println("Please provide a number to find its factors.");
            return;
        }

        // Convert input to integer
        int num = Integer.parseInt(args[0]);

        // Check if number is positive
        if (num <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
            return;
        }

        System.out.println("Factors of " + num + " are:");

        // Find and print factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}