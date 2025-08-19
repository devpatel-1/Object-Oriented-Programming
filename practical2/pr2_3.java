public class pr2_3 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);

        String day = switch (a) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid input";
        };
        System.out.println(day);
    }
    
}




// 1.	public class pr2_3 {
// 	•	Declares a class named pr2_3.
// 	•	This must match your file name pr2_3.java.
// 	2.	public static void main(String[] args) {
// 	•	Entry point of the program.
// 	•	args is an array of Strings that stores command-line arguments.
// 	3.	int a = Integer.parseInt(args[0]);
// 	•	Takes the first command-line argument (args[0]) which is a string (e.g., "3").
// 	•	Converts it into an int using Integer.parseInt().
// 	•	Suppose you run:

//     java pr2_3 3


//     4.	String day = switch (a) { ... };
// 	•	Here begins a switch expression (new syntax).
// 	•	It checks the value of a and directly returns a String (no need for break).
// Inside switch:
// 	•	If a == 1 → returns "Monday"
// 	•	If a == 2 → returns "Tuesday"
// 	•	If a == 3 → returns "Wednesday"
// 	•	If a == 4 → returns "Thursday"
// 	•	If a == 5 → returns "Friday"
// 	•	If a == 6 → returns "Saturday"
// 	•	If a == 7 → returns "Sunday"
// 	•	Otherwise (default) → returns "Invalid input"
// ✅ Example: If a = 3, switch returns "Wednesday".
// That value is stored in the variable day.
// 	5.	System.out.println(day);
// 	•	Prints the value stored in day.
// 	•	For input 3, output will be:

//     Wednesday