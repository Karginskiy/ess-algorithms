import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;
import static java.util.Collections.reverseOrder;
import static java.util.stream.Collectors.joining;


/**
 * Created by Nike on 29.04.2017.
 */
public class LengthComparing {

    public static void main(String[] args) {

        List<Integer> integers = asList(1, 2, 222, 5, 5, 6, 6666666, 6, 9);
        List<Integer> lengths = new ArrayList<>();
        String joiner = integers.stream().map(String::valueOf).collect(joining());

        int counter = 0;
        for (int i = 0; i < joiner.length() - 1; i++) {
            if (joiner.charAt(i) != joiner.charAt(i + 1)) {
                lengths.add(counter);
                counter = 0;
            }
            counter++;
        }

        lengths.sort(reverseOrder());

        System.out.println(lengths.get(0));

    }

}
