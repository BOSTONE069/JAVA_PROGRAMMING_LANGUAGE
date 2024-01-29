package week_five;

import java.nio.file.*;
import java.io.*;

public class MyFileWriter {

    public static void main(String[] args) {
        String home = System.getProperty("user.home");
        Path p = Paths.get(home + "/fileToWrite.txt");
        if (Files.exists(p)) {
            try (FileWriter writer = new FileWriter(p.toFile())) {
                writer.write("I have learned how to write a file");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
