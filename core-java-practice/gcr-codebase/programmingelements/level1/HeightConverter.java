import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height in centimeters: ");
        double centimeters = sc.nextDouble();

        double totalInches = centimeters / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        System.out.println("Height in Feet = " + feet);
        System.out.println("Remaining Inches = " + inches);

        sc.close();
    }
}