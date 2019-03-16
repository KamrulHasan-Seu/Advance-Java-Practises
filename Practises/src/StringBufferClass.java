public class StringBufferClass {
    public static void main(String[] args) {
        /*
        if we concate or use any method that should put in another String that hold the method.
        The advantage of StringBuffer is here you do not need any other String to hold.

        Use it Without use other Variables
         */
        String s1 = "Kamrul";
        StringBuffer sb = new StringBuffer(s1);

        sb.append(" hasan");//just like ccncate
        System.out.println("Your name is : " +sb);

        sb.append(317325);
        System.out.println(sb);

        sb.delete(11,16);
        System.out.println("After deleting index: "+ sb);
    }
}
