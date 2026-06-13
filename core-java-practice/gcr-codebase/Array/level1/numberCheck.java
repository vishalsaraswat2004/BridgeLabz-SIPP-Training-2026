import java.util.*;
public class numberCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        for(int i = 0; i < nums.length;i++){
            System.out.println("Enter the numbers" + (i+1) + " ");
            nums[i] = sc.nextInt();
        }
        System.out.println("\ncheckNumber");
        for(int i = 0;i < nums.length;i++) {
            if (nums[i] > 0) {
                if (nums[i] % 2 == 0) {
                    System.out.println("the number is even");
                } else {
                    System.out.println("the number is odd");
                }

            } else if (nums[i] < 0) {

                System.out.println("number is negative");

            } else {
                System.out.println("the number is zero");
            }
        }
        if (nums[0] == nums[nums.length - 1]) {
            System.out.println("First and last elements are equal.");
        } else if (nums[0] > nums[nums.length - 1]) {
            System.out.println("First element is greater than the last element.");
        } else {
            System.out.println("First element is less than the last element.");
        }
    }
}


