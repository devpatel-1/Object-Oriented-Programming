import java.util.Scanner;

/**
 * Abstract class Shape defining a contract for any shape that has an area.
 * It contains an abstract method area() which must be implemented by subclasses.
 */
abstract class Shape {
    /**
     * Abstract method to calculate the area of a shape.
     * Subclasses must provide their own implementation for this method.
     *
     * @return the area of the shape as a double.
     */
    abstract double area();
}

/**
 * Triangle class extending Shape.
 * It calculates the area of a triangle.
 */
class Triangle extends Shape {
    private double base;
    private double height;

    /**
     * Constructor for Triangle.
     * @param base The base of the triangle.
     * @param height The height of the triangle.
     */
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    /**
     * Overrides the area() method to calculate the area of the triangle.
     * Formula: 0.5 * base * height
     *
     * @return the calculated area of the triangle.
     */
    @Override
    double area() {
        return 0.5 * base * height;
    }
}

/**
 * Rectangle class extending Shape.
 * It calculates the area of a rectangle.
 */
class Rectangle extends Shape {
    private double length;
    private double width;

    /**
     * Constructor for Rectangle.
     * @param length The length of the rectangle.
     * @param width The width of the rectangle.
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Overrides the area() method to calculate the area of the rectangle.
     * Formula: length * width
     *
     * @return the calculated area of the rectangle.
     */
    @Override
    double area() {
        return length * width;
    }
}

/**
 * Circle class extending Shape.
 * It calculates the area of a circle.
 */
class Circle extends Shape {
    private double radius;

    /**
     * Constructor for Circle.
     * @param radius The radius of the circle.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Overrides the area() method to calculate the area of the circle.
     * Formula: PI * radius * radius
     *
     * @return the calculated area of the circle.
     */
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

/**
 * Main class to demonstrate the Shape hierarchy and polymorphism.
 */
public class newpr5_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculate Area of Different Shapes");
        System.out.println("------------------------------------");

        // --- Get Triangle dimensions from user ---
        System.out.println("\nFor the Triangle:");
        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height: ");
        double height = scanner.nextDouble();
        Shape triangle = new Triangle(base, height);

        // --- Get Rectangle dimensions from user ---
        System.out.println("\nFor the Rectangle:");
        System.out.print("Enter the length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width: ");
        double width = scanner.nextDouble();
        Shape rectangle = new Rectangle(length, width);

        // --- Get Circle dimension from user ---
        System.out.println("\nFor the Circle:");
        System.out.print("Enter the radius: ");
        double radius = scanner.nextDouble();
        Shape circle = new Circle(radius);
        
        System.out.println("\n--- Calculated Areas ---");
        // Calculate and print the area of the Triangle
        System.out.printf("Area of Triangle: %.2f\n", triangle.area());

        // Calculate and print the area of the Rectangle
        System.out.printf("Area of Rectangle: %.2f\n", rectangle.area());

        // Calculate and print the area of the Circle
        System.out.printf("Area of Circle: %.2f\n", circle.area());
        
        scanner.close();
    }
}




// 🔹 1. Abstract Class
// 	•	An abstract class is like a blueprint for other classes.
// 	•	It cannot be used to make objects directly.
// 	•	It can contain abstract methods (without body) and normal methods (with body).
// 	•	Other classes must extend (inherit from) the abstract class and provide implementation.

// 👉 Example:

// abstract class Shape {
//     abstract double area();  // abstract method (no body)
// }


// Here:
// 	•	abstract class Shape → blueprint class.
// 	•	abstract double area(); → this method has no body. It just says “every shape must have an area() method”, but doesn’t tell how to calculate it.

// ⸻

// 🔹 2. Abstract Method
// 	•	An abstract method is a method without body (no {}).
// 	•	Subclasses must override it and give their own body.

// 👉 Example:

// abstract double area(); // only declaration

// In Triangle, we must give its body:

// @Override
// double area() {
//     return 0.5 * base * height;
// }


// 🔹 3. extends keyword
// 	•	extends means inheritance in Java.
// 	•	When one class inherits another, it gets all the features of the parent class.
// 	•	Example:

//     class Triangle extends Shape { ... }


//     Here Triangle is a child class, and it inherits from Shape.
//     That means Triangle must implement the area() method because Shape defined it as abstract.
    
//     ⸻
    
//     🔹 4. @Override Annotation
//         •	@Override is used when a subclass provides its own version of a method that already exists in the parent class.
//         •	It tells the compiler:
//         •	“This method is overriding a parent’s method.”
//         •	If you make a mistake (like wrong spelling or wrong parameters), the compiler will show an error.
    
//     👉 Example:

// @Override
// double area() {
//     return length * width;
// }


// This means we are overriding the area() method from Shape.

// ⸻

// 🔹 5. Polymorphism
// 	•	In main(), we did:

//     Shape t = new Triangle(10, 5);


//     Here:
// 	•	The reference type is Shape (parent class).
// 	•	The object type is Triangle (child class).
// 	•	When we call t.area(), Java automatically decides which version of area() to run → this is called runtime polymorphism.

// ⸻

// 🔹 6. Math.PI
// 	•	Math.PI is a constant value of π (3.14159…).
// 	•	Used in Circle’s area formula: π * r * r.

// ⸻

// 🔹 7. Main method

// public static void main(String[] args) {
//     // program starts here
// }


// •	public → accessible everywhere.
// •	static → no need to create object of Main to run it.
// •	void → no return value.
// •	String[] args → used for command-line arguments.

// ⸻
