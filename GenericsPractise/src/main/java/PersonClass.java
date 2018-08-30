public class PersonClass {
    private String name;
    private String sex;
    private int age;

  public PersonClass(){};
    public PersonClass(String name, String sex, int age) {
        this.setName(name);
        this.setSex(sex);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
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
        return
                ("name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age);
    }
}
