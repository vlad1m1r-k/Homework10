package ua.kiev.prog.homework10.part2;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new Random().ints(30, -20, 20).toArray();
        Arrays.stream(array).mapToObj(Integer::valueOf).distinct().sorted((o1, o2) -> Math.abs(o1) - Math.abs(o2)).filter(o -> o != 0).limit(2).sorted()
                .sorted((o1, o2) -> comparator(o1, o2)).limit(1)
                .forEach(System.out::println);
    }

    private static int comparator(Integer o1, Integer o2) {
        if (Math.abs(o1) == Math.abs(o2)) {
            return -1;
        }
        return Math.abs(o1) - Math.abs(o2);
    }
}
