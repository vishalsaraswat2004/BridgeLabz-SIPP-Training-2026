import java.util.*;
public class metroCard {
    public static void main(String[] args) {
        double balance = 600.00;
        while (balance > 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Distance in KM or Type -1 to exit");
            double distance = sc.nextDouble();
            if (distance == -1) {
                break;
            }
            System.out.println("Enter Number Of Tickets:");
            int numberOfTicket = sc.nextInt();
            System.out.println("your balance is:" + balance);

            //fare calculation
            double fare = (distance < 5) ? 10 : (distance < 10) ? 20 : (distance < 20) ? 30 : 50;
            fare *= numberOfTicket;
            //Balance calculation
            if (balance > fare) {
                balance -= fare;
                System.out.println("fare deducted:" + fare);
                System.out.println("available balance in your card is:" + balance);
            } else {
                System.out.println("insufficient balance, available balance is:" + balance);
            }


        }
        if (balance == 0) {
            System.out.println("card time is exceeded or insufficient balance\n THANK YOU FOR TRAVELLING IN DELHI METRO");
        } else {
            System.out.println("THANK YOU FOR TRAVELLING IN DELHI METRO");
        }
    }
}