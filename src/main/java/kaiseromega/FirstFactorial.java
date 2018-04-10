package kaiseromega;

import org.junit.Test;

import java.math.BigInteger;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

/****
 * Have the function FirstFactorial(num) take the num parameter being passed and return the factorial of it
 * (e.g. if num = 4, return (4 * 3 * 2 * 1)).
 * For the test cases, the range will be between 1 and 18 and the input will always be an integer.
 * Use the Parameter Testing feature in the box below to test your code with different arguments.
 */
public class FirstFactorial{

    /**
     * Recursive way to calculate factorial using int
     * @param num any integer
     * @return integer Largest value is: 32 bit (2 147 483 647)
     * @note Largest Factorial it can calculate correctly is 12
     */
    private static int firstFactorial(int num){
        if(num <= 1) return 1;
        else return num * firstFactorial(num -1);
    }



    /**
     * Recursive way to calculate factorial using Long
     * @param num any integer
     * @return Long integer, Largest value is: 64 bit  (9 223 372 036 854 775 807)
     * @note Largest Factorial it can calculate correctly is 20
     */
    private static Long firstFactorialLong(int num){
        if(num <= 1) return 1L;
        else return num * firstFactorialLong(num -1);
    }




    /**
     * Non-recursive way to to calculate factorial using int
     * @param num any integer
     * @return integer Largest value is: 32 bit (2147483647)
     * @note Largest Factorial it can calculate correctly is 12
     */
    private static int nonRecursiveFactorial(int num) {
        int result =1;
        for(int i=1; i<=num; i++){
            result *=i;
        }
        return result;
    }




    /**
     * Calculate factorial using BigInteger that can calculate any size of Factorial
     * @param num any integer
     * @return BigInteger
     */
    private static BigInteger factorialBigInteger(int num)
    {
        // Initialize result
        BigInteger result = new BigInteger("1"); // Or BigInteger.ONE

        // Multiply result with 2, 3, ...N
        for (int i = 2; i <= num; i++)
            result = result.multiply(BigInteger.valueOf(i));

        return result;
    }


    @Test
    public void testRecursiveFactorial(){
        int result = firstFactorial(12);
        int expectedResult = 479001600;
//        System.out.print("Factorial is: "+factorialBigInteger(50));
        assertEquals(expectedResult, result);
    }

    @Test
    public void testRecursiveFactorialLong(){
        Long result = firstFactorialLong(12);
        Long expectedResult = 479001600L;
        assertEquals(expectedResult, result);
    }

    @Test
    public void testNonRecursiveFactorial(){
        int result = nonRecursiveFactorial(12);
        int expectedResult = 479001600;
        assertEquals(expectedResult, result);
    }

    @Test
    public void testFactorialBigIntegerWithSameNum(){
        BigInteger result = factorialBigInteger(12);
        BigInteger expectedResult = new BigInteger("479001600");
        assertEquals(expectedResult, result);
    }

    @Test
    public void testFactorialBigInteger(){
        BigInteger result = factorialBigInteger(50);
        assertEquals(new BigInteger("30414093201713378043612608166064768844377641568960512000000000000"), result);
    }

}