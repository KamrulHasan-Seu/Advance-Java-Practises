import java.util.Scanner;


 class RationalClass {



    public int rational(int a,int b){

        if(b == 0)
            return a;
        else
            return rational(b,a%b);
    }

    public void getResult(int num1,int num2){
        int i,j;
        int rationalResult = rational(num1,num2);
        i = num1/rationalResult;
        j = num2/rationalResult;

        System.out.println("Rational Number is:"+ i +"/"+j);
    }
    public double getResult1(int num1,int num2){
        double i,j;
        int rationalResult = rational(num1,num2);
        i = num1/rationalResult;
        j = num2/rationalResult;
        return (i/j);
    }
}
