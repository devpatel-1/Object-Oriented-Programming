public class pr1_10 {
    public static void main(String[] args) {
        
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        double discriminant = b * b - 4 * a * c;

        System.out.println("Given Equation: " + a + "x² + " + b + "x + " + c + " = 0");

        if (discriminant > 0) {
            // Two real and distinct roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots are real and distinct:");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } else if (discriminant == 0) {
            // One real root (repeated)
            double root = -b / (2 * a);
            System.out.println("Roots are real and equal:");
            System.out.println("Root = " + root);
        } else {
            // Complex roots
            double realPart = -b / (2 * a);
            double imagPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Roots are complex and imaginary:");
            System.out.println("Root 1 = " + realPart + " + " + imagPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imagPart + "i");
        }
    }
}





// Explanation:
// 	1.	Inputs:


//     double a = Double.parseDouble(args[0]);
//     double b = Double.parseDouble(args[1]);
//     double c = Double.parseDouble(args[2]);

// 	•	Takes 3 numbers (coefficients of quadratic equation).
// 	•	General quadratic equation:
//     ax^2 + bx + c = 0



// 2.	Discriminant:

// •	Formula:
// D = b^2 - 4ac
// 	•	Used to check type of roots:
// 	•	If D > 0 → 2 real and distinct roots
// 	•	If D = 0 → 1 real repeated root
// 	•	If D < 0 → 2 complex (imaginary) roots



// System.out.println("Given Equation: " + a + "x² + " + b + "x + " + c + " = 0");
// •	Shows the actual quadratic equation entered.



//  Case 1: Two Real & Distinct Roots
// if (discriminant > 0) {
//     double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
//     double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
// }

// •	Formula:
// x = \frac{-b \pm \sqrt{D}}{2a}
// 	•	Math.sqrt(discriminant) → square root of D.




// 🔹 Case 2: Real & Equal Roots

// else if (discriminant == 0) {
//     double root = -b / (2 * a);
// }

// •	Since √D = 0, both roots are same:
// x = \frac{-b}{2a}




// Case 3: Complex Roots

// else {
//     double realPart = -b / (2 * a);
//     double imagPart = Math.sqrt(-discriminant) / (2 * a);
// }

// •	If D < 0 → roots are complex.
// •	Formula:
// x = \frac{-b}{2a} \pm \frac{\sqrt{-D}}{2a}i
// •	realPart = real part of root.
// •	imagPart = imaginary part.
