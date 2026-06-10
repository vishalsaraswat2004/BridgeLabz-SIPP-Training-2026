import java.util.Scanner;

public class coffeeShop {

    public void calculatePrice(int choice, int quantity) {

        double price = 0;
        String coffeeName = "";

        switch (choice) {
            case 1:
                coffeeName = "Espresso";
                price = 2.50;
                break;
            case 2:
                coffeeName = "Cappuccino";
                price = 3.00;
                break;
            case 3:
                coffeeName = "Latte";
                price = 3.50;
                break;
            case 4:
                coffeeName = "Americano";
                price = 2.00;
                break;
            default:
                System.out.println("Invalid Choice!");
                return;
        }

        double bill = price * quantity;
        double gst = bill * 0.18;
        double finalBill = bill + gst;

        generateBill(coffeeName, quantity, gst, finalBill);
    }

    public void generateBill(String coffeeName, int quantity,
                             double gst, double finalBill) {

        System.out.println("\n------------------------------------");
        System.out.println("Coffee Type : " + coffeeName);
        System.out.println("Quantity    : " + quantity);
        System.out.println("Price       : $" + (finalBill - gst));
        System.out.println("GST (18%)   : $" + gst);
        System.out.println("Final Bill  : $" + finalBill);
        System.out.println("------------------------------------");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Your Coffee");
        System.out.println("1. Espresso   - $2.50");
        System.out.println("2. Cappuccino - $3.00");
        System.out.println("3. Latte      - $3.50");
        System.out.println("4. Americano  - $2.00");

        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        coffeeShop shop = new coffeeShop();
        shop.calculatePrice(choice, quantity);

        sc.close();
    }
}