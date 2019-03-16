package hackerrank;

import java.util.Scanner;

public class JavaStdinandStdoutII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int integ = input.nextInt();

        Double doub = input.nextDouble();
        input.nextLine();
        String st = input.nextLine();

        System.out.println("String: "+ st);
        System.out.println("Double: "+ doub);
        System.out.println("Int: "+ integ);

    }
}
