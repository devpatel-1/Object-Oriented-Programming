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





// public class pr2_8 {

//     Declares a public class named pr2_8.



// public static void main(String[] args) {

//     👉 Entry point of the program. args will hold command-line arguments.



        // // Check if user provided a number
        // if (args.length < 1) {
        //     System.out.println("Please provide a number to find its factors.");
        //     return;
        // }
    

    //     👉 First check: did the user provide an argument?
	// •	If not, it prints
    // Please provide a number to find its factors.
    // and stops (return;).


    // Convert input to integer
//     int num = Integer.parseInt(args[0]);

//     👉 Converts the first command-line argument into an integer num.
// 👉 Example:
// If you run

// java pr2_8 12
// then num = 12.





        // Check if number is positive
    //     if (num <= 0) {
    //         System.out.println("Please enter a positive integer greater than 0.");
    //         return;
    //     }


    //     👉 Ensures the input number is positive.
	// •	If user enters 0 or a negative number, it prints a message and exits.


//     System.out.println("Factors of " + num + " are:");
//     👉 Prints a header message.
// Example: 
//  Factors of 12 are:



        // // Find and print factors
        // for (int i = 1; i <= num; i++) {
        //     if (num % i == 0) {
        //         System.out.print(i + " ");
        //     }
        // }


//         A loop runs from 1 to num.
// 	•	For each i, it checks num % i == 0.
// 	•	If true, i is a factor of num.
// 	•	Prints all such factors on the same line.

// Example for num = 12:
// 	•	12 % 1 == 0 → print 1
// 	•	12 % 2 == 0 → print 2
// 	•	12 % 3 == 0 → print 3
// 	•	12 % 4 == 0 → print 4
// 	•	12 % 6 == 0 → print 6
// 	•	12 % 12 == 0 → print 12

// Output:

// Factors of 12 are:
// 1 2 3 4 6 12