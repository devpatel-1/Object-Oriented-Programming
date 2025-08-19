import java.util.Scanner;    // 	•	Importing the Scanner class for user input.

public class pr3_6 {    // 	•	Declaring a class named pr3_6.
    
    public static void main(String[] args) {     // 	•	The main method, starting point of execution.
        
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a string: ");
            String str = sc.nextLine();

            str = str.toLowerCase();

            int vowels = 0, consonants = 0, digits = 0, specialChars = 0;

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if (ch >= 'a' && ch <= 'z') {
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowels++;
                    } else {
                        consonants++;
                    }
                } else if (ch >= '0' && ch <= '9') {
                    digits++;
                } else if (ch != ' ') {
                    specialChars++;
                }
            }

            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
            System.out.println("Digits: " + digits);
            System.out.println("Special Characters: " + specialChars);

        }

    }

}





// try (Scanner sc = new Scanner(System.in)) {

//     •	Creating a Scanner object sc for taking input.
// 	•	Using try-with-resources, so scanner will close automatically.




// System.out.print("Enter a string: ");
// String str = sc.nextLine();

// •	Asking the user to enter a string.
// •	nextLine() reads the entire line (including spaces).
// •	Example input: "Hello123!@".




// str = str.toLowerCase();


// •	Convert the string to lowercase so comparison becomes easy.
// •	"Hello123!@" → "hello123!@".
// •	(This way 'A' and 'a' are treated the same).



// int vowels = 0, consonants = 0, digits = 0, specialChars = 0;

// •	Declaring counters for different categories of characters:
// •	vowels → counts vowels (a, e, i, o, u)
// •	consonants → counts other letters
// •	digits → counts numbers (0–9)
// •	specialChars → counts symbols like !@#$, etc. (excluding space)



// for (int i = 0; i < str.length(); i++) {
//     char ch = str.charAt(i);

//     •	A loop that checks each character of the string.
// 	•	str.charAt(i) gives the ith character.




// if (ch >= 'a' && ch <= 'z') {

//     •	If the character is a letter (between 'a' and 'z').




// if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//     vowels++;
// } else {
//     consonants++;
// }



// •	If it is a vowel (a, e, i, o, u) → increase vowels.
// •	Otherwise → it’s a consonant, so increase consonants.




// } else if (ch >= '0' && ch <= '9') {
//     digits++;


//     •	If the character is between '0' and '9', it’s a digit → increase digits.



// } else if (ch != ' ') {
//     specialChars++;
// }


// If the character is not a letter and not a digit, but also not a space, then count it as a special character.
// 	•	Example: !, @, #, %, etc.




// System.out.println("Vowels: " + vowels);
// System.out.println("Consonants: " + consonants);
// System.out.println("Digits: " + digits);
// System.out.println("Special Characters: " + specialChars);


// Finally, printing the count of vowels, consonants, digits, and special characters.