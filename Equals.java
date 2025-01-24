public class Equals {
    private int age;
    public static void main(String[] args) {
        String s1="Hello";
        String s2="Hello";
        String s3=new String("Hello");
        String s4="Valeria";



        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        String result=s1.concat(", "+s4);
        System.out.println(result);

        int index=result.indexOf('V');
        System.out.println(index);


    }
}
