import java.util.Scanner;

public class pr3_8 {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a sentence: ");
            String sentence = sc.nextLine();

            String[] words = sentence.split(" ");

            System.out.println("Words in reverse order: ");
            for (int i = words.length - 1; i >= 0; i--) {
                System.out.print(words[i] + " ");
            }
            System.out.println();
        }

    }
}
