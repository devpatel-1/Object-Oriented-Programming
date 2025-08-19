import java.util.Scanner;    // 	•	Importing the Scanner class to take input from the user.

public class pr3_5 {     // Declaring a public class named pr3_5.
    public static void main(String[] args) {      //  The main method — program execution starts from here.
    
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a string: ");
            String str = sc.nextLine();

            str = str.toLowerCase();

            boolean isPalindrome = true;

            for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome) {
                System.out.println("The string is a palindrome.");
            } else {
                System.out.println("The string is not a palindrome.");
            }
        }
    }
}





// try (Scanner sc = new Scanner(System.in)) {

//     •	Creating a Scanner object sc to read input from the user.
// 	•	The try(...) ensures the scanner is closed automatically after use.



// System.out.print("Enter a string: ");
// String str = sc.nextLine();


// •	Asking the user to enter a string.
// •	Reading the full line (including spaces) and storing it in the variable str.




// str = str.toLowerCase();

// •	Converts the string to lowercase so that case (uppercase/lowercase) doesn’t affect the palindrome check.
// (Example: "Level" becomes "level").



// boolean isPalindrome = true;

// •	A flag variable isPalindrome is set to true initially.
// •	We will change it to false if we find the string is not a palindrome.



// for (int i = 0; i < str.length() / 2; i++) {

//     •	A for loop runs only till half of the string (str.length()/2).
// 	•	No need to check the whole string, because palindrome means symmetric.
// 	•	Example: in "madam", just compare m with m, a with a.




// if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
//     isPalindrome = false;
//     break;
// }

// •	str.charAt(i) → character from the front.
// •	str.charAt(str.length() - 1 - i) → character from the end.
// •	If both characters are not equal, then it’s not a palindrome:
// •	Set isPalindrome = false
// •	Use break; to exit the loop immediately (no need to check further).




// if (isPalindrome) {
//     System.out.println("The string is a palindrome.");
// } else {
//     System.out.println("The string is not a palindrome.");
// }


// •	If flag is still true, the string is palindrome.
// •	Otherwise, print not palindrome.