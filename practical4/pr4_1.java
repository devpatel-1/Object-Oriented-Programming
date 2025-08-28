
import java.util.Scanner;

// Student class
class Student {
    String name;
    int id;
    String course;

    // Method to set student details
    void setDetails(String n, int i, String c) {
        name = n;
        id = i;
        course = c;
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Course: " + course);
    }
}

// Main class to test Student class
public class pr4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume leftover newline

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        // Create Student object
        Student s1 = new Student();
        s1.setDetails(name, id, course);

        // Display details
        System.out.println("\nStudent Details:");
        s1.displayDetails();

        sc.close();
    }
}