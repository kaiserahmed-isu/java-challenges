package kaiseromega;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;


/**
 * Have the function LongestWord take the sen parameter being passed and return the largest word in the string.
 * If there are two or more words that are the same length, return the first word from the string with that length.
 * Ignore punctuation and show the first longest word.
 */
public class LongestWord {

    /**
     * Find longest word
     * @param sen String
     * @return first longest word
     */
    public static String LongestWord(String sen) {

        sen =  sen.replaceAll("[^a-zA-Z0-9 ]", "");
        String[] word=sen.split(" ");
        String longestWord="";

        for(int i=0;i<word.length;i++){
            if(word[i].length()>longestWord.length()){
                longestWord=word[i];
            }
        }
        return longestWord;

    }

//    public static void main (String[] args) {
//        // keep this function call here
//        Scanner s = new Scanner(System.in);
//        System.out.print(LongestWord(s.nextLine()));
//    }

    @Test
    public void testSpecialChar(){
        String input = "Hello!@# how are you?";
        String expectedResult = "Hello";
        assertEquals(expectedResult, LongestWord(input));
    }

    @Test
    public void testSameLenghofWord(){
        String input = "I love this";
        String expectedResult = "love";
        assertEquals(expectedResult, LongestWord(input));
    }

    @Test
    public void testNumbers(){
        String input = "21321323125415 123123213";
        String expectedResult = "21321323125415";
        assertEquals(expectedResult, LongestWord(input));
    }

    @Test
    public void testNothing(){
        String input = "";
        String expectedResult = "";
        assertEquals(expectedResult, LongestWord(input));
    }

    @Test
    public void testLongSentences(){
        String input = "Have the function LongestWord take the sen parameter being passed and return the largest word in " +
                "the string. If there are two or more words that are the same length, return the first word from the " +
                "string with that length. Ignore punctuation and assume sen will not be empty. ";

        String expectedResult = "LongestWord";
        assertEquals(expectedResult, LongestWord(input));

    }

}
