package hackerrank;

import java.util.Scanner;

public class JavaINtToString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        if (n >= -100 && n <= 100) {
            String s = String.valueOf(n);
            System.out.println("Good job");

        } else {

            System.out.println("Wrong answer");
        }

    }
}
