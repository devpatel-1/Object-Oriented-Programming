import java.util.Scanner;   //  Imports the Scanner class for taking input from the user.

public class pr3_2{     // Declares the class pr3_2.

public static void main(String[] args) {    // Entry point of the program. Execution starts here.
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];

        System.out.println("Enter the elements for matrix 1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements for matrix 2: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nTranspose of matrix 1: ");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(matrix1[j][i] + " ");
            }
            System.out.println();
        }

        System.out.println("\nTranspose of matrix 2: ");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(matrix2[j][i] + " ");
            }
            System.out.println();
        }
    }
    
}
}






// try (Scanner sc = new Scanner(System.in)) {

//     👉 Creates a Scanner object sc for user input.
// 👉 It’s inside a try-with-resources block, so it will close automatically after use.




// System.out.println("Enter the number of rows: ");
// int rows = sc.nextInt();
// System.out.println("Enter the number of columns: ");
// int cols = sc.nextInt();


// 👉 Asks the user to input number of rows and columns for the matrices.
// 👉 Stores them in rows and cols.



// int[][] matrix1 = new int[rows][cols];
// int[][] matrix2 = new int[rows][cols];

// 👉 Declares two 2D arrays (matrix1 and matrix2) of size rows × cols to store user input.
// 👉 Example: If rows=2 and cols=3, these arrays look like a 2×3 grid.

// ⸻



// System.out.println("Enter the elements for matrix 1:");
// for (int i = 0; i < rows; i++) {
//     for (int j = 0; j < cols; j++) {
//         matrix1[i][j] = sc.nextInt();
//     }
// }

// 👉 Nested for loop takes input for matrix1.
// 	•	Outer loop → controls rows.
// 	•	Inner loop → controls columns.
// 👉 Each element is stored in matrix1[i][j].

// ⸻




// System.out.println("Enter the elements for matrix 2: ");
// for (int i = 0; i < rows; i++) {
//     for (int j = 0; j < cols; j++) {
//         matrix2[i][j] = sc.nextInt();
//     }
// }


// 👉 Same logic for matrix2.
// 👉 Reads rows × cols integers from the user.

// ⸻




// System.out.println("\nTranspose of matrix 1: ");
// for (int i = 0; i < cols; i++) {
//     for (int j = 0; j < rows; j++) {
//         System.out.print(matrix1[j][i] + " ");
//     }
//     System.out.println();
// }


// 👉 Prints transpose of matrix1.
// 👉 Notice carefully:
// 	•	Transpose means: row becomes column, column becomes row.
// 	•	Instead of printing matrix1[i][j], it prints matrix1[j][i].
// 👉 Outer loop runs through columns (i < cols).
// 👉 Inner loop runs through rows (j < rows).
// 👉 This effectively swaps indices.




// System.out.println("\nTranspose of matrix 2: ");
// for (int i = 0; i < cols; i++) {
//     for (int j = 0; j < rows; j++) {
//         System.out.print(matrix2[j][i] + " ");
//     }
//     System.out.println();
// }


// 👉 Same logic applied to matrix2.