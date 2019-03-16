public class GenericClass {
    public static void main(String[] args) {
       GenericDemo <Integer> IntBox = new GenericDemo<Integer>();
        GenericDemo <String> StringBox = new GenericDemo<String>();

        IntBox.add(10);
        StringBox.add("Kamrul");

        System.out.println(IntBox.get());
        System.out.println(StringBox.get());

        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.1, 3.1, 4.1, 5.1};
        Character[] charArray = {'A', 'B', 'c'};

        System.out.println("Integer Content; ");
        GenericMethodTest.printArray(intArray);
        System.out.println("Double  Content; ");
        GenericMethodTest.printArray(doubleArray);
        System.out.println("Character Content; ");
        GenericMethodTest.printArray(charArray);
    }
}

class GenericDemo<T>{

   private T n;

   public void add(T p){
       this.n = p;
   }

   public T get(){
       return n;
   }
}
class GenericMethodTest {
    public static  <E> void printArray(E[] inputArray) {

        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

}
