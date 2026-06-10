public class divisible {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 5 == 0){
            System.out.println("number is divisible by 5");
        }
        else{
            System.out.println("number is not divisble");
        }
        sc.close();

    }
}