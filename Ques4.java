/*
    4. Use iterator stream method to generate a stream
 */

package Java9_17;

import java.util.stream.IntStream;

public class Ques4
{
    public static void main(String[] args)
    {
        // Stream Using Iterator
        IntStream
                .iterate(5,i->i<15,i->i+1)
                .forEach(System.out::println);
    }
}
