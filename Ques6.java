/*
    6. Convert an Optional type into Stream
 */
package Java9_17;

import java.util.Optional;

public class Ques6
{
    public static void main(String[] args) {

        // create a Optional
        Optional<Integer> op = Optional.of(9455);

        // print value
        System.out.println("Optional: " + op);

        // get the Stream
        System.out.println("Getting the Stream:");
        op.stream().forEach(System.out::println);

    }
}
