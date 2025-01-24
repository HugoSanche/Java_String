public class Reverse {
    public static void main(String[] args) {
        String str="San Jeronimo";
        //iterate(str);
        String result=reverse(str);
        System.out.println(result);
    }
    public static void iterate(String str){
        for(int i=str.length()-1;i>=0;i--) {
            char c = str.charAt(i);
            System.out.print(c);
        }
    }
    public static String reverse(String str){
        StringBuilder stringBuilder=new StringBuilder();

        for(int i=str.length()-1;i>=0; i--){
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }
}

