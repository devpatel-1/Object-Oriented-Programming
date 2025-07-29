
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