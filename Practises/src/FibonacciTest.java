import java.util.Scanner;

public class FibonacciTest {
    public static void main(String[] args) {
        int fibo =0;
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers: ");
        int num = input.nextInt();

        int first = 0;
        int second = 1;

        for (int n =0;n<=num;n++){
            fibo = first+second;
            System.out.print(fibo+" ");

        }

    }

}
