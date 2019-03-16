import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        int num1,num2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Real number:");
        num1 = sc.nextInt();

        System.out.println("Enter Imaginary number:");
        num2 = sc.nextInt();

        RationalClass rc = new RationalClass();
        rc.getResult(num1,num2);
        ComplexClass cc = new ComplexClass();
        cc.complex(num1,num2);
        System.out.println("Enter 1:");
        int num3 = sc.nextInt();
        if(num3 == 1)
        {
            System.out.println(rc.getResult1(num1, num2));
        }
    }
}
