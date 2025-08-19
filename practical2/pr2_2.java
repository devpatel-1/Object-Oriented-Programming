public class pr2_2 {
    public static void main(String[] args) {
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        
        double sum = num1 + num2;
        double diff = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        double modulo = num1 % num2;
        
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Modulo: " + modulo);
    }
    
}




// 1. Class Declaration

// public class pr2_2 {

//     •	Defines a class named pr2_2.
// 	•	File name must be pr2_2.java.





// 2.	Main Method

// public static void main(String[] args) {

//     •	Entry point of the program.
// 	•	Inputs are taken from args[].




// 3. Reading Input

// double num1 = Double.parseDouble(args[0]);
// double num2 = Double.parseDouble(args[1]);

// •	args[0] → first number, converted to double.
// •	args[1] → second number, converted to double.
// •	Double.parseDouble() is used because inputs are Strings by default.




// 4. Arithmetic Operations

// double sum = num1 + num2;        // addition
// double diff = num1 - num2;       // subtraction
// double product = num1 * num2;    // multiplication
// double quotient = num1 / num2;   // division
// double modulo = num1 % num2;     // remainder



// 5. Output


// System.out.println("Sum: " + sum);
// System.out.println("Difference: " + diff);
// System.out.println("Product: " + product);
// System.out.println("Quotient: " + quotient);
// System.out.println("Modulo: " + modulo);


// Prints all results one by one.