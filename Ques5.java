/*
    5.Use ifPresentOrElse, or, orElseThrow Operations with Optional
 */

package Java9_17;

import java.util.stream.IntStream;

public class Ques5
{
    public static void main(String[] args)
    {
        // ifPresentOrElse
        IntStream
                .rangeClosed(5,20)
                .filter(value -> value<10)
                .findFirst()
                .ifPresentOrElse(
                (value) -> System.out.println(value + " Exist"),
                ()-> System.out.println("value not exist"));


        // orElseThrow
        IntStream
                .rangeClosed(5,20)
                .filter(value -> value>50)
                .findFirst()
                .orElseThrow();
    }
}
