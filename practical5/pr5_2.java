import java.util.Scanner;

// Equation class
class Equation {
    int a, b, c;

    // Method to set values
    void Get_info(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    // Case 1: Real roots
    void Real(double delta) {
        double r1 = (-b + Math.sqrt(delta)) / (2 * a);
        double r2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("Roots are Real and Different:");
        System.out.println("Root 1 = " + r1);
        System.out.println("Root 2 = " + r2);
    }

    // Case 2: Equal roots
    void Equal_values() {
        double r = -b / (2.0 * a);
        System.out.println("Roots are Real and Equal:");
        System.out.println("Root = " + r);
    }

    // Case 3: Imaginary roots
    void Imaginary(double delta) {
        double real = -b / (2.0 * a);
        double imag = Math.sqrt(-delta) / (2 * a);
        System.out.println("Roots are Imaginary:");
        System.out.println("Root 1 = " + real + " + " + imag + "i");
        System.out.println("Root 2 = " + real + " - " + imag + "i");
    }
}

// Main class
public class pr5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter coefficient a: ");
        int a = sc.nextInt();

        System.out.print("Enter coefficient b: ");
        int b = sc.nextInt();

        System.out.print("Enter coefficient c: ");
        int c = sc.nextInt();

        // Creating object of Equation class
        Equation eq = new Equation();
        eq.Get_info(a, b, c);

        // Calculate discriminant
        double delta = (b * b) - (4 * a * c);

        // Decide case
        if (delta > 0) {
            eq.Real(delta);
        } else if (delta == 0) {
            eq.Equal_values();
        } else {
            eq.Imaginary(delta);
        }

        sc.close();
    }
}