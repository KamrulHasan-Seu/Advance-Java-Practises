import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rem = 0, sum = 0;
        int num;

        System.out.println("Enter Your Number: ");
        num = input.nextInt();

        int temp = num;

        while (temp != 0) {
            rem = temp % 10;
            sum = sum + rem;
            temp = temp / 10;
        }
        System.out.println(sum);
    }
}
