public class TestString_JDK11_15 {
    public static void main(String[] Args){

        //working with repeat and indent
        
           //REPEAT() JAVA 11
           System.out.println("ABC\n".repeat(3));
           System.out.println("-".repeat(20));
   
           //INDENT() JAVA 15
           //incident agrega espacios al final 
           System.out.println("ABC\n".repeat(3).indent(20));
           System.out.println("*".repeat(20));
   
           //al espacio le quita 10
           System.out.println("              ABC\n".repeat(3).indent(10));
           System.out.println("*".repeat(20));
       } 
    
}
