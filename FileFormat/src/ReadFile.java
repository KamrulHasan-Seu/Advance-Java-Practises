import java.io.*;

public class ReadFile{
    public static void main(String[] args) {
        File file = new File("D:\\write file\\object.txt");
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String lines = null;

            int numberOfLines = 0;
            while ((lines = br.readLine())!= null){
                System.out.println(lines);
                numberOfLines++;
            }
            System.out.println("total number of lines: "+ numberOfLines);
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}