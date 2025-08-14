import java.util.Scanner;

public class pr3_6 {
    
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a string: ");
            String str = sc.nextLine();

            str = str.toLowerCase();

            int vowels = 0, consonants = 0, digits = 0, specialChars = 0;

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if (ch >= 'a' && ch <= 'z') {
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowels++;
                    } else {
                        consonants++;
                    }
                } else if (ch >= '0' && ch <= '9') {
                    digits++;
                } else if (ch != ' ') {
                    specialChars++;
                }
            }

            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
            System.out.println("Digits: " + digits);
            System.out.println("Special Characters: " + specialChars);

        }

    }

}
