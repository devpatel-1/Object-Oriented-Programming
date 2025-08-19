public class pr2_6 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        
        int sum = 0;
        for(int i=1;i<num;i++){
            if(num % i == 0){
                sum += i;
            }
        }

        if( sum == num){
            System.out.println(num + " is a perfect number.");
        }
        else{
            System.out.println(num + " is not a perfect number.");
        }
    }
    
}




// 1.	int num = Integer.parseInt(args[0]);
// •	Takes the first command-line argument and converts it to an integer.
// •	Example: if you run

// java pr2_6 6



// then num = 6.

// 	2.	int sum = 0;
// 	•	Initializes a variable sum to store the total of divisors.
// 	3.	for(int i=1;i<num;i++){ ... }
// 	•	Loops from i = 1 up to num-1.
// 	•	Because proper divisors of a number are always less than the number itself.
// 	4.	if(num % i == 0){ sum += i; }
// 	•	Checks if i divides num evenly (remainder 0).
// 	•	If yes, i is a divisor → add it to sum.
// 	5.	After loop ends → check if(sum == num)
// 	•	If the sum of divisors equals the number itself → it’s a perfect number.
// 	•	Otherwise → not a perfect number.

// ⸻

// 📝 Dry Run Example

// Input:  java pr2_6 6

// •	num = 6
// •	Loop:


// After loop: sum = 6

// 👉 sum == num → prints:

// 6 is a perfect number.


// if Input = java pr2_6 8


// •	Divisors = 1, 2, 4 → sum = 7
// •	sum != num → prints:


// 8 is not a perfect number.


