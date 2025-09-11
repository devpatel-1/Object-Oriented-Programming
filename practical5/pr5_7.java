import java.util.Scanner;

class Box {
    double length, width, height;  // instance variables

    // Constructor to initialize values from user
    Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    // Method to calculate volume
    double calculateVolume() {
        return length * width * height;
    }
}

public class pr5_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of the box: ");
        double l = sc.nextDouble();
        System.out.print("Enter width of the box: ");
        double w = sc.nextDouble();
        System.out.print("Enter height of the box: ");
        double h = sc.nextDouble();

        // Create object and calculate volume
        Box box = new Box(l, w, h);
        double volume = box.calculateVolume();

        System.out.println("Volume of the box = " + volume);

        sc.close();
    }
}