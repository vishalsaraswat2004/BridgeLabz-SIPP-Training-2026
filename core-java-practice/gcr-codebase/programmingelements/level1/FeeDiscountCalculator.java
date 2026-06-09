import java.util.Scanner;

public class FeeDiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Fee: ");
        double fee = sc.nextDouble();

        System.out.print("Enter Discount Percentage: ");
        double discountPercent = sc.nextDouble();

        double discountAmount = (fee * discountPercent) / 100;
        double finalFee = fee - discountAmount;

        System.out.println("Discount Amount = INR " + discountAmount);
        System.out.println("Final Fee to Pay = INR " + finalFee);

        sc.close();
    }
}