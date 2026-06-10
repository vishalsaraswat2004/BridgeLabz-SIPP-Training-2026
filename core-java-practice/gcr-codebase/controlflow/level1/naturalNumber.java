import java.util.Scanner;

public class naturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n > 0) {
            int sum = 0;

            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            System.out.println(n + " is a natural number.");
            System.out.println("Sum of first " + n + " natural numbers = " + sum);
        } else {
            System.out.println(n + " is not a natural number.");
        }

        sc.close();
    }
}