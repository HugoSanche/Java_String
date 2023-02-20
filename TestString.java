public class TestString{
    public static void main(String[] Args){

        String name= "Hugo Baltazar";
        printInformation(name);
       // printInformation("");
       // printInformation(" ");
    }
    public static void printInformation(String string){
        int lenght=string.length();
        System.out.printf("Lenght = %d %n", lenght);
        //empty is when string doesnot have anything
        if (string.isEmpty()){
            System.out.println("String is empty");
            return;
        }
        //is blank when hace tab or spaces
        if (string.isBlank() ){
            System.out.println("String is Blank");
        }

        System.out.printf("First Letter %c %n",string.charAt(5) );

    }
}