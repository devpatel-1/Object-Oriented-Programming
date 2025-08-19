
public class pr1_9 {
    public static void main (String[] args) {
        
        String name = args[0];
        int age = Integer.parseInt(args[1]);

        System.out.println("Hello, " + name + "! You are " + age + " years old.");

    }
}





// 1.	public class pr1_9 {
// 	•	Defines the class pr1_9.
// 	•	File name should be pr1_9.java.
// 	2.	public static void main (String[] args) {
// 	•	Main method → program starts here.
// 	•	args → holds the command-line inputs.



// String name = args[0];

// •	Takes the first input from the command line.
// •	Stores it as a String in variable name.




// int age = Integer.parseInt(args[1]);

// •	Takes the second input.
// •	Converts it from String → integer using Integer.parseInt().
// •	Stores it in variable age.

// 👉 Example: If user enters Dev 20, then
// •	name = "Dev"
// •	age = 20



// System.out.println("Hello, " + name + "! You are " + age + " years old.");

// •	Prints a greeting message using the inputs.
// •	+ joins text with variables.



// Example output :- 
// Hello, Dev! You are 20 years old.