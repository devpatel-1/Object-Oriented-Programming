
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




// 1.	Command-line Argument Input

// if (args.length < 1) {
//     System.out.println("Please provide a number n.");
//     return;
// }
// int n = Integer.parseInt(args[0]);


// •	If no number is provided, program asks for one.
// •	Else, converts first argument into integer → stored in n.

// ⸻




// 2.	(a) Using for loop

// for (int i = 2; i <= n; i++) {
//     boolean isPrime = true;
//     for (int j = 2; j <= Math.sqrt(i); j++) {
//         if (i % j == 0) {
//             isPrime = false;
//             break;
//         }
//     }
//     if (isPrime) {
//         System.out.print(i + " ");
//     }
// }

// •	Iterates from 2 to n.
// •	Checks divisibility from 2 to √i.
// •	If divisible → not prime.
// •	Else print the number.

// 👉 Efficient check using Math.sqrt(i) (instead of i-1).





// 3.	(b) Using while loop

// int i = 2;
// while (i <= n) {
//     boolean isPrime = true;
//     for (int j = 2; j <= Math.sqrt(i); j++) {
//         if (i % j == 0) {
//             isPrime = false;
//             break;
//         }
//     }
//     if (isPrime) {
//         System.out.print(i + " ");
//     }
//     i++;
// }


// •	Starts i=2.
// •	Continues while i <= n.
// •	Same prime check logic.
// •	Increments i each iteration.

// ⸻







// 4.	(c) Using do-while loop


// i = 2;
// if (n >= 2) {
//     do {
//         boolean isPrime = true;
//         for (int j = 2; j <= Math.sqrt(i); j++) {
//             if (i % j == 0) {
//                 isPrime = false;
//                 break;
//             }
//         }
//         if (isPrime) {
//             System.out.print(i + " ");
//         }
//         i++;
//     } while (i <= n);
// }


// •	Ensures at least one execution (because do-while).
// •	Works same as while, but condition checked at end.

// ⸻

// Example Run

// If we run:

// java pr2_11 20


// OUTPUT:

// Prime numbers using for loop: 
// 2 3 5 7 11 13 17 19 
// Prime numbers using while loop: 
// 2 3 5 7 11 13 17 19 
// Prime numbers using do-while loop: 
// 2 3 5 7 11 13 17 19