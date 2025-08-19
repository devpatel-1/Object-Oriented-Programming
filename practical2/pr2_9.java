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





// public class pr2_9 {
//     public static void main(String[] args) {


//         👉 Class name is pr2_9. Program starts at main.




// if (args.length < 1) {
//     System.out.println("Please provide 4 numbers.");
// }

// 👉 Checks if arguments are provided.





// double a = Double.parseDouble(args[0]);
// double b = Double.parseDouble(args[1]);
// double c = Double.parseDouble(args[2]);
// double d = Double.parseDouble(args[3]);


// 👉 Reads 4 numbers from command-line and stores them in a, b, c, d.
// 👉 They are double so they can handle decimals too.




// double max;
// double min = 0;

// 👉 Declares max and min.





// if (a > b) {
//     if (a > c) {
//         if (a > d)
//             max = a;
//         else 
//             max = d;
//     } else {
//         if (c > d)
//             max = c;
//         else 
//             max = d;
//     }
// } else {
//     if (b > c) {
//         if (b > d)
//             max = b;
//         else 
//             max = d;
//     } else {
//         if (c > d) 
//             max = c;
//         else 
//             max = d;
//     }
// }

// 👉 This basically checks step by step which number is the largest among a, b, c, d and assigns it to max.




// if (a < b) {
//     if (a < c) {
//         if (a < d)
//             min = a;
//         else 
//             min = d;
//     } else {
//         if (c < d)
//             min = c;
//         else 
//             min = d;
//     }
// } else {
//     if (b < c) {
//         if (b < d)
//             min = b;
//         else
//             min = d;
//     }
// }

// 👉 Same idea but reversed: finds the minimum among the 4 numbers and assigns it to min.




// Example run :-  java pr2_9 12 4 27 8

// Step:
// 	•	a = 12, b = 4, c = 27, d = 8
// 	•	Maximum = 27
// 	•	Minimum = 4

// Output:  
// Maximum = 27.0
// Minimum = 4.0