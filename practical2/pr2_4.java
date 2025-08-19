public class pr2_4 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);

        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }
    
}




// 1.	public class pr2_4 {
// 	•	Declares a public class named pr2_4.
// 	•	File must be saved as pr2_4.java.
// 	2.	public static void main(String[] args) {
// 	•	Main method → starting point of execution.
// 	•	args array stores command-line arguments as Strings.
// 	3.	int num = Integer.parseInt(args[0]);
// 	•	Takes the first command-line argument (args[0]) which is a string.
// 	•	Converts it into an integer using Integer.parseInt().
// 	•	Example:

//     java pr2_4 7


//     → args[0] = "7"
//     → num = 7

// 	4.	if (num % 2 == 0) {
// 	•	% is the modulus operator (gives remainder).
// 	•	num % 2 == 0 checks if number is divisible by 2 (means even).
// 	•	If condition is true → execute inside this block.
// 	5.	System.out.println(num + " is even.");
// 	•	Runs if number is even.
// 	•	Example: for num = 8, output is: 

//     8 is even.


//     6.	} else {
//         •	If condition (num % 2 == 0) is false → program comes here.
//         •	That means number is odd.
//         7.	System.out.println(num + " is odd.");
//         •	Runs if number is odd.
//         •	Example: for num = 7, output is:

//         7 is odd.