public class AccessingPrivateMember {
    public static void main(String[] args) {
        SubClass sc = new SubClass();

        sc.setName("Kamrul Hasan");
        sc.setAge(23);

        System.out.println(sc.getName());
        System.out.println(sc.getAge());
    }

}
class SubClass{
    private String name;
    private int age;
    /*
    to access private variables from sub class we should made a getter and setter method.
    setter  method to set value from outside class
    getter method for get value to print
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
