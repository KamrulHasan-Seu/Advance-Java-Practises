public class Array {
    public static void main(String[] args) {
        int[] number = new int[5];
        number[0] = 5;
        number[1] = 6;
        number[2] = 7;
        number[3] = 8;
        number[4] =9;

        int sum = number[0]+number[1]+number[2]+number[3]+number[4];
        System.out.println(sum);//to see Sum of array index

        int len = number.length;
        System.out.println(len);//to see the length of expecting array

    }
}
