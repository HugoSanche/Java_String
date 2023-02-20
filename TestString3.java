public class TestString3 {
    public static void main(String[] Args){
        String name="Hugo Baltazar";
    
        String name2=name.toLowerCase();

        if (name.equals(name2)){
            System.out.println("Values match exactly");
        }
        if (name.equalsIgnoreCase(name2)){
            System.out.println("Ignore Case values match");
        }
        if ( name.startsWith("Hugo")){
            System.out.println("String start with Hugo");
        }
        if (name.endsWith("Baltazar")){
            System.out.println("String end with Baltazar");
        }
        String name3="Veronica Perez Rojas";
        if (name3.contains("Perez")){
            System.out.println("String contains Perez");
        }
    }
}
