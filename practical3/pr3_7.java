public class pr3_7 {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" world");
        System.out.println("After append: " + sb);

        sb.insert(5, ", Java");
        System.out.println("After insert: " + sb);

        sb.deleteCharAt(5);
        System.out.println("After deleteCharAt: " + sb);

        sb.replace(6, 10, "Dev");
        System.out.println("After replace: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

    }
}




// public class pr3_7 {
//     public static void main(String[] args) {


//         •	Declares a class pr3_7.
//         •	Inside it, the main method runs the program.




// StringBuilder sb = new StringBuilder("Hello");

// •	Creates a StringBuilder object sb with initial content "Hello".
// •	Unlike String, StringBuilder is mutable, so it can be changed without creating new objects.



// sb.append(" world");
// System.out.println("After append: " + sb);

// •	append(" world") adds " world" to the end of "Hello".
// •	Now sb = "Hello world".
// •	Output → After append: Hello world.



// sb.insert(5, ", Java");
// System.out.println("After insert: " + sb);

// •	insert(5, ", Java") inserts the string ", Java" at index 5.
// •	Index 5 is after "Hello".
// •	So "Hello world" → "Hello, Java world".
// •	Output → After insert: Hello, Java world.

// ⸻



// sb.deleteCharAt(5);
// System.out.println("After deleteCharAt: " + sb);


// •	Deletes the character at index 5.
// •	Current string = "Hello, Java world".
// •	At index 5 → "," (comma).
// •	After deletion → "Hello Java world".
// •	Output → After deleteCharAt: Hello Java world.




// sb.replace(6, 10, "Dev");
// System.out.println("After replace: " + sb);


// •	Replaces characters from index 6 (inclusive) to 10 (exclusive) with "Dev".
// •	Current string = "Hello Java world".
// •	Characters at 6–9 = "Java" (positions: 6=J, 7=a, 8=v, 9=a).
// •	Replace "Java" with "Dev".
// •	Result = "Hello Dev world".
// •	Output → After replace: Hello Dev world.



// sb.reverse();
// System.out.println("After reverse: " + sb);


// •	Reverses the entire string.
// •	"Hello Dev world" → "dlrow veD olleH".
// •	Output → After reverse: dlrow veD olleH.