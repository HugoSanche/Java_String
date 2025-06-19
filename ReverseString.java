public class ReverseString {
    public static void main(String[] args) {
        char[] word = {'H','a','n','n','a','h'};

        char[] reversed = reverseString(word);

        System.out.println(reversed);
    }

    public static char[] reverseString(char[] s){
        int fin=s.length-1;
        char temp;
        for(int i=0; i<s.length/2;i++){
            temp=s[i];
            s[i]=s[fin];
            s[fin]=temp;
            fin--;
        }
        return s;
    }
}
