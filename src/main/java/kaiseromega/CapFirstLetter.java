package kaiseromega;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * take the str parameter being passed and capitalize the first letter of each word.
 * Words will be separated by only one space.
 */
public class CapFirstLetter {

    private static String capFirstLetter(String str){

        String output = "";
        String[] words = str.split(" ");

        for(int i=0;i<words.length;i++){

            words[i]= words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
            if(i == 0) output += words[i];
            else output += " " + words[i];
        }
        return output;
    }


    @Test
    public void testText() {
        String input = "hello world";
        String expected = "Hello World";
        String result = capFirstLetter(input);
        assertEquals(expected, result);
    }

    @Test
    public void testTextAndNumer() {
        String input = "hello 121 world";
        String expected = "Hello 121 World";
        String result = capFirstLetter(input);
        assertEquals(expected, result);
    }

    @Test
    public void testText2() {
        String input = "i ran there";
        String expected = "I Ran There";
        String result = capFirstLetter(input);
        assertEquals(expected, result);
    }
}