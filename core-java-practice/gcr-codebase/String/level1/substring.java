import java.util.Scanner;

public class substring {

    // Create substring using charAt()
    public static String createSubstring(String str, int start, int end) {
        String result = "";

        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }

        return result;
    }

    // Compare two strings using charAt()
    public static boolean substring(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // Using charAt()
        String customSubstring = createSubstring(text, start, end);

        // Using built-in substring()
        String builtinSubstring = text.substring(start, end);

        // Compare both substrings
        boolean result = compareStrings(customSubstring, builtinSubstring);

        System.out.println("Substring using charAt(): " + customSubstring);
        System.out.println("Substring using substring(): " + builtinSubstring);
        System.out.println("Are both substrings same? " + result);

        sc.close();
    }
}