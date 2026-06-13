public class reverseStringlastword {
    public static void main(String[] args){
        String str = "i love coding";
        String[] words = str.split(" ");
        int lastindex = words.length - 1;
        String st = words[lastindex];
        String reversed = new StringBuilder(st).reverse().toString();
        words[lastindex] = reversed;
        String rs= " ";
        for( int i = 0;i < words.length;i++){
            rs += words[i] + " ";
        }
        System.out.print(rs );
    }
}