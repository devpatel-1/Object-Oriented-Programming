
public class pr1_5 {
    public static void main(String[] args) {

        String rollNumber = args[0];
        String name = args[1];
        String course = args[2];
        String semester = args[3];

        // (a) Print all on a single line
        System.out.println("Single Line Output:");
        System.out.println("Roll Number: " + rollNumber + ", Name: " + name + ", Course: " + course + ", Semester: " + semester);

        // (b) Print each on a separate line
        System.out.println("\nSeparate Line Output:");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Semester: " + semester);
        
    }
}