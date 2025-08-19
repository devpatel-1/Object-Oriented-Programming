
public class pr1_7 {
    public static void main (String[] args) {

        double base  = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[1]);
        double length = Double.parseDouble(args[2]);
        double breadth = Double.parseDouble(args[3]);

        double triangleArea = 0.5 * base * height;

        double rectanglePerimeter = 2 * (length + breadth);

        System.out.println("Area of Triangle = " + triangleArea + " square units");
        System.out.println("Perimeter of Rectangle = " + rectanglePerimeter + " units");

    } 
}




// 1.	public class pr1_7 {
// 	•	Defines the class named pr1_7 (file must be saved as pr1_7.java).
// 	2.	public static void main (String[] args) {
// 	•	Starting point of the program.
// 	•	args → command-line inputs (array of strings).



// •	args[0] → first input → base of triangle
// •	args[1] → second input → height of triangle
// •	args[2] → third input → length of rectangle
// •	args[3] → fourth input → breadth of rectangle
// •	Double.parseDouble(...) → converts text input into numbers (double type).



// Area of Triangle : 
// Formula = 0.5 * base * heightl


// Perimeter of Rectangle :
// Formula =  2 * (length + breadth);


//System.out.println("Area of Triangle = " + triangleArea + " square units");
// System.out.println("Perimeter of Rectangle = " + rectanglePerimeter + " units");

// 	•	Prints results with text.