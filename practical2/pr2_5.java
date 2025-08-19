public class pr2_5 {
    public static void main(String[] args) {

        int num = Integer.parseInt(args[0]);
        int sum = 0;
        
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        
        System.out.println("Sum of digits: " + sum);
        
    }
    
}





// 1.	public class pr2_5 {
// 	•	Declares a class named pr2_5.
// 	•	File name must be pr2_5.java.
// 	2.	public static void main(String[] args) {
// 	•	Entry point of program execution.
// 	3.	int num = Integer.parseInt(args[0]);
// 	•	Reads the first command-line argument (args[0]) as a string.
// 	•	Converts it to an integer.
// 	•	Example:

//     java pr2_5 1234



// 	4.	int sum = 0;
// 	•	Initializes sum to store the total of digits.
// 	•	At the start, sum = 0.

// 	5.	while (num != 0) {
// 	•	Loop runs until num becomes 0.
// 	•	Each loop extracts the last digit and adds it to sum.

// 	6.	int digit = num % 10;
// 	•	Finds the last digit of num.
// 	•	% 10 gives remainder when divided by 10.
// 	•	Example: 1234 % 10 = 4.

// 	7.	sum += digit;
// 	•	Adds the digit to sum.
// 	•	Example: sum = sum + digit.

// 	8.	num /= 10;
// 	•	Removes the last digit from num.
// 	•	Example: 1234 / 10 = 123.

// 	9.	} (end of while loop)
// 	•	Loop repeats until num becomes 0.
// 	10.	System.out.println("Sum of digits: " + sum);
// 	•	Prints the final sum of digits.





// 📝 Dry Run Example

// Input:  java pr2_5 1234


// Step-by-step:
// 	•	Start: num = 1234, sum = 0

// Loop Iterations:
// 	1.	digit = 1234 % 10 = 4 → sum = 0 + 4 = 4 → num = 123
// 	2.	digit = 123 % 10 = 3 → sum = 4 + 3 = 7 → num = 12
// 	3.	digit = 12 % 10 = 2 → sum = 7 + 2 = 9 → num = 1
// 	4.	digit = 1 % 10 = 1 → sum = 9 + 1 = 10 → num = 0

// Loop ends (num == 0).

// Output:

// Sum of digits: 10