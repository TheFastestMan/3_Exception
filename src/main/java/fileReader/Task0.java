package fileReader;

import java.io.*;
import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) throws IOException {
        File directory = new File("/Users/rail/IdeaProjects/Java/SkillSpace_Java-Core/test");
        directory.mkdir();

        for (int i = 0; i < 20; i++) {
            File file = new File(directory, "test_" + i + ".txt");
            file.createNewFile();

            try (OutputStream ops = new FileOutputStream(file)) {

                ops.write(("java " + i).getBytes());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        for (File f : directory.listFiles()) {
            try (FileReader fr = new FileReader(f);
                 Scanner sc =  new Scanner(fr)) {

                while (sc.hasNextLine()) {
                    if (sc.nextLine().equals("java 8"))
                        System.out.println("I found it " + f.getName());
                }
            }
        }

    }
}
