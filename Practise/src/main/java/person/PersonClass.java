package person;

public class PersonClass {
    private String name;
    private Sex sex;
    private int  age;

    public PersonClass(){

    }

    public PersonClass(String name, Sex sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return ("Name: " + getName() +
                " person.Sex: " + getSex() +
                " Age: " + getAge());
    }
}
