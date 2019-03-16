import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n,fibo =0;
        Scanner input = new Scanner(System.in);
        System.out.print("How Many Numbers: ");
        int num = input.nextInt();

        int first= 0;
        int second = 1;

        System.out.print(first +" "+ second);
        for ( n =3;n<=num;n++){


            fibo = first+second;
            System.out.print( " "+fibo);
            first = second;
            second =fibo;
        }
    }
}
