public class pr2_9 {
    public static void main(String[] args) {
        
        if (args.length < 1) {
            System.out.println("Please provide 4 numbers.");
        }

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double d = Double.parseDouble(args[3]);

        double max;
        double min = 0;

        
        if (a > b) {
            if (a > c) {
                if (a > d)
                    max = a;
                else 
                    max = d;
            } else {
                if (c > d)
                    max = c;
                else 
                    max = d;
            }
        } else {
            if (b > c) {
                if (b > d)
                    max = b;
                else 
                    max = d;
            } else {
                if (c > d) 
                    max = c;
                else 
                    max = d;
            }
        }

        
        if (a < b) {
            if (a < c) {
                if (a < d)
                    min = a;
                else 
                    min = d;
            } else {
                if (c < d)
                    min = c;
                else 
                    min = d;
            }
        } else {
            if (b < c) {
                if (b < d)
                    min = b;
                else
                    min = d;

            }
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);

    }
}