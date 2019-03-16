import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int n,fact=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int num = input.nextInt();

       for(int i = num;i >= 1;i--){
           fact = fact*i;
       }
        System.out.println("The factorial of "+num +" is ="+fact );
    }
}

