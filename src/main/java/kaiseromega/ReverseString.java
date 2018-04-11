package kaiseromega;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Have the function FirstReverse(str) take the str parameter being passed and return the string in reversed order.
 * For example: if the input string is "Hello World and Coders" then your program should return the string
 * sredoC dna dlroW olleH.
 */
public class ReverseString {

    /**
     * Using loop and charAt, reverse a string
     * @param str String
     * @return reversed String
     */
    public static String FirstReverse(String str) {

        String reversed ="";
        int length = str.length();
        for(int i=length-1;i>=0;i--){
            reversed += str.charAt(i);
        }
        return reversed;

    }


    /**
     * Using StringBuffer, reverse a string
     * @param str String
     * @return reversed String
     */
    public static String SecondReverse(String str){
        String reversed = new StringBuffer(str).reverse().toString();

        return reversed;
    }



    @Test
    public void testString(){
        String input = "Hello World and Coders";
        String expected = "sredoC dna dlroW olleH";
        String result = FirstReverse(input);
        assertEquals(expected, result);
    }

    @Test
    public void testStringUsingBuffer(){
        String input = "Hello World and Coders";
        String expected = "sredoC dna dlroW olleH";
        String result = SecondReverse(input);
        assertEquals(expected, result);
    }
}
