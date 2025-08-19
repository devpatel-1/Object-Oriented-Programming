
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



// 1.	public class pr1_5 {
// 	•	Declares a class named pr1_5 (file name must be pr1_5.java).
// 	2.	public static void main(String[] args) {
// 	•	Program execution starts here.
// 	•	args stores command-line inputs.



// •	args[0] → First input → Roll Number
// •	args[1] → Second input → Name
// •	args[2] → Third input → Course
// •	args[3] → Fourth input → Semester
// •	All stored as String (text).



// Printing in one line :- 
// System.out.println("Single Line Output:");
// System.out.println("Roll Number: " + rollNumber + ", Name: " + name + ", Course: " + course + ", Semester: " + semester);

// •	Prints all details in a single sentence.
// •	+ is used for string concatenation (joining text).



//  Part (b): Printing in separate lines
// System.out.println("\nSeparate Line Output:");
// System.out.println("Roll Number: " + rollNumber);
// System.out.println("Name: " + name);
// System.out.println("Course: " + course);
// System.out.println("Semester: " + semester);

// 