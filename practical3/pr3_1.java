import java.util.Scanner;      //  This imports the Scanner class from the java.util package. Scanner allows us to take input from the user via keyboard.


public class pr3_1 {          // Defines a public class named pr3_1. In Java, all code must be inside a class.
public static void main(String[] args) {       // The entry point of the program. Java starts execution from the main() method

    try (Scanner sc = new Scanner(System.in)) {
        // Ask user how many numbers
        System.out.print("Enter how many numbers: ");     
        int n = sc.nextInt();

        double[] numbers = new double[n];
        double sum = 0;

        // Take input from user
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextDouble();
            sum += numbers[i];
        }

        // Calculate average
        double average = sum / n;

        // Display results
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
    // Scanner automatically closed here
}
}





// try (Scanner sc = new Scanner(System.in)) {

//     Creates a Scanner object named sc to read input from the console.
//     👉 It is inside a try-with-resources block, so the Scanner will automatically close after use (no need to call sc.close() manually).
    




        // Ask user how many numbers
//         System.out.print("Enter how many numbers: ");
//         int n = sc.nextInt();


//         Prompts the user: “Enter how many numbers:”.
// 👉 Reads an integer from user input and stores it in variable n.
// 👉 This n tells how many numbers the user wants to enter.





// double[] numbers = new double[n];
// double sum = 0;


// 👉 Creates an array of doubles with size n to store the numbers.
// 👉 Declares a variable sum initialized to 0, which will accumulate the total of all numbers.





//         // Take input from user
//         System.out.println("Enter " + n + " numbers:");
//         for (int i = 0; i < n; i++) {
//             numbers[i] = sc.nextDouble();
//             sum += numbers[i];
//         }



//         👉 Tells the user: “Enter n numbers:”.
// 👉 A for loop runs from i=0 to i<n-1:
// 	•	numbers[i] = sc.nextDouble(); → reads a decimal number from user and stores it in the array.
// 	•	sum += numbers[i]; → adds this number to sum.
// 👉 By the end of loop:
// 	•	All numbers are stored in the array.
// 	•	sum contains the total.





        // // Calculate average
        // double average = sum / n
        

        // 👉 Computes the average by dividing the sum of numbers by how many numbers (n) were entered.
        // 👉 Stores result in average.



                // // Display results
                // System.out.println("Sum = " + sum);
                // System.out.println("Average = " + average);


                // Prints the final sum and average to the console.