public class pr2_12 {
    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("Please provide a number n.");
        }

        int n = Integer.parseInt(args[0]);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(); //move to next line 
        }

    }
}






// 1.	Input Handling

// if (args.length < 1) {
//     System.out.println("Please provide a number n.");
// }
// int n = Integer.parseInt(args[0]);


// •	Takes command-line argument n.
// •	Example: if you run

// java pr2_12 5


// → then n = 5.

// ⸻




// 	2.	Outer Loop

// for (int i = 1; i <= n; i++) {

//     •	Controls rows.
// 	•	Runs from 1 to n.




//     3.	Inner Loop

//     for (int j = 1; j <= i; j++) {
//         System.out.print(j);
//     }



//     •	Prints numbers from 1 to i.
// 	•	Each row has numbers increasing till current row index. 




//     4.	Line Break

//     System.out.println(); 



//     •	Moves to next line after printing each row.

//     ⸻
    
//     Output Example
    
//     If n = 5, then:

// 1
// 12
// 123
// 1234
// 12345