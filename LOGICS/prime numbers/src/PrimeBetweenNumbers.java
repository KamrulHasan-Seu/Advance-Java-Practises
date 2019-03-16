import java.util.Scanner;

public class PrimeBetweenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Starting Number: ");
        int startingInput = input.nextInt();
        System.out.println("Enter Ending Number: ");
        int endinginput = input.nextInt();

        int count = 0;

        for (int i = startingInput; i <=endinginput; i++){
            for (int j = 2; j < i ; j++){
                if(i%j == 0){
                    count++;
                    break;
                }
            }
            if (count == 0)
            {
                System.out.println(i);
            }
            count=0;

        }


    }
}
