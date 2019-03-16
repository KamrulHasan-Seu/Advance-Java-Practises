import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        while (true){
            System.out.println("Input a number: ");

            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            int count = 0;
            for(int i = 2 ; i < num ; i++){
                if(num %i == 0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println("This is a prime number");
            }
            else{
                System.out.println("This is not prime");
            }
        }
    }
}
