import java.util.Scanner;

// Exam class
class Exam {
    String stu_name;
    int rollno;
    String sub_code, sub_name;
    int internalMarks, externalMarks, totalMarks;

    // Parameterized constructor (using this keyword to resolve variable hiding)
    Exam(String stu_name, int rollno, String sub_code, String sub_name, int internalMarks, int externalMarks) {
        this.stu_name = stu_name;
        this.rollno = rollno;
        this.sub_code = sub_code;
        this.sub_name = sub_name;
        this.internalMarks = internalMarks;
        this.externalMarks = externalMarks;
    }

    // Method to calculate total marks
    void Calculate_result() {
        totalMarks = internalMarks + externalMarks;
    }

    // Method to show result
    void Show_result() {
        System.out.println("----- Student Result -----");
        System.out.println("Name: " + stu_name);
        System.out.println("Roll No: " + rollno);
        System.out.println("Subject Code: " + sub_code);
        System.out.println("Subject Name: " + sub_name);
        System.out.println("Internal Marks: " + internalMarks);
        System.out.println("External Marks: " + externalMarks);
        System.out.println("Total Marks: " + totalMarks);

        if (totalMarks >= 40) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
    }
}

// Main class
public class pr5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking student details
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Subject Code: ");
        String code = sc.nextLine();

        System.out.print("Enter Subject Name: ");
        String sub = sc.nextLine();

        System.out.print("Enter Internal Marks: ");
        int internal = sc.nextInt();

        System.out.print("Enter External Marks: ");
        int external = sc.nextInt();

        // Create Exam object using parameterized constructor
        Exam e1 = new Exam(name, roll, code, sub, internal, external);

        e1.Calculate_result();  // calculate total
        e1.Show_result();       // display result

        sc.close();
    }
}