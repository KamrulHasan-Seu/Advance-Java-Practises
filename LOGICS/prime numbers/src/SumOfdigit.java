import java.util.Scanner;

public class SumOfdigit {
    public static void main(String[] args) {
        System.out.print("Enter a positive number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int temp = num;
        int modResult = 0;
        int finalresult = 0 ;

        while(temp != 0){
             modResult = temp %10 ;
             finalresult  = finalresult + modResult;
             temp = temp/10;
        }
        System.out.println(finalresult);

    }
}
