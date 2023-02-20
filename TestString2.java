public class TestString2 {
    
    public static void main(String[] Args){
        String name="Hugo Baltazar";

        //busca la primera letra a
        System.out.printf("Index of a %d %n", name.indexOf('a'));
        //busca la ultima letra a
        System.out.printf("Last Index of a %d %n",name.lastIndexOf('a'));

        //El primer indice encontrado de la palabra Baltazar
        System.out.printf("Index of a %d %n",name.lastIndexOf("Baltazar"));

        //busca la primera letra a desde el indice 5
        System.out.printf("Index of a %d %n", name.indexOf('a',7));
        //busca la ultima letra a empezando desde el indice 5
        System.out.printf("Last Index of a %d %n",name.lastIndexOf('a',6));
    }
}
