import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");

      int num;
      num = input.nextInt();

      if(num%2==0){
          System.out.println("Number is Even");
      }
      else if (num%2==1){
          System.out.println("Number is odd");
      }

    }
}
