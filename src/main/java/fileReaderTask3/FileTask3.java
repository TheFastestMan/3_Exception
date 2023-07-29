package fileReaderTask3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class FileTask3 {
    public static void main(String[] args) {
        String directoryPath = "/Users/rail/IdeaProjects/Java/SkillSpace_Java-Core";
        File directory;
        File file;

        // Create chain of 3 folders
        try {
            for (int i = 0; i < 3; i++) {
                directory = new File(directoryPath, "/folder_" + (i + 1));
                directory.mkdir();
                directoryPath = directory.getPath();
            }

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        // Create 5 files with random numbers inside
        try {
            List<String> filesList = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                file = new File(directoryPath, "text_" + (i + 1) + ".txt");
                file.createNewFile();

                try (FileWriter writer = new FileWriter(file)) {
                    Random random = new Random();

                    for (int j = 0; j < 10; j++) {
                        writer.write(Integer.toString(random.nextInt(10)));
                        writer.write(System.lineSeparator());
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                filesList.add(file.getName());
            }

            // Write the contents of the files to one file
            String combinedFilePath = directoryPath + "/combined.txt";
            Path combinedPath = Path.of(combinedFilePath);
            Files.createFile(combinedPath);

            for (String fileName : filesList) {
                Path filePath = Path.of(directoryPath, fileName);
                List<String> lines = Files.readAllLines(filePath);
                Files.write(combinedPath, lines, StandardOpenOption.APPEND);
            }

            filesList.add("combined.txt");
            filesList.add("file_list.txt");

            // Create a file that contains a list of files in the given directory
            String fileListPath = directoryPath + "/file_list.txt";
            Path listPath = Path.of(fileListPath);
            Files.write(listPath, filesList, StandardOpenOption.CREATE);

        } catch (IOException e) {
            System.out.println("Error creating files: " + e.getMessage());
        }
    }
}