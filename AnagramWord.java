import java.util.Arrays;

public class AnagramWord {
    public static void main(String[] args) {
        String word = "listen";

        String word2 = "silent";
        boolean isAnagram = isAnagramWord(word, word2);

        System.out.println(isAnagram);
    }

    public static boolean isAnagramWord(String word, String word2){

        char[] worduno=word.toCharArray();
        char[] wordtwo=word2.toCharArray();
        Arrays.sort(worduno);
        Arrays.sort(wordtwo);

        //para comparar arrays necesitas usar Arrays.equals. Debido a que no estas usando String.
        if (Arrays.equals(worduno,wordtwo)){
            return true;
        }
        return false;
    }
}
