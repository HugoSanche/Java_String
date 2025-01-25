public class removeAllSpaces {
    public static void main(String[] args) {
        String sentence = "  Guillermo Hugo  Baltazar Sanchez   ";

        String word = removeAllWhiteSpaces(sentence);

        System.out.println(word);
    }

    public static String removeAllWhiteSpaces(String sentence) {
        return sentence.replaceAll("\\s","");

    }

    public static String removeAllWhiteSpaces2(String sentence) {

        if(sentence==null || sentence.isEmpty()){
            return "";
        }

        sentence=sentence.trim();
        String[] strArray = sentence.trim().split(" ");
        StringBuilder strB=new StringBuilder();

       for(String word:strArray){
           strB.append(word.trim());
       }
       return strB.toString();
    }
}