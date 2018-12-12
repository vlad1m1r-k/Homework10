package ua.kiev.prog.homework10.part4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(Files.lines(Paths.get("text.txt")).mapToInt(Integer::valueOf).max().getAsInt());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
