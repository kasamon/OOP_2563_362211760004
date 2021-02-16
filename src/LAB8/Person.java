package LAB8;

public class Person {
    //Class Attributes
    private  String pid;  //เลขบัตรประชาชน
    private  String name;
    private int age;
    private String gender;
    private String tel;

    //constructors

    public Person() {
    }

    public Person(String pid, String name, int age, String gender, String tel) {
        this.pid = pid;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.tel = tel;
    }
    //setter

    public String getTel() {
        return tel;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    //getter

    public String getPid() {
        return pid;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
    //toString()
    @Override
    public String toString() {
        return "Person{" +
                "pid='" + pid + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
