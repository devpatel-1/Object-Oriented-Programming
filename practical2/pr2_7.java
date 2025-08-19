public class pr2_7 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide the number of terms (n).");
            return;
        }

        int n = Integer.parseInt(args[0]);
        double harmonic = 0.0;

        System.out.println("Harmonic Series for " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            harmonic += 1.0 / i;
            System.out.printf("1/%d ", i);
            if (i < n) {
                System.out.print("+ ");
            }
        }
        System.out.println("\nSum of harmonic series = " + harmonic);
    }
}




// public class pr2_7 {

//     👉 Declares a public class named pr2_7.



// public static void main(String[] args) {

//     👉 Main method, program execution starts here.
//    👉 args will hold command-line arguments.



// if (args.length < 1) {
//     System.out.println("Please provide the number of terms (n).");
// }

// 👉 Checks if the user has provided at least 1 argument.
// 	•	If no argument is given, args.length will be 0, and it prints:



// int n = Integer.parseInt(args[0]);

// 👉 Converts the first command-line argument into an integer n.
// 👉 Example: if you run

// java pr2_7 5

// then n = 5.



// double harmonic = 0.0;

// 👉 Initializes a variable to store the sum of harmonic series.
// 👉 Example: harmonic = 0.0 initially.


// System.out.println("Harmonic Series for " + n + " terms:");
// 👉 Prints message like:
// Harmonic Series for 5 terms:





// for (int i = 1; i <= n; i++) {
//     harmonic += 1.0 / i;
//     System.out.printf("1/%d ", i);
//     if (i < n) {
//         System.out.print("+ ");
//     }
// }


// 👉 A for loop runs from i = 1 to n.
// 	•	In each iteration:
// 	•	harmonic += 1.0 / i; → Adds 1/i to the sum.
// 	•	System.out.printf("1/%d ", i); → Prints the term in series (1/1 1/2 ...).
// 	•	If i < n, it prints a "+" symbol to make it look like a proper series.

// 👉 Example output for n=5:
// 1/1 + 1/2 + 1/3 + 1/4 + 1/5 



// System.out.println("\nSum of harmonic series = " + harmonic);

// 👉 After loop ends, prints the total sum of harmonic series.
// 👉 Example for n=5:

// Sum of harmonic series = 2.283333333333333