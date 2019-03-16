import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args) {
     try {
         File dir = new File("C:/Users/user/IdeaProjects/FileDemo");//To make Directory First
         dir.mkdir();
         System.out.println("Directory Created");

         Formatter format = new Formatter("C:/Users/user/IdeaProjects/FileDemo/student.txt");
         format.format("%s %s\n","101","Kamrul");//to make txt file and written in that file
         format.format("%s %s\n" +
                 "" +
                 "" +
                 "" +
                 "" +
                 "" +
                 "" +
                 "" +
                 "" +
                 "" +
                 "" +
                 "" +
                 "" +
                 "" +
                 "" +
                 "" +
                 "" +
                 "" +
                 "" +
                 "" +
                 "" +
                 "" +
                 "" +
                 "" +
                 "" +
                 "" +
                 "" +
                 "" +
                 "" +
                 "" +
                 "" +
                 "" +
                 "" +
                 "" +
                 "" +
                 "" +
                 "" +
                 "" +
                 "" +
                 "" +
                 "" +
                 "" +
                 "" +
                 "","102","Shamim");
         System.out.println("Written Successfully");

         format.close();

         File read = new File("C:/Users/user/IdeaProjects/FileDemo/student.txt");
         Scanner input = new Scanner(read);
         while (input.hasNext()){
             String id = input.next();
             String name = input.next();

             System.out.println("Id: "+ id +"  Name: "+name);

         }
         input.close();
     }
     catch (Exception e){

         System.out.println(e);
     }
    }
}
