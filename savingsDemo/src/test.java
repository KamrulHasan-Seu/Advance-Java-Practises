import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        SavingsAccount sa = new SavingsAccount();

        sa.setSavingsBalance(2000.00);

        System.out.print("Set annual interest rate:");
        double percent = ((input.nextDouble())/100);
        sa.modifyInterestRate(percent);

       sa.setSavingsBalance(2000.00);
       // sa.setSavingsBalance(3000.00);


    }
}
