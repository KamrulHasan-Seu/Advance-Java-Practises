import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        int n,fact=1,count=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int num = input.nextInt();

        for (int i =2; i<num;i++)
        {
            if(num%i == 0){
                count++;
                break;
            }

        }
        if(count == 0){
            System.out.println(" prime");
        }
        else {
            System.out.println("Not prime");
        }
    }
}
