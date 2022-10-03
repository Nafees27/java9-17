/*
    9. Create Unmodifiable List from a Steam
 */
package Java9_17;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ques9
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(9);
        list.add(8);

        list.stream()
                .filter(e->e>=10)
                .collect(Collectors.toUnmodifiableList()).forEach(System.out::println);


    }
}
