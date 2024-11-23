package org.example;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class UndoManager {

    private static final String FILEPATH = "src/main/file/commands_file.txt";

    public static final UndoManager myManager = new UndoManager();

    public void showHistory() {
        readTextFile();
    }

    public void addCommandLine(String text) {
        addLine(text + "\n");
    }

    public void removeLastCommand() {
        removeLastLineOfTextFile();
    }

    public void removeAllLines() {
        List<String> list = new ArrayList<String>();
        addLines(list);
    }

    private void removeLastLineOfTextFile() {
        List<String> list = new ArrayList<>();
        try {
            list = Files.readAllLines(Paths.get(FILEPATH));
        } catch (IOException e) {
            System.out.println("Read text file failed for file: " + FILEPATH);
        }

        if (!list.isEmpty()) {
            list.removeLast();
            addLines(list);
        }
    }

    private void addLines(List<String> lines) {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(FILEPATH), StandardOpenOption.TRUNCATE_EXISTING)) {
            for (String line : lines) {
                writer.write(line + "\n");
            }
        } catch (IOException ioe) {
            System.out.println("Add lines to text file failed for file: " + FILEPATH);
        }
    }

    private void addLine(String line) {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(FILEPATH), StandardOpenOption.APPEND)) {
            writer.write(line);
        } catch (IOException ioe) {
            System.out.println("Add line to text file failed for file: " + FILEPATH);
        }
    }

    private void readTextFile() {
        List<String> list = new ArrayList<>();
        try {
            list = Files.readAllLines(Paths.get(FILEPATH));
        } catch (IOException e) {
            System.out.println("Read text file failed for file: " + FILEPATH);
        }

        System.out.println();
        if (list.isEmpty()) {
            System.out.println("Empty history");
            return;
        }

        for (String line : list) {
            System.out.println(line);
        }
    }
}
