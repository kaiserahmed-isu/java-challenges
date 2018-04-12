package kaiseromega;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Take the str parameter being passed and determine if it is an acceptable sequence by either returning the string true or false.
 * The str parameter will be composed of + and = symbols with several letters between them (ie. ++d+===+c++==a) and
 * for the string to be true each letter must be surrounded by a + symbol. So the string to the left would be false.
 * The string will not be empty and will have at least one letter.
 */
public class SimpleSymbols {

    /**
     * Using Regex
     * @param str String
     * @return boolean
     */
    private static boolean simpleSymbolsWithRegex(String str){
        boolean output;
        if(str.matches("^(?:[^a-zA-Z+]+|(?:(?:\\++[a-zA-Z](?=\\+))*|\\++))*$")){
            output = true;
        }else {
            output = false;
        }
        return output;
    }

    /**
     * Without Regex
     * @param str String
     * @return boolean
     */
    private static boolean simpleSymbols(String str){
        boolean output = false;
        char[] c = str.toCharArray();
        if(Character.isLetter(c[0]) || Character.isLetter(c[c.length-1])){
            return false;
        }
        for(int i=1; i <= c.length-2; i++){
            if(Character.isLetter(c[i]) && Character.toString(c[i-1]).equals("+") && Character.toString(c[i+1]).equals("+") ){
                output = true;
            }
            else if(Character.isLetter(c[i]) && (!Character.toString(c[i-1]).equals("+") || !Character.toString(c[i+1]).equals("+"))){
                return false;
            }
        }
        return output;
    }



    @Test
    public void testTrueInput(){
        String input = "+d+=3=+s+";
        assertTrue(simpleSymbols(input));
    }

    @Test
    public void testFalseInput(){
        String input = "+d===+a+";
        assertFalse(simpleSymbols(input));
    }
}