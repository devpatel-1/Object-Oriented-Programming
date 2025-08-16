public class pr2_12 {
    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("Please provide a number n.");
        }

        int n = Integer.parseInt(args[0]);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(); //move to next line 
        }

    }
}
