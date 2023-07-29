package fileReaderTask2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderTask2 {
    public static void main(String[] args) throws IOException {

        File dir = new File("/Users/rail/IdeaProjects/SkillSpace_JavaCore/3_Exception");
        dir.mkdir();

        File f = new File(dir, "fileName" + ".txt");
        f.createNewFile();

        try (FileWriter writer = new FileWriter("/Users/rail/IdeaProjects/SkillSpace_JavaCore/3_Exception/" +
                "fileName.txt")) {

            String text = "Hello world! I like Java! I want to learn it!";
            writer.write(text);
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (FileReader reader = new FileReader("/Users/rail/IdeaProjects/SkillSpace_JavaCore/3_Exception/" +
                "fileName.txt")) {

            Scanner sc = new Scanner(reader);
            String textLine = sc.nextLine();
            System.out.println(textLine);

            String[] words = textLine.split("\\s+");
            String[] signs = textLine.split("( *?[0-9a-zA-Z] *?){10,}");
            int countWords = 0;
            int countSigns = 0;

            for (String word : words) {
                countWords++;
            }
            for (String sign : signs) {
                countSigns++;
            }

            System.out.println("Words " + countWords);
            System.out.println("Signs " + countSigns);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

