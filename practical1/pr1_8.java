
public class pr1_8 {
    public static void main(String[] args) {
        
        double celsius = Double.parseDouble(args[0]);

        double fahrenheit = (celsius * 1.8) + 32;

        System.out.println("Temperature in Celsius: " + celsius);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

    }
}



//  	1.	public class pr1_8 {
	// •	Declares a class named pr1_8.
	// •	File name should be pr1_8.java.
	// 2.	public static void main(String[] args) {
	// •	Main method → program starts here.
	// •	args → stores command-line inputs.


//  •	args[0] → takes the first input (as text).
// 	•	Double.parseDouble(...) → converts it into a decimal number (double).
// 	•	Stores it in variable celsius.

// 👉 Example: If user enters 25, then celsius = 25.0.


// Formula = (C x 1.8) + 32



// System.out.println("Temperature in Celsius: " + celsius);
// System.out.println("Temperature in Fahrenheit: " + fahrenheit);

// •	Prints both Celsius and Fahrenheit values with proper labels.