public class NumbersOfVowels {
    public static void main(String[] args) {
        String sentence = "Guillermo Hugo Baltazar Sanchez";

        int numbersOfVowel = getNumbersOfVowel(sentence);

        System.out.println(numbersOfVowel);
    }

    public static int getNumbersOfVowel(String sentence){
       String vowels="aeiouAEIOU";
       int count=0;
       for(int i=0; i<sentence.length();i++){
           char ch=sentence.charAt(i);

           //check if caracter is a vowel
           if(vowels.indexOf(ch)!=-1){
               count++;
           }
       }
        return count;
    }
}
