import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.sqrt;

/**
 * Created by Nike on 28.04.2017.
 */
public class Euclid {
    public static void main(String[] args) {
        System.out.println(gcd(4851, 3003));
        System.out.println(findFactors(48));
        System.out.println(findFactorsUpgraded(1101010117));
    }

    private static int gcd(int num1, int num2) {
        return (num1 % num2 == 0) ? num2 : gcd(num2, num1 % num2);
    }

    private static List<Integer> findFactors(int number) {
        List<Integer> result = new ArrayList<>();
        int i = 2;
        while (i < number) {
            while (number % i == 0) {
                result.add(i);
                number = number / i;
            }
            i = i + 1;
        }

        if (number > 1) {
            result.add(number);
        }

        return result;
    }


    private static List<Integer> findFactorsUpgraded(int number) {
        List<Integer> integers = new ArrayList<>();

        while (number % 2 == 0) {
            integers.add(2);
            number = number / 2;
        }

        int i = 3;
        int maxFactor = (int) sqrt(number);
        while (i <= maxFactor) {
            while (number % i == 0) {
                integers.add(i);
                number = number / i;
                maxFactor = (int) sqrt(number);
            }
            i = i + 2;
        }

        if (number > 1) {
            integers.add(number);
        }

        return integers;
    }


}
