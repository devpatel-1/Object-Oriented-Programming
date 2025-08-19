import java.util.Scanner;   // 👉 Imports the Scanner class for taking input from the user.

public class pr3_3 {      // Declares the class pr3_3.
    public static void main(String[] args) {      //  Program execution starts here.

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter the size of array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int largest = arr[0];
            int secondLargest;

            for (int i = 1; i < n; i++) {
                if (arr[i] > largest) {
                    largest = arr[i];
                }
            }

            secondLargest = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                if (arr[i] > secondLargest && arr[i] < largest) {
                    secondLargest = arr[i];
                }
            }

            System.out.println("Second largest: " + secondLargest); 
        }
}
}





// try (Scanner sc = new Scanner(System.in)) {

//     👉 Creates a Scanner object sc inside a try-with-resources block so it closes automatically after use.



// System.out.println("Enter the size of array: ");
// int n = sc.nextInt();
// int[] arr = new int[n];

// 👉 Asks the user to enter the size of the array (n).
// 👉 Creates an integer array arr of size n.



// System.out.println("Enter the elements of the array: ");
// for (int i = 0; i < n; i++) {
//     arr[i] = sc.nextInt();
// }

// 👉 Takes input for all elements of the array using a for loop.
// 👉 Each number entered by the user is stored in arr[i].



// int largest = arr[0];
// int secondLargest;

// 👉 Initializes largest as the first element of the array.
// 👉 Declares secondLargest (will store the second biggest number).



// for (int i = 1; i < n; i++) {
//     if (arr[i] > largest) {
//         largest = arr[i];
//     }
// }

// 👉 First loop finds the largest element in the array.
// 	•	Starts from index 1 (since arr[0] is already in largest).
// 	•	If any element arr[i] is greater than largest, update largest.
// 👉 At the end, largest contains the maximum number



// secondLargest = Integer.MIN_VALUE;

// 👉 Sets secondLargest initially to the smallest possible integer (-2,147,483,648).
// 👉 This ensures that even if the array contains all negative numbers, the logic will still work.



// for (int i = 0; i < n; i++) {
//     if (arr[i] > secondLargest && arr[i] < largest) {
//         secondLargest = arr[i];
//     }
// }

// 👉 Second loop finds the second largest element.
// 	•	Condition arr[i] < largest ensures we skip the largest number.
// 	•	Condition arr[i] > secondLargest ensures we update only when a new bigger candidate is found.
// 👉 After the loop, secondLargest will contain the second biggest value.

// ⸻



// System.out.println("Second largest: " + secondLargest); 

// 👉 Prints the final result.