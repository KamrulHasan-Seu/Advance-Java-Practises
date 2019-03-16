import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count =1;

        do{

                try {
                    Scanner sc = new Scanner(System.in);

                    System.out.print("Enter num1:");
                    int num1 = sc.nextInt();

                    System.out.print("Enter num2:");
                    int num2 = sc.nextInt();

                    System.out.println("Result:"+num1+"/"+num2+"="+num1/num2);
                    count = 2;
                }
                catch (Exception e){
                    System.out.println("Exception:"+e);
                }

        }

        while(count==1);
    }
}
