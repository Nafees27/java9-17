/*
   1. Demonstrate the use of private methods in interfaces
 */

package Java9_17;

interface ManipulationOfString
{
    private static String reverseString(String str)
    {
        return new StringBuilder(str).reverse().toString();
    }

    static String toUpperCaseReverse(String str)
    {
        return reverseString(str).toUpperCase();
    }
}
public class Ques1
{
    public static void main(String[] args)
    {
       String manipulated = ManipulationOfString.toUpperCaseReverse("Max Payne");
        System.out.println(manipulated);
    }
}

