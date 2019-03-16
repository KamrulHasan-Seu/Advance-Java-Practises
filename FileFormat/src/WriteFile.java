import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;

public class WriteFile {
    public static void main(String[] args) {
        File file = new File("D:\\write file\\object.txt");

        try {
            FileWriter fileWriter = new FileWriter(file,true);
           //BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);



            fileWriter.append("4");

            fileWriter.flush();
            fileWriter.close();





        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
