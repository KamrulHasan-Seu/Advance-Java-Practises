package hackerrank;

import java.util.Scanner;

public class StringIntroduction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String A = input.nextLine();
        String B = input.nextLine();

        int sum = A.length()+ B.length();
        System.out.println(sum);

        System.out.println(A.compareTo(B)>0?"Yes":"No");
        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1).toLowerCase()+ " "+ B.substring(0,1).toUpperCase() +
                B.substring(1).toLowerCase());

    }
}
