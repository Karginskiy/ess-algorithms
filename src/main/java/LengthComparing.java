import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Arrays.sort;
import static java.util.Collections.reverseOrder;


/**
 * Created by Nike on 29.04.2017.
 */
public class LengthComparing {

    public static void main(String[] args) {

        List<Integer> integers = asList(1, 2, 222, 5, 5, 6, 6, 6, 9);
        List<Integer> fullIntegers = new ArrayList<>();
        List<Integer> lengths = new ArrayList<>();
        StringBuilder builder = new StringBuilder();

        int x = 22;
        int seqCounter = 0;
        for (int i = 0; i < integers.size(); i++) {
            String cur = Integer.toString(integers.get(i));
            builder.append(cur);
        }

        String str = builder.toString();
        int counter = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) != str.charAt(i + 1)) {
                lengths.add(counter);
                counter = 0;
            }
            counter++;
        }

        lengths.sort(reverseOrder());

        System.out.println(lengths.get(0));

    }

}
