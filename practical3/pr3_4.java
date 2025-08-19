import java.util.*;    // 👉 Imports the java.util package (mainly used here for Scanner).

public class pr3_4 {   // Defines the class pr3_4.

    public static void main(String[] args) {   // 👉 Program execution starts here.
        
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter size of first array: ");
            int n1 = sc.nextInt();
            int[] arr1 = new int[n1];
            System.out.println("Enter elements of first array: ");
            for (int i = 0; i < n1; i++) {
                arr1[i] = sc.nextInt();
            }

            
            System.out.print("Enter size of second array: ");
            int n2 = sc.nextInt();
            int[] arr2 = new int[n2];
            System.out.println("Enter elements of second array: ");
            for (int i = 0; i < n2; i++) {
                arr2[i] = sc.nextInt();
            }

            int[] merged = new int[n1 + n2];
            for (int i = 0; i < n1; i++) {
                merged[i] = arr1[i];  // manual copy for learning
            }
            for (int i = 0; i < n2; i++) {
                merged[n1 + i] = arr2[i];  // manual copy for learning
            }
    
            // Insertion sort
            for (int i = 1; i < merged.length; i++) {
                int key = merged[i];
                int j = i - 1;
    
                // Shift elements greater than key to the right
                while (j >= 0 && merged[j] > key) {
                    merged[j + 1] = merged[j];
                    j--;
                }
                merged[j + 1] = key;
            }
    
            // Display sorted merged array
            System.out.println("Merged array in ascending order:");
            for (int i = 0; i < merged.length; i++) {
                System.out.print(merged[i] + " ");
            }
            System.out.println();
    
        }

    }
}





// try (Scanner sc = new Scanner(System.in)) {

//     👉 Creates a Scanner object sc for user input, auto-closing with try-with-resources.



// System.out.println("Enter size of first array: ");
// int n1 = sc.nextInt();
// int[] arr1 = new int[n1];
// System.out.println("Enter elements of first array: ");
// for (int i = 0; i < n1; i++) {
//     arr1[i] = sc.nextInt();
// }


// 👉 Asks for size of first array (n1), then reads its elements into arr1.




// System.out.print("Enter size of second array: ");
// int n2 = sc.nextInt();
// int[] arr2 = new int[n2];
// System.out.println("Enter elements of second array: ");
// for (int i = 0; i < n2; i++) {
//     arr2[i] = sc.nextInt();
// }

// 👉 Same process for second array (arr2).




// int[] merged = new int[n1 + n2];

// 👉 Creates a new array merged whose size = sum of both array sizes.
// 👉 This will store all elements of both arrays.




// for (int i = 0; i < n1; i++) {
//     merged[i] = arr1[i];  // manual copy for learning
// }
// for (int i = 0; i < n2; i++) {
//     merged[n1 + i] = arr2[i];  // manual copy for learning
// }

// 👉 Copies all elements of arr1 and arr2 into merged.
// 	•	First loop puts arr1 elements in merged[0...n1-1].
// 	•	Second loop continues from merged[n1] and places all elements of arr2.

// ⸻




//             // Insertion sort
//             for (int i = 1; i < merged.length; i++) {
//                 int key = merged[i];
//                 int j = i - 1;
    
//                 // Shift elements greater than key to the right
//                 while (j >= 0 && merged[j] > key) {
//                     merged[j + 1] = merged[j];
//                     j--;
//                 }
//                 merged[j + 1] = key;
//             }


//             👉 Sorts the merged array in ascending order using Insertion Sort:
// 	•	Outer loop picks each element as key.
// 	•	Inner while loop shifts all larger elements one step right.
// 	•	Finally places key at the correct position.
// 👉 This ensures the array is sorted after each pass.

// ⸻





//             // Display sorted merged array
//             System.out.println("Merged array in ascending order:");
//             for (int i = 0; i < merged.length; i++) {
//                 System.out.print(merged[i] + " ");
//             }
//             System.out.println();

//             👉 Prints the merged + sorted array.