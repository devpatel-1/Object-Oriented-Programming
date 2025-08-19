import java.util.Scanner;

public class pr3_8 {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a sentence: ");
            String sentence = sc.nextLine();

            String[] words = sentence.split(" ");

            System.out.println("Words in reverse order: ");
            for (int i = words.length - 1; i >= 0; i--) {
                System.out.print(words[i] + " ");
            }
            System.out.println();
        }

    }
}






// import java.util.Scanner;

// •	Imports the Scanner class from java.util package.
// •	Used to take input from the user.




// public class pr3_8 {
//     public static void main(String[] args) {

//         •	Declares a class named pr3_8.
//         •	Inside it, the main method starts program execution.



// try (Scanner sc = new Scanner(System.in)) {

//     •	Creates a Scanner object sc to take user input.
// 	•	try (...) is a try-with-resources block → it automatically closes the Scanner when done.





// System.out.print("Enter a sentence: ");
// String sentence = sc.nextLine();

// •	Prints a message asking the user to enter a sentence.
// •	sc.nextLine() reads the whole sentence (including spaces) as a string.
// •	Stores it in variable sentence.



// String[] words = sentence.split(" ");

// •	Splits the sentence into words using space " " as a delimiter.
// •	Stores each word in an array words.
// •	Example: "I love Java" → ["I", "love", "Java"].



// System.out.println("Words in reverse order: ");

// •	Prints a heading before showing the reversed words.




// for (int i = words.length - 1; i >= 0; i--) {
//     System.out.print(words[i] + " ");
// }

// •	A for loop starts from the last word (words.length - 1) and goes backward (i--).
// •	Prints each word followed by a space.
// •	Example: If words = ["I", "love", "Java"], output will be:
// "Java love I ".




// System.out.println();


// •	Just moves the cursor to the next line after printing reversed words.