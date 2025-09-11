import java.util.Scanner;

class BankInterest {

    // First form: amount and rate
    double findInterest(double amount, double rate) {
        return (amount * rate) / 100;
    }

    // Second form: amount, rate and time (years)
    double findInterest(double amount, double rate, int years) {
        return (amount * rate * years) / 100;
    }
}

public class pr5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankInterest bank = new BankInterest();

        System.out.println("Choose option:");
        System.out.println("1. Interest with Amount & Rate");
        System.out.println("2. Interest with Amount, Rate & Years");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter Amount: ");
            double amount = sc.nextDouble();
            System.out.print("Enter Rate of Interest: ");
            double rate = sc.nextDouble();

            double interest = bank.findInterest(amount, rate);
            System.out.println("Interest (amount & rate) = " + interest);
        } 
        else if (choice == 2) {
            System.out.print("Enter Amount: ");
            double amount = sc.nextDouble();
            System.out.print("Enter Rate of Interest: ");
            double rate = sc.nextDouble();
            System.out.print("Enter Number of Years: ");
            int years = sc.nextInt();

            double interest = bank.findInterest(amount, rate, years);
            System.out.println("Interest (amount, rate & years) = " + interest);
        } 
        else {
            System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}