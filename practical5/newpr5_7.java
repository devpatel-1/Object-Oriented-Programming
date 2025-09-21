// First interface
interface Animal {
    void sound();  // abstract method
}

// Second interface
interface Bird {
    void fly();    // abstract method
}

// Class implementing both interfaces
class Bat implements Animal, Bird {
    @Override
    public void sound() {
        System.out.println("Bat makes screeching sound.");
    }

    @Override
    public void fly() {
        System.out.println("Bat can fly like a bird.");
    }
}

// Main class
public class newpr5_7 {
    public static void main(String[] args) {
        Bat b = new Bat();
        b.sound();  // from Animal interface
        b.fly();    // from Bird interface
    }
}




// 1. What is an Interface in Java?
// •	An interface is like a contract or blueprint.
// •	It only contains abstract methods (methods without body) and constants.
// •	Classes that implement an interface must provide the body for all methods.
// •	Interfaces are mainly used for multiple inheritance and to achieve abstraction.

// 👉 Example:

// interface Animal {
//     void sound(); // method without body
// }


// Here:
// 	•	interface keyword is used instead of class.
// 	•	void sound(); is just declared → no {}.
// 	•	Whoever implements Animal must give meaning to sound().

// ⸻

// 🔹 2. What is implements?
// 	•	In Java, a class cannot extend multiple classes (no multiple inheritance).
// 	•	But a class can implement multiple interfaces.
// 	•	The keyword implements is used to connect a class with an interface.

// 👉 Example:

// class Bat implements Animal, Bird { ... }


// Here:
// 	•	Bat is a class.
// 	•	Animal and Bird are two interfaces.
// 	•	By writing implements Animal, Bird, the class Bat promises →
// “I will write the body for sound() and fly() methods.”

// ⸻

// 🔹 3. Why do we use interfaces instead of multiple classes?
// 	•	Java avoids diamond problem (confusion when two parent classes have same method).
// 	•	Interfaces only declare methods → no actual code.
// 	•	The child class decides how to implement them → so no conflicts.

// ⸻

// 🔹 4. @Override
// 	•	Just like in abstract classes, we use @Override to show that we are writing the method’s body from the interface.
// 	•	If we misspell or mismatch the method, compiler shows error.

// 👉 Example:

// @Override
// public void sound() {
//     System.out.println("Bat makes screeching sound.");
// }


// 🔹 5. Program Flow Recap
// 	1.	interface Animal → defines sound() but no body.
// 	2.	interface Bird → defines fly() but no body.
// 	3.	class Bat implements Animal, Bird → Bat is forced to provide body for both sound() and fly().
// 	4.	In main(), we create an object of Bat and call both methods.