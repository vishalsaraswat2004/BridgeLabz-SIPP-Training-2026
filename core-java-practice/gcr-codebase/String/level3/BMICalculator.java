import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] heights = new double[10];
        double[] weights = new double[10];
        double[] bmi = new double[10];
        String[] status = new String[10];

        for (int i = 0; i < 10; i++) {

            System.out.println("Person " + (i + 1));

            System.out.print("Enter height (in meters): ");
            heights[i] = sc.nextDouble();

            System.out.print("Enter weight (in kg): ");
            weights[i] = sc.nextDouble();

            bmi[i] = weights[i] / (heights[i] * heights[i]);

            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 25) {
                status[i] = "Normal Weight";
            } else if (bmi[i] < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }

            System.out.println();
        }

        System.out.println("\nHeight\tWeight\tBMI\tStatus");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s%n",
                    heights[i],
                    weights[i],
                    bmi[i],
                    status[i]);
        }

        sc.close();
    }
}