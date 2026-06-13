import java.util.*;
public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age of students:");
        int[] age = new int[10];
        for (int i = 0; i < age.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            age[i] = sc.nextInt();
        }
        System.out.println("\nVoting Eligibility:");
        for (int i = 0; i < age.length; i++) {


            if (age[i] < 0) {
                System.out.println("invalid age");
            } else if (age[i] >= 18) {
                System.out.println("student with the age" + age[i] + "can vote");

            } else {
                System.out.println("student with the age" + age[i] + " can not vote");
            }
        }
    }
}