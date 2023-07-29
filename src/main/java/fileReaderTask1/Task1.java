package fileReaderTask1;

import java.io.File;

public class Task1 {
    public static void main(String[] args) {

        File directory = new File("/Users/rail/IdeaProjects/Java/SkillSpace_Java-Core/test");

        if (directory.exists() && directory.isDirectory()) {
            System.out.println("Files: ");
            File[] filesAndDirectories = directory.listFiles();
            if (filesAndDirectories != null) {
                for (File file : filesAndDirectories) {
                    if (file.isFile()) {
                        System.out.println("File: " + file.getName());
                    } else if (file.isDirectory())
                        System.out.println("Directory: " + file.getName());
                }
            }
        } else {
            System.out.println("Not valid directory.");
        }
    }
}
