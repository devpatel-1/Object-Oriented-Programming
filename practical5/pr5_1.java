// package practical5;

// 1. Create a class named Date having three instance variables named Day,
// Month and Year also has two set_date() to catch values of instance
// variables and get_date() to display caught values on the output screen.
// And create another class DateDemo containing main() method.


import java.util.Scanner;

// Date class
class Date {
    int day, month, year;

    // Method to set values
    void set_date(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }

    // Method to display values
    void get_date() {
        System.out.println("Date: " + day + "/" + month + "/" + year);
    }
}

public class pr5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter Day: ");
        int d = sc.nextInt();

        System.out.print("Enter Month: ");
        int m = sc.nextInt();

        System.out.print("Enter Year: ");
        int y = sc.nextInt();

        // Creating object of Date
        Date d1 = new Date();
        d1.set_date(d, m, y);  // setting values

        // Displaying date
        d1.get_date();

        sc.close();
    }
}
