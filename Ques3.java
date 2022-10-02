/*
    3. Use rangeClosed to create a  Stream
 */
package Java9_17;

import java.util.stream.IntStream;

public class Ques3
{
    public static void main(String[] args) {

        IntStream.rangeClosed(10,15).forEach(System.out::println);
    }
}
