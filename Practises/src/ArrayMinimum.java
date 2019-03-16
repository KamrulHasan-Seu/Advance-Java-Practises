import java.util.Scanner;

public class ArrayMinimum {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Numbers: ");
        for (int i = 0;i < array.length;i++){
            array[i] = input.nextInt();
        }
        /*
        Finding maximum value along entered all values
        */
        int max = array[0];   //suppose,firstly initialized that 0 index has most max value

        for (int j =0 ; j<array.length ;j++){
            if(array[j]<max){
                max = array[j];
            }
        }
        System.out.println(max);
    }
}
