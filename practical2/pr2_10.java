public class pr2_10 {
    public static void main(String[] args) {
        
        int i = 25;
        float f = i;
        double d = f;

        System.out.println("Widening Typecastig:");
        System.out.println("int i = " + i);
        System.out.println("float f = " + f);
        System.out.println("double d = " + d);

        double d2 = 89.76;
        float f2 = (float) d2;
        int i2 = (int) f2;

        System.out.println("\nNarrowing Typecasting:");
        System.out.println("double d2 = " + d2);
        System.out.println("float f2 = (float d2) " + f2);
        System.out.println("int i2 = (int) f2 " + i2);

    }
}






// int i = 25;
// float f = i;
// double d = f;


// 1.	int i = 25;
// → Variable i is declared as integer and initialized with value 25.
// 	2.	float f = i;
// → Implicit conversion happens (Widening Conversion).
// → int → float.
// → So, f = 25.0.
// 	3.	double d = f;
// → Again, implicit widening.
// → float → double.
// → So, d = 25.0.

// 👉 These are automatic conversions because there is no loss of data.





// double d2 = 89.76;
// float f2 = (float) d2;
// int i2 = (int) f2;



// 4.	double d2 = 89.76;
// → Variable d2 of type double initialized with 89.76.
// 	5.	float f2 = (float) d2;
// → Explicit conversion (Narrowing Conversion).
// → double → float.
// → Still value fits, so f2 = 89.76.
// 	6.	int i2 = (int) f2;
// → Explicit conversion from float → int.
// → Decimal part gets truncated.
// → So, i2 = 89.

// ⸻

// Output:
// Widening Typecastig:
// int i = 25
// float f = 25.0
// double d = 25.0

// Narrowing Typecasting:
// double d2 = 89.76
// float f2 = (float d2) 89.76
// int i2 = (int) f2 89



// ⸻

// ✅ Summary:
// 	•	Widening (Automatic) → small → big type (int → float → double).
// 	•	Narrowing (Manual) → big → small type (double → float → int).
// 	•	Narrowing may cause loss of data (e.g., decimal part removed).

// ⸻
