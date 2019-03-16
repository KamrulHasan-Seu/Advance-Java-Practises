import java.util.Scanner;

public class SavingsAccount {

    static double annualInterestRate;
   static private double savingsBalance;

  // static double saver1 = 2000.00 ;
   //static double saver2 = 3000.00;


    public static double getSavingsBalance() {
        return savingsBalance;
    }

    public static void setSavingsBalance(double savingsBalance) {
        SavingsAccount.savingsBalance = savingsBalance;


    }

     static void modifyInterestRate(double percent){

     annualInterestRate = percent;
     calculateMonthlyInterest(annualInterestRate);

    }
    static double calculateMonthlyInterest(double annualInterestRate){
       double savings = ((savingsBalance*annualInterestRate)/12);
        setSavingsBalance(savings);
        return getSavingsBalance();
    }


}
