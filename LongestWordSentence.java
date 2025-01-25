public class LongestWordSentence {
    public static void main(String[] args) {
        String  sentence="Guiller Hugo Baltazar Sanchez";

        String word=getLongestWord2(sentence);

        System.out.println(word);
    }
    public static String getLongestWord(String sentence){
        if(sentence==null || sentence.isEmpty()){
            return "";
        }

        String[] strArray=sentence.trim().split(" ");

        int value=0;
        for(int i=1;i<strArray.length;i++){
            if(strArray[value].length()<strArray[i].length()){
                value=i;
            }
        }
        return strArray[value];
        }
    public static String getLongestWord2(String sentence){

        if(sentence==null || sentence.isEmpty()){
            return "";
        }

        String[] strArray=sentence.trim().split(" ");

        String longestWord="";
       for(String word:strArray){
           if(word.length()>longestWord.length()){
               longestWord=word;
           }
       }
       return longestWord;
    }
}
