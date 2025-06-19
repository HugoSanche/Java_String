public class LongestSubstring {
    public static void main(String[] args) {
        String s="abcabcbb";

        StringBuilder without=new StringBuilder();
        String temp=s;
        for(int i=0; i<s.length(); i++){
            System.out.println(s.length());
                temp=s.substring(i+1,s.length());
               // without.append(s.charAt(i));
            System.out.println(temp);
        }
        System.out.println(without);
    }
}
