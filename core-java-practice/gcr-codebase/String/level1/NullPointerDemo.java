public class NullPointerDemo {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;

        System.out.println(text.length());
    }

    // Method to handle NullPointerException
    public static void handleException() {
        String text = null;

        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled successfully.");
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        // Uncomment to see the exception
        // generateException();

        // Method with exception handling
        handleException();
    }
}