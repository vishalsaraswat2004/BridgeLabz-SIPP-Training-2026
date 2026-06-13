public class reversemiddleword {
    public static void main(String[] args){
        String str = "i love coding";
        String[] words = str.split(" ");
        int middleindex = words.length/2;
        String st = words[middleindex];
        String reversed = new StringBuilder(st).reverse().toString();
        words[middleindex] = reversed;
        String rs= " ";
        for( int i = 0;i < words.length;i++){
            rs += words[i] + " ";
        }
        System.out.print(rs );
    }
}