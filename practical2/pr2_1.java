// package practical2;

public class pr2_1 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        int max;

        if(num1>num2 && num1>num3){
            max = num1;
        }
        else if(num2>num1 && num2>num3){
            max = num2;
        }
        else{
            max = num3;
        }

        System.out.println("Max number is:"+max);
    }
    
}





// 2.	Class Declaration

// public class pr2_1 {

//     •	Defines a class named pr2_1.
// 	•	File must be saved as pr2_1.java.




// 3.	Main Method

// public static void main(String[] args) {

//     •	Entry point of the program.
// 	•	args stores command-line inputs.




// 4. Reading Inputs

// int num1 = Integer.parseInt(args[0]);
// int num2 = Integer.parseInt(args[1]);
// int num3 = Integer.parseInt(args[2]);


// •	args[0] → first number.
// •	args[1] → second number.
// •	args[2] → third number.
// •	Integer.parseInt() → converts String input → integer.

// 👉 Example: If user runs

// java pr2_1 25 40 10

// Then:
// 	•	num1 = 25
// 	•	num2 = 40
// 	•	num3 = 10



// 5.	Finding Maximum

// int max;

// if(num1>num2 && num1>num3){
//     max = num1;
// }
// else if(num2>num1 && num2>num3){
//     max = num2;
// }
// else{
//     max = num3;
// }

// •	Compares the three numbers:
// •	If num1 is greater than both → max = num1.
// •	Else if num2 is greater than both → max = num2.
// •	Otherwise → max = num3.

// 👉 Handles all possibilities.




// 6.	Output
// •	Prints the largest number.