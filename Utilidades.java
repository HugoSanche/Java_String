public class Utilidades {
    public static void main(String[] args) {
        String str="Hugo Baltazar";
        String str2="Sanchez";

        int tamaño=str.length();

        //substring
        String extract=str.substring(5,13);
        System.out.println(extract);

        //concat
        String str3=str.concat(" ").concat(str2);
        System.out.println(str3);

        //indexOf
        //si no encuentra el caracter devuelve -1
        System.out.println(str.indexOf('a'));

        //Equals
        String apellido="Sanchez";
        System.out.println(str.equals(str2));
        System.out.println(str2.equals(apellido));

        //charAt
        char c=str.charAt(0);
        System.out.println(c);

        //convertirlo a array
        char[]array=str.toCharArray();
        System.out.println(array);
        for(char value:array){
            System.out.print(value);
        }
        System.out.println();
        System.out.println("-----------------------------------------");

        //trim
        //quita espacios al inicio y al final. No quita espacios en medio
        //System.out.println(str.trim());
        String space="  Hugo  ";
        System.out.println(space.trim());

        System.out.println("--------------------REEMPLACE--------------------");
        String nombre="Carolina";
        String nombreCompleto="Hugo Baltazar";


        String strReEmplace=nombre.replace(nombre,"Lourdes");
        System.out.println(strReEmplace);

        String strReempleceNombreCompleto=nombreCompleto.replace("Baltazar","Sanchez");
        System.out.println(strReempleceNombreCompleto);
        //output: Hugo Sanchez

        System.out.println("---------------------------SPLIT----------------------------");
        //SPLIT
       String [] parts=str.trim().split(" ");

       for(String part:parts){
           System.out.println(part);
       }
    }
}
