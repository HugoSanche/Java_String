public class PalindromeChecker {
    public static void main(String[] args) {
        String str="luz azul";
        //iterate(str);
        boolean result=isPalindrome(str);
        System.out.println(result);
    }
    public static boolean isPalindrome(String str){

        int j=str.length()-1;
        for(int i=0; i<str.length()-1; i++){
            if(str.charAt(i)!=str.charAt(j)){
               return false;
            }
            j--;
        }
        return true;
    }
}
