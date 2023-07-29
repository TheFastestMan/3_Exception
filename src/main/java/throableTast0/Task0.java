package throableTast0;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task0 {
    public static void main(String[] args) throws IOException {

        readFile();


    }

    public static void readFile() throws IOException {


            BufferedReader fin = new BufferedReader(new FileReader("/Users/rail/Desktop/Java Videos/ITVDN. " +
                    "Java Professional/" +
                    "java-professional-materials/008_Annotations_JavaDoc_VarArgs/" +
                    "008_Samples-20180803T065843Z-001/008_Samples/src/javaProfessional/ex_001_Annotations/" +
                    "methods/Main.java"));

            String line;

            while ((line = fin.readLine()) != null)
                System.out.println(line);


    }

}
