
import java.util.Scanner;

class Shape {

    //Area of Rectangle
    double Area(double length, double breadth) {
        return length * breadth;
    }

    //Area of Triangle
    double Area(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }

    // Area of Sphere
    double Area(double radius) {
        return 4 * Math.PI * radius * radius;
    }

}


public class pr5_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape shape = new Shape();

        System.out.println("Choose Shape to find Area:");
        System.out.println("1. Rectangle");
        System.out.println("2. Triangle");
        System.out.println("3. Sphere");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter Length: ");
                double length = sc.nextDouble();
                System.out.print("Enter breadth: ");
                double breadth = sc.nextDouble();
                System.out.println("Area of Rectangle = " + shape.Area(length, breadth));
                break;

            case 2:
            System.out.print("Enter Base: ");
            double base = sc.nextDouble();
            System.out.print("Enter Height: ");
            double height = sc.nextDouble();
            System.out.println("Area of Triangle = " + shape.Area(base, height, true));
            break;

            case 3:
            System.out.print("Enter Radius: ");
            double radius = sc.nextDouble();
            System.out.println("Area of Sphere = " + shape.Area(radius));
            break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
