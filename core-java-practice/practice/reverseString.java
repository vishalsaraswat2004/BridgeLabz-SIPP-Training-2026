public class reverseString {
    public static void main(String[] args){
        String str = "i love coding";
        String[] word = str.split(" ");
        for(int i = word.length - 1; i>=0;i--){
            System.out.print(  word[i] + " ");
        }
    }
}