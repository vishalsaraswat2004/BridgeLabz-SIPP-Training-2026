import java.util.Scanner;

public class SplitText {

    // User-defined method to split text into words
    public static String[] splitText(String text) {

        int wordCount = 1;

        // Count spaces to determine number of words
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];

        String word = "";
        int index = 0;

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == ' ') {
                words[index] = word;
                index++;
                word = "";
            } else {
                word += text.charAt(i);
            }
        }

        words[index] = word;

        return words;
    }

    // Compare two String arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] customWords = splitText(text);

        String[] builtInWords = text.split(" ");

        boolean result = compareArrays(customWords, builtInWords);

        System.out.println("\nUsing user-defined method:");
        for (String word : customWords) {
            System.out.println(word);
        }

        System.out.println("\nUsing split() method:");
        for (String word : builtInWords) {
            System.out.println(word);
        }

        System.out.println("\nAre both results same? " + result);

        sc.close();
    }
}