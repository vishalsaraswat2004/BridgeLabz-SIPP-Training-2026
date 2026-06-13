import java.util.Scanner;

public class CharArrayComparison {

    // User-defined method to convert String to char array
    public static char[] getCharacters(String text) {

        char[] result = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }

        return result;
    }

    // Compare two char arrays
    public static boolean compareArrays(char[] arr1, char[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        // User-defined method
        char[] userArray = getCharacters(text);

        // Built-in method
        char[] builtInArray = text.toCharArray();

        // Compare arrays
        boolean result = compareArrays(userArray, builtInArray);

        System.out.print("User-defined array: ");
        for (char ch : userArray) {
            System.out.print(ch + " ");
        }

        System.out.println();

        System.out.print("Built-in array: ");
        for (char ch : builtInArray) {
            System.out.print(ch + " ");
        }

        System.out.println();

        System.out.println("Are both arrays same? " + result);

        sc.close();
    }
}