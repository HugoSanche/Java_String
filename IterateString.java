public class IterateString {
    public static void main(String[] args) {
        String str="San Jeronimo";
        iterate(str);

    }
    public static void iterate(String str){
        for(int i=0;i<str.length();i++) {
            char c = str.charAt(i);
            System.out.println(c);
        }
    }
}
