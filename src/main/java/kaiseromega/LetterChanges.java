package kaiseromega;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * LetterChanges(str) take the str parameter being passed and modify it using the following algorithm.
 * Replace every letter in the string with the letter following it in the alphabet (ie. c becomes d, z becomes a).
 * Then capitalize every vowel in this new string (a, e, i, o, u) and finally return this modified string.
 */

public class LetterChanges {

    public static String LetterChanges(String str) {
        String output ="";
        String newLetter = "";
        for (char c : str.toCharArray()) {
            if(Character.isLetter(c)){
                //Replace every letter in the string with the letter following
                newLetter = Character.toString((char) (((c - 'a' + 1) % 26) + 'a'));

                //Check if it is a Vowel, then uppercase
                if("AEIOUaeiou".indexOf(newLetter) != -1){
                    output += newLetter.toUpperCase();
                }
                else {
                    output += newLetter;
                }
            }
            else {
                output += Character.toString(c);
            }
        }
        return output;

    }


    @Test
    public void testWithDigit() {
        String input = "hello*3";
        String expected = "Ifmmp*3";
        String result = LetterChanges(input);
        assertEquals(expected, result);
    }

    @Test
    public void testWithSpecialCharVowel() {
        String input = "fun times!";
        String expected = "gvO Ujnft!";
        String result = LetterChanges(input);
        assertEquals(expected, result);
    }
}
