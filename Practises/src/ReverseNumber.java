import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int rem,sum= 0,temp;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Number: ");
        int num = input.nextInt();
        temp =num;


        while (temp!=0){
            rem = temp%10;
            sum = sum*10+rem;
            temp = num/10;
        }
        System.out.println("The Reverse num is: "+sum);
    }
}
