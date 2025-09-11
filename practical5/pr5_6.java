import java.util.Scanner;

class NumberChecker {

    // Overloaded method for integer array
    void check(int[] arr, int d) {
        int count = 0;
        for (int num : arr) {
            if (num == d) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println(d + " is present " + count + " times in integer array.");
        } else {
            System.out.println(d + " is not present in integer array.");
        }
    }

    // Overloaded method for float array
    void check(float[] arr, float d) {
        int count = 0;
        for (float num : arr) {
            if (num == d) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println(d + " is present " + count + " times in float array.");
        } else {
            System.out.println(d + " is not present in float array.");
        }
    }
}

public class pr5_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberChecker nc = new NumberChecker();

        System.out.println("Choose Array Type:");
        System.out.println("1. Integer Array");
        System.out.println("2. Float Array");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter number to search: ");
            int d = sc.nextInt();

            nc.check(arr, d);
        } 
        else if (choice == 2) {
            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();
            float[] arr = new float[n];

            System.out.println("Enter " + n + " floating-point numbers:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextFloat();
            }

            System.out.print("Enter number to search: ");
            float d = sc.nextFloat();

            nc.check(arr, d);
        } 
        else {
            System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}