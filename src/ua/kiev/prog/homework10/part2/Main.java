package ua.kiev.prog.homework10.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] array = new Random().ints(60, -20, 20).toArray();
        ArrayList<Integer> list = Arrays.stream(array).mapToObj(Integer::valueOf).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(list);
        list.stream().sorted((o1, o2) -> {Math.abs(o1) - Math.abs(o2)}).collect(Sysy)
    }
}
