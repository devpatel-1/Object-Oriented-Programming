public class pr2_14 {
    public static void main(String[] args) {
        int a = 5;
        double b = 2.5;
        double c = 4.0;

        // Expression 1: a + b * c
        // Multiplication (*) has higher precedence than addition (+)
        // So b * c = 2.5 * 4.0 = 10.0
        // Then a + 10.0 = 5 + 10.0 = 15.0
        System.out.println(a + b * c); // Output: 15.0

        // Expression 2: ++a * b - c
        // Step 1: ++a → pre-increment, so a becomes 6
        // Step 2: a * b = 6 * 2.5 = 15.0
        // Step 3: 15.0 - c = 15.0 - 4.0 = 11.0
        System.out.println(++a * b - c); // Output: 11.0

        // Expression 3: a / b + c
        // After previous ++a, a = 6
        // Step 1: a / b = 6 / 2.5 = 2.4
        // Step 2: 2.4 + c = 2.4 + 4.0 = 6.4
        System.out.println(a / b + c); // Output: 6.4
    }
}
