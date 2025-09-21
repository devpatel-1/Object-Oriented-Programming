/**
 * Interface A defines a single abstract method.
 */
interface InterfaceA {
    void methodA();
}

/**
 * Interface B defines a single abstract method.
 */
interface InterfaceB {
    void methodB();
}

/**
 * Interface C extends both InterfaceA and InterfaceB.
 * This is an example of multiple inheritance with interfaces.
 * It also adds its own method.
 */
interface InterfaceC extends InterfaceA, InterfaceB {
    void methodC();
}

/**
 * Class D is a standard class with its own method.
 * This will act as the superclass for ClassE.
 */
class ClassD {
    public void methodD() {
        System.out.println("This is methodD from ClassD.");
    }
}

/**
 * Class E demonstrates both class and interface inheritance.
 * It extends ClassD, so it inherits methodD().
 * It implements InterfaceC, so it must provide implementations for
 * methodA(), methodB(), and methodC().
 */
class ClassE extends ClassD implements InterfaceC {

    @Override
    public void methodA() {
        System.out.println("ClassE's implementation of methodA from InterfaceA.");
    }

    @Override
    public void methodB() {
        System.out.println("ClassE's implementation of methodB from InterfaceB.");
    }

    @Override
    public void methodC() {
        System.out.println("ClassE's implementation of methodC from InterfaceC.");
    }
}


/**
 * Main class to run the demonstration.
 */
public class pr5_9 {
    public static void main(String[] args) {
        // Create an object of ClassE
        ClassE objE = new ClassE();

        System.out.println("Calling methods on an object of ClassE:");

        // Call the methods from the interfaces it implements
        objE.methodA(); // Inherited from InterfaceC -> InterfaceA
        objE.methodB(); // Inherited from InterfaceC -> InterfaceB
        objE.methodC(); // From InterfaceC

        // Call the method from the class it extends
        objE.methodD(); // Inherited from ClassD
    }
}
