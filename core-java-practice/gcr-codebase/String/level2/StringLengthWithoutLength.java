import java.util.Scanner;

public class StringLengthWithoutLength {

    // User-defined method
    public static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        int customLength = findLength(text);
        int builtInLength = text.length();

        System.out.println("Length using user-defined method: " + customLength);
        System.out.println("Length using length() method: " + builtInLength);

        sc.close();
    }
}