/*
    2. Perform takeWhile and dropWhile operations on stream
 */
package Java9_17;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ques2
{
    public static void main(String[] args) {

        // takeWhile : Take number till it is less than 25
        System.out.println(IntStream
                .rangeClosed(15,30)
                .takeWhile(num->num<25)
                .boxed()
                .collect(Collectors.toList()));


        // dropWhile : drop number till it is less than 25
        System.out.println(IntStream
                .rangeClosed(15,30)
                .dropWhile(num->num<25)
                .boxed()
                .collect(Collectors.toList()));
    }
}
