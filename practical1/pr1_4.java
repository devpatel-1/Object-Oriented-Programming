
public class pr1_4 {
    public static void main(String[] args) {

        // speed calculation
        double distance = Double.parseDouble(args[0]);
        double time = Double.parseDouble(args[1]);
        double speed = distance / time;
        System.out.println("The speed is " + speed + " units per time unit.");

        // Simple interest calculation
        double principle = Double.parseDouble(args[2]);
        double rate = Double.parseDouble(args[3]);
        double timePeriod = Double.parseDouble(args[4]);
        double interest = (principle * rate * timePeriod) / 100;
        System.out.println("The interest is " + interest + " ruppees.");

        // Volume of Cylinder
        double radius = Double.parseDouble(args[5]);
        double height = Double.parseDouble(args[6]);
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of Cylinder = " + volume + " cubic cm");
    }
}


// Line-by-Line Explanation:
	// 1.	public class pr1_4 {
    //     •	Defines a class named pr1_4. File name must be pr1_4.java.
    //     2.	public static void main(String[] args) {
    //     •	Main method → Program starts here.
    //     •	args → This is an array of Strings that stores command line inputs.
    //     •	Example: if we run →



// Part - 1 : Speed Calculation
// 	•	Double.parseDouble(args[0]) → Converts first input (string) into a number for distance.
// 	•	Double.parseDouble(args[1]) → Converts second input into a number for time.
// 	•	speed = distance / time → Formula for speed.
// 	•	Prints → The speed is …

// ✅ Example: distance = 100, time = 2 → speed = 50.



// Part - 2 : Simple Interest Calculation
// Takes 3 more input: principle, rate, timePeriod.
// apply formula: interest = (P × R × T) / 100
// •	Prints the result.
// ✅ Example: P=5000, R=10, T=2 → Interest = (5000×10×2)/100 = 1000.


// Part - 3 : Volume of Cylinder
// •	Takes radius and height as input.
// •	Formula for cylinder volume: V = π × r² × h
// •	Math.PI → built-in constant for π (3.14159…).
// •	Prints volume.

// ✅ Example: r=7, h=10 → V = 3.14159×7²×10 ≈ 1539.38.


