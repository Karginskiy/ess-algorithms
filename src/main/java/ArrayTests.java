import org.apache.commons.math3.util.Precision;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.String.format;
import static org.apache.commons.math3.util.Precision.round;

/**
 * Created by Nike on 25.04.2017.
 */
public class ArrayTests {

    private static <T> boolean containDuplicates(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void algorithmTimeTable() {
        StringBuilder builder = new StringBuilder();

        int second = 1;
        int minute = second * 60;
        int hour = minute * 60;
        int day = hour * 24;
        int week = day * 7;
        int year = week * 52;

        builder.append("\t\t").append("Second");
        builder.append("\t\t").append("Minute");
        builder.append("  ").append("Hour");
        builder.append("\t\t\t").append("Day");
        builder.append("\t\t\t").append("Week");
        builder.append("\t\t\t").append("Year");
        builder.append("\n");

        builder.append("N").append("\t\t")
                .append(calculateNumberOfOperations("N", second)).append("\t")
                .append(calculateNumberOfOperations("N", minute)).append("\t")
                .append(calculateNumberOfOperations("N", hour)).append("\t")
                .append(calculateNumberOfOperations("N", day)).append("\t")
                .append(calculateNumberOfOperations("N", week)).append("\t")
                .append(calculateNumberOfOperations("N", year)).append("\n");

        builder.append("log(N)").append("\t")
                .append(calculateNumberOfOperations("log(N)", second)).append("\t\t")
                .append(calculateNumberOfOperations("log(N)", minute)).append("\t")
                .append(calculateNumberOfOperations("log(N)", hour)).append("\t\t\t")
                .append(calculateNumberOfOperations("log(N)", day)).append("\t\t")
                .append(calculateNumberOfOperations("log(N)", week)).append("\t\t\t")
                .append(calculateNumberOfOperations("log(N)", year)).append("\n");

        builder.append("sqrt(N)").append("\t")
                .append(calculateNumberOfOperations("sqrt(N)", second)).append("\t\t")
                .append(calculateNumberOfOperations("sqrt(N)", minute)).append("\t")
                .append(calculateNumberOfOperations("sqrt(N)", hour)).append("\t\t\t")
                .append(calculateNumberOfOperations("sqrt(N)", day)).append("\t\t")
                .append(calculateNumberOfOperations("sqrt(N)", week)).append("\t\t")
                .append(calculateNumberOfOperations("sqrt(N)", year)).append("\n");

        builder.append("N * N").append("\t")
                .append(calculateNumberOfOperations("N * N", second)).append("\t\t")
                .append(calculateNumberOfOperations("N * N", minute)).append("\t")
                .append(calculateNumberOfOperations("N * N", hour)).append("\t\t\t")
                .append(calculateNumberOfOperations("N * N", day)).append("\t\t")
                .append(calculateNumberOfOperations("N * N", week)).append("\t\t")
                .append(calculateNumberOfOperations("N * N", year));


        System.out.println(builder);
    }

    private static double calculateNumberOfOperations(String order, Integer timeInSeconds) {
        switch (order) {
            case "N * N":
                return sqrt(timeInSeconds * 1000000);
            case "log(N)":
                return -1;
            case "N":
                return 1000000 * timeInSeconds;
            case "sqrt(N)":
                return pow(1000000, 2) * timeInSeconds;
        }
        return -1;
    }

    private static void checkNForTwoAlgorithms() throws InterruptedException {
        int i = 0;
        System.out.println("1500N\t| N ^ 2\t| i");
        while (true) {
            double currentN = 1500 * i;
            double currentN2 = 30 * pow(i, 2);
            System.out.println(format("%.2f\t| %.2f\t| %d", round(currentN, 2), round(currentN2, 2), i));
            i++;
            Thread.sleep(1000);
        }
    }

    private static void compareAlgorithms() throws InterruptedException {
        int i = 0;
        System.out.println("First - (N ^ 3) / 75 - (N ^ 2) / 4 + N + 10");
        System.out.println("Second - N / 2 + 8");
        while (true) {
            double currentFirst = (pow(i, 3) / 75) - (pow(i, 2) / 4) + i + 10;
            double currentSecond = (i / 2) + 8;
            System.out.println(format("First is now - %.2f", currentFirst));
            System.out.println(format("Second is now - %.2f", currentSecond));
            System.out.println(format("i = %d", i));
            i++;
            Thread.sleep(500);
        }
    }

    public static void main(String[] args) throws InterruptedException {

//        Integer[] arr = {2, 2};
//        System.out.println(containDuplicates(arr));
//        arr[0] = 1;
//        System.out.println(containDuplicates(arr));

        algorithmTimeTable();
        checkNForTwoAlgorithms();
        System.out.println("Compare algorithms");
        compareAlgorithms();
    }


}