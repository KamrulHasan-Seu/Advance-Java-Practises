import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.print("Enter a positive number: ");
        Scanner input = new Scanner(System.in);

        int fact = 1;
        int num = input.nextInt();

        for(int i = num ; i >=1 ; i--){
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + " is = "+ fact);
    }
}
