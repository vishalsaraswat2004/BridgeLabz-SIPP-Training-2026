import java.util.Scanner;

public class UniqueCharacters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.print("Unique characters: ");

        for (int i = 0; i < text.length(); i++) {

            char current = text.charAt(i);
            int count = 0;

            for (int j = 0; j < text.length(); j++) {
                if (current == text.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.print(current + " ");
            }
        }

        sc.close();
    }
}