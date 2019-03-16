import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        int fnum = 0;
        int snum = 1;
        int fibo = 0;

        System.out.print("How many numbers: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.print(fnum +" "+ snum + " ");

        for (int i = 1 ; i <= num ; i++){

            fibo = fnum + snum;

            System.out.print(fibo + " ");

            fnum = snum;
            snum = fibo;
        }

    }
}
