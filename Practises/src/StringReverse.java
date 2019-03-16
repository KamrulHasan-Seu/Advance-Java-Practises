public class StringReverse {
    public static void main(String[] args) {
        String s1= "madam";

        StringBuffer sb = new StringBuffer(s1);
        String s2 = sb.reverse().toString();
        if(s2.equals(s1)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
