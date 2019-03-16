public class Main {
    public static void main(String[] args) {
        String password1 = "kamrul123";
        String password2 = "kamrul123";
        String password3 = new String("kamrul123");
        String password4 = new String("kamrul123");
        //First case

        System.out.println(password1==password2);
        System.out.println(password1==password3);
        System.out.println(password1==password4);

    //Second Case
        System.out.println(password1.equals(password2));
        System.out.println(password1.equals(password3));
        System.out.println(password3.equals(password4 ));

    }
}
